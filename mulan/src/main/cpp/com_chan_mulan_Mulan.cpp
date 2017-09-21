//
// Created by chan on 2017/9/21.
//

#include "com_chan_mulan_Mulan.h"
#include "grammer/GrammarParser.h"
#include "lexica/LexicalParser.h"

extern "C" {
#endif
/*
 * Class:     com_chan_mulan_Mulan
 * Method:    render
 * Signature: (Ljava/lang/String;Lcom/chan/mulan/renderer/MarkdownRenderer;)V
 */
JNIEXPORT void JNICALL Java_com_chan_mulan_Mulan_render
        (JNIEnv *env, jclass thiz, jstring markdown, jobject renderer) {
    LexicalParser lexicalParser("");
}

#ifdef __cplusplus
}