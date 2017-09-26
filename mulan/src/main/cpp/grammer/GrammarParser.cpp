//
// Created by chan on 2017/9/5.
//

#include "GrammarParser.h"
#include <algorithm>

GrammarParser::GrammarParser(const TokenStream &mTokenStream)
        : mTokenStream(mTokenStream) {}

void GrammarParser::registerRenderer(MiddlewareRenderer *renderer) {
    mRenderers.push_back(renderer);
}

void GrammarParser::unregisterRenderer(MiddlewareRenderer *renderer) {
    for (MiddlewareRendererContainer::iterator iterator = mRenderers.begin();
         iterator != mRenderers.end();
         ++iterator) {
        if (*iterator == renderer) {
            mRenderers.erase(iterator);
            return;
        }
    }
}

void GrammarParser::parse() {
    std::for_each(mRenderers.cbegin(), mRenderers.cend(), [](MiddlewareRenderer *renderer) {
        renderer->begin();
    });

    for (Iterator iterator = mTokenStream.cbegin();
         iterator < mTokenStream.cend(); ++iterator) {
        Token *token = *iterator;
        if (token->type == SYMBOL_TYPE::HASH) {
            handleHash(iterator);
        } else if (token->type == SYMBOL_TYPE::STAR) {
            handleStar(iterator);
        } else if (token->type == SYMBOL_TYPE::NUMBER) {
            handleNumber(iterator);
        } else if (token->type == SYMBOL_TYPE::NEW_LINE) {
            handleNewLine();
        } else if (token->type == SYMBOL_TYPE::REFERENCE) {
            handleReference(iterator);
        } else if (token->type == SYMBOL_TYPE::DASHES) {
            handleDashes(iterator);
        } else if (token->type == SYMBOL_TYPE::EXCLAMATION_MARK) {
            handleExclamationMark(iterator);
        } else if (token->type == SYMBOL_TYPE::LEFT_SQUARE_BRACKETS) {
            handleLeftSquareBrackets(iterator);
        } else {
            handleString(iterator);
        }
    }

    std::for_each(mRenderers.cbegin(), mRenderers.cend(), [](MiddlewareRenderer *renderer) {
        renderer->end();
    });
}

void GrammarParser::handleHash(Iterator &it) {
    if (isLineFirst(it) &&
        checkToken(it, 1, SYMBOL_TYPE::BLANK) &&
        checkToken(it, 2, SYMBOL_TYPE::STRING) && checkToken(it, 3, SYMBOL_TYPE::NEW_LINE)) {

        RENDERER_UNIT unit = RENDERER_UNIT::TITLE_5;
        switch ((*it)->text.size()) {
            case 1:
                unit = RENDERER_UNIT::TITLE_1;
                break;
            case 2:
                unit = RENDERER_UNIT::TITLE_2;
                break;
            case 3:
                unit = RENDERER_UNIT::TITLE_3;
                break;
            case 4:
                unit = RENDERER_UNIT::TITLE_4;
                break;
            default:
                break;
        }

        //将读取指针后移
        Iterator nextToken = it + 2;
        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderTitle(unit, (*nextToken)->text);
        });
        it += 3;
        return;
    }

    handleError(it);
}

void GrammarParser::handleStar(Iterator &it) {
    if (!checkToken(it, 1, SYMBOL_TYPE::STRING) && !checkToken(it, 1, SYMBOL_TYPE::STAR)) {
        handleString(it);
        return;
    }

    //如果下一个单词也是star 那么就当错误处理，吃掉状态
    if (checkToken(it, 1, SYMBOL_TYPE::STAR)) {
        ++it;
        return;
    }

    if (checkToken(it, 1, SYMBOL_TYPE::STRING) && checkToken(it, 2, SYMBOL_TYPE::STAR)) {

        RENDERER_UNIT unit = RENDERER_UNIT::BOLD;
        if ((*it)->text.size() == 1) {
            unit = RENDERER_UNIT::ITALIC;
        }

        Iterator nextToken = it + 1;
        it += 2;

        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderTypeface(unit, (*nextToken)->text);
        });
        return;
    }

    handleError(it);
}

void GrammarParser::handleString(Iterator &it) {
    std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
        renderer->renderTexture((*it)->text);
    });

    if (isLineEnd(it, 1)) {
        ++it;
    }
}

