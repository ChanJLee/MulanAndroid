//
// Created by chan on 2017/9/19.
//

#ifndef MARKDOWNPARSER_ANDROIDRENDERER_H
#define MARKDOWNPARSER_ANDROIDRENDERER_H

#include <jni.h>
#include "MiddlewareRenderer.h"

class AndroidRenderer : public MiddlewareRenderer {
    JNIEnv *mJNIEnv;
    jobject &mJavaRenderer;
    jclass mJavaClass;
    jmethodID mBeginId;
    jmethodID mEndId;
    jmethodID mRenderTitleId;
    jmethodID mRenderTextureId;
    jmethodID mRenderTypefaceId;
    jmethodID mRenderOrderedListId;
    jmethodID mRenderUnorderedListId;
    jmethodID mRenderNewLineId;
    jmethodID mRenderLinkId;
    jmethodID mRenderImageId;
    jmethodID mRenderReferenceId;

    jint mTitleSize1;
    jint mTitleSize2;
    jint mTitleSize3;
    jint mTitleSize4;
    jint mTitleSize5;

    jint mTypefaceBold;
    jint mTypefaceItalic;

public:
    AndroidRenderer(JNIEnv *mJNIEnv, jobject &mJavaRenderer);

    void begin() override;

    void end() override;

    void renderTitle(RENDERER_UNIT unit, const Text &content) override;

    void renderTexture(const Text &content) override;

    void renderTypeface(RENDERER_UNIT unit, const Text &content) override;

    void renderOrderedList(const Text &num, const Text &content) override;

    void renderUnorderedList(const Text &content) override;

    void renderNewLine() override;

    void renderImage(const Text &label, const Text &url) override;

    void renderLink(const Text &label, const Text &url) override;

    void renderReference(const Text &content, bool append) override;

};

#endif //MARKDOWNPARSER_ANDROIDRENDERER_H
