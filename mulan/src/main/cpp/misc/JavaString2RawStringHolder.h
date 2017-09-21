//
// Created by chan on 2017/9/21.
//

#ifndef MULANANDROID_STRINGHOLDER_H
#define MULANANDROID_STRINGHOLDER_H

#include <jni.h>
#include "../token/Token.h"

class JavaString2RowStringHolder {
    const char *mRawString;
    jstring &mJavaString;
    JNIEnv* mJNIEnv;
public:
    JavaString2RowStringHolder(JNIEnv *, jstring &);

    virtual ~JavaString2RowStringHolder();
};


#endif //MULANANDROID_STRINGHOLDER_H
