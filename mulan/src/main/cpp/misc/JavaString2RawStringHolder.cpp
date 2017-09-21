//
// Created by chan on 2017/9/21.
//

#include "JavaString2RawStringHolder.h"

JavaString2RowStringHolder::~JavaString2RowStringHolder() {
    (*mJNIEnv).ReleaseStringUTFChars(mJavaString, mRawString);
}

JavaString2RowStringHolder::JavaString2RowStringHolder(JNIEnv *env, jstring &javaString) :
        mJavaString(javaString), mJNIEnv(env) {
    mRawString = (*mJNIEnv).GetStringUTFChars(javaString, nullptr);
}
