//
// Created by chan on 2017/9/5.
//

#ifndef MARKDOWNPARSER_GRAMMERPARSER_H
#define MARKDOWNPARSER_GRAMMERPARSER_H


#include "../token/Token.h"
#include "../render/MiddlewareRenderer.h"
#include <vector>

typedef std::vector<MiddlewareRenderer *> MiddlewareRendererContainer;
typedef TokenStream::const_iterator Iterator;

class GrammarParser
{
	const TokenStream &mTokenStream;
	MiddlewareRendererContainer mRenderers;
public:
	GrammarParser(const TokenStream &mTokenStream);

	void registerRenderer(MiddlewareRenderer *renderer);
	void unregisterRenderer(MiddlewareRenderer *renderer);

	void parse();
private:
	void handleHash(Iterator &it);
	void handleStar(Iterator &it);
	void handleString(Iterator &it);
	void handleNumber(Iterator &it);
	bool isLineFirst(Iterator &it);
	bool isLineEnd(Iterator &it, int offset);
	void handleNewLine();
	bool checkToken(Iterator &it, int offset, SYMBOL_TYPE type);
	void handleReference(Iterator &it);
	void handleDashes(Iterator &it);
	void handleExclamationMark(Iterator &it);
	void handleLeftSquareBrackets(Iterator &it);
	void handleError(Iterator& it);
};


#endif //MARKDOWNPARSER_GRAMMERPARSER_H
