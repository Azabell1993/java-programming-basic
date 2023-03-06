#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_HelloWorld_print(JNIEnv *env, jobject obj) {
    printf("Hello, World!\n");
    return;
}

// gcc -fPIC -I"C:\Program Files\Java\jdk-11.0.16.1\include" -I"C:\Program Files\Java\jdk-11.0.16.1\include\win32" -shared -o libhelloworld.so helloworld.c
// javac HelloWorld.java
