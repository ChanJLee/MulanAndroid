//
// Created by chan on 2017/9/21.
//

#ifndef MULANANDROID_STRINGHOLDER_H
#define MULANANDROID_STRINGHOLDER_H

#include <jni.h>
#include "../token/Token.h"

class JavaString2RawStringHolder {
    const char *mRawString;
    jstring &mJavaString;
    JNIEnv* mJNIEnv;
public:
    JavaString2RawStringHolder(JNIEnv *, jstring &);

    Text toRawString();

    virtual ~JavaString2RawStringHolder();
};


#endif //MULANANDROID_STRINGHOLDER_H
