//
// Created by chan on 2017/9/23.
//

#ifndef MULANANDROID_RAWSTRING2JAVASTRINGHOLDER_H
#define MULANANDROID_RAWSTRING2JAVASTRINGHOLDER_H

#include <jni.h>
#include "../token/Token.h"

class RawString2JavaStringHolder {
private:
    JNIEnv *mJNIEnv;
    jstring mJString;
public:
    RawString2JavaStringHolder(JNIEnv *mJNIEnv, const Text &);

    jstring toJstring();

    ~RawString2JavaStringHolder();
};


#endif //MULANANDROID_RAWSTRING2JAVASTRINGHOLDER_H
