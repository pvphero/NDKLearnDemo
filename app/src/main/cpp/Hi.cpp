//
// Created by 丶游憩 on 18/2/9.
//

#include "com_vv_ndk_Hi.h"
JNIEXPORT jstring JNICALL Java_com_vv_ndk_Hi_sayHi(JNIEnv *env, jclass jclass1){
    return env->NewStringUTF("sat Hi");
}