void GrammarParser::handleNumber(Iterator &it) {
    if (isLineFirst(it) &&
        checkToken(it, 1, SYMBOL_TYPE::DOT) &&
        checkToken(it, 2, SYMBOL_TYPE::BLANK) &&
        checkToken(it, 3, SYMBOL_TYPE::STRING) &&
        isLineEnd(it, 4)) {

        Iterator nextToken = it + 3;
        //render order list
        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderOrderedList((*it)->text, (*nextToken)->text);
        });
        it += 4;
        return;
    }

    handleError(it);
}

inline bool GrammarParser::isLineFirst(Iterator &it) {
    if (it == mTokenStream.cbegin()) {
        return true;
    }

    return checkToken(it, -1, SYMBOL_TYPE::NEW_LINE);
}

void GrammarParser::handleNewLine() {
    std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
        renderer->renderNewLine();
    });
}

bool GrammarParser::checkToken(Iterator &it, int offset, SYMBOL_TYPE type) {
    Iterator target = it + offset;
    if (target < mTokenStream.cbegin() || target >= mTokenStream.cend()) {
        return false;
    }

    return (*target)->type == type;
}

void GrammarParser::handleReference(Iterator &it) {
    if (isLineFirst(it) &&
        checkToken(it, 1, SYMBOL_TYPE::BLANK) &&
        checkToken(it, 2, SYMBOL_TYPE::STRING) &&
        isLineEnd(it, 3)) {
        Iterator nextToken = it + 2;
        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderReference((*nextToken)->text);
        });
        it += 3;
        return;
    }

    handleError(it);
}

void GrammarParser::handleDashes(Iterator &it) {
    if (isLineFirst(it) &&
        checkToken(it, 1, SYMBOL_TYPE::BLANK) &&
        checkToken(it, 2, SYMBOL_TYPE::STRING) &&
        isLineEnd(it, 3)) {
        Iterator nextToken = it + 2;
        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderUnorderedList((*nextToken)->text);
        });
        it += 3;
        return;
    }

    handleError(it);
}

void GrammarParser::handleExclamationMark(Iterator &it) {
    if (isLineFirst(it) &&
        checkToken(it, 1, SYMBOL_TYPE::LEFT_SQUARE_BRACKETS) &&
        checkToken(it, 2, SYMBOL_TYPE::STRING) &&
        checkToken(it, 3, SYMBOL_TYPE::RIGHT_SQUARE_BRACKETS) &&
        checkToken(it, 4, SYMBOL_TYPE::LEFT_PARENTHESES) &&
        checkToken(it, 5, SYMBOL_TYPE::STRING) &&
        checkToken(it, 6, SYMBOL_TYPE::RIGHT_PARENTHESES)) {
        Iterator label = it + 2;
        Iterator url = it + 5;
        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderImage((*label)->text, (*url)->text);
        });
        it = url;
        return;
    }

    handleError(it);
}

void GrammarParser::handleLeftSquareBrackets(Iterator &it) {
    if (isLineFirst(it) &&
        checkToken(it, 1, SYMBOL_TYPE::STRING) &&
        checkToken(it, 2, SYMBOL_TYPE::RIGHT_SQUARE_BRACKETS) &&
        checkToken(it, 3, SYMBOL_TYPE::LEFT_PARENTHESES) &&
        checkToken(it, 4, SYMBOL_TYPE::STRING) &&
        checkToken(it, 5, SYMBOL_TYPE::RIGHT_PARENTHESES)) {
        Iterator label = it + 1;
        Iterator url = it + 4;
        std::for_each(mRenderers.begin(), mRenderers.end(), [&](MiddlewareRenderer *renderer) {
            renderer->renderLink((*label)->text, (*url)->text);
        });
        it = url;
        return;
    }

    handleError(it);
}

bool GrammarParser::isLineEnd(Iterator &it, int offset) {
    Iterator nextToken = it + offset;
    return checkToken(it, offset, SYMBOL_TYPE::NEW_LINE) || nextToken >= mTokenStream.cend();
}

void GrammarParser::handleError(Iterator &it) {

    //if the token stream is empty
    //just ignore the error
    if (mTokenStream.empty()) {
        return;
    }

    Token *token = mTokenStream.back();
    if (token->type == SYMBOL_TYPE::STRING ||
            token->type == SYMBOL_TYPE::REFERENCE) {
        token->text.append((*it)->text);
        return;
    }

    //other
    //ignore error
}
