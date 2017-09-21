//
// Created by chan on 2017/9/21.
//

#include "JavaString2RawStringHolder.h"

JavaString2RawStringHolder::~JavaString2RawStringHolder() {
    (*mJNIEnv).ReleaseStringUTFChars(mJavaString, mRawString);
}

JavaString2RawStringHolder::JavaString2RawStringHolder(JNIEnv *env, jstring &javaString) :
        mJavaString(javaString), mJNIEnv(env) {
    mRawString = (*mJNIEnv).GetStringUTFChars(javaString, nullptr);
}
