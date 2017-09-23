//
// Created by chan on 2017/9/21.
//

#include "com_chan_mulan_Mulan.h"
#include "grammer/GrammarParser.h"
#include "lexica/LexicalParser.h"
#include "misc/JavaString2RawStringHolder.h"
#include "render/AndroidRenderer.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_chan_mulan_Mulan
 * Method:    render
 * Signature: (Ljava/lang/String;Lcom/chan/mulan/renderer/MarkdownRenderer;)V
 */
JNIEXPORT void JNICALL Java_com_chan_mulan_Mulan_render
        (JNIEnv *env, jclass, jstring markdown, jobject renderer) {
    JavaString2RawStringHolder javaString2RawStringHolder(env, markdown);
    LexicalParser lexicalParser(javaString2RawStringHolder.toRawString());
    TokenStream tokenStream = lexicalParser.build();
    GrammarParser grammarParser(tokenStream);
    MiddlewareRenderer *middlewareRenderer = new AndroidRenderer(env, renderer);
    grammarParser.registerRenderer(middlewareRenderer);
    grammarParser.parse();
    grammarParser.unregisterRenderer(middlewareRenderer);
    delete middlewareRenderer;
}

#ifdef __cplusplus
}
#endif