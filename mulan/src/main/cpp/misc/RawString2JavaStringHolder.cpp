//
// Created by chan on 2017/9/23.
//

#include "RawString2JavaStringHolder.h"


RawString2JavaStringHolder::RawString2JavaStringHolder(JNIEnv *mJNIEnv, const Text &rawString)
        : mJNIEnv(mJNIEnv) {
    mJString = mJNIEnv->NewStringUTF(rawString.c_str());
}

RawString2JavaStringHolder::~RawString2JavaStringHolder() {
    mJNIEnv->DeleteLocalRef(mJString);
}

jstring RawString2JavaStringHolder::toJstring() {
    return mJString;
}
