# java-programming-basic
------------------------------------------------------------------------------
>  
>  
>    Developer : Azabell1993 Github master  
>    Created   : 2023-03-07  
>    Purpose   : C code -> Java
>   
>  
--------------------------------------------------------------------------------
This Repository to practice using C and JAVA simultaneously so that code written in C can be used in Java.
these code made who @Azabell1993.

I will write at annotation only of ENGLISH. 

I made basic c-lange structure pointer example code, these has annotation of KOREAN.  
(here is it. https://github.com/Azabell1993/ClangStructPointerExample)
--------------------------------------------------------------------------------
## To use JNI you need to do the following steps:
---  

1. Write C/C++ code: Use JNI to write functions to be called. This function must be written in C/C++ and uses the JNI API to interact with Java.  
2. Header File Generation: Use javah to generate header files for C/C++ functions using native interfaces of the JNI API.  
3. Build C/C++ Code: Build a dynamic library using header files and C/C++ code.  
4. Write Java code: Write Java code that calls JNI functions.  
5. Build Java Code: Compile your Java code.  

Execution: Executes Java code and calls JNI functions.  
---  
  
#### Looking at these steps in more detail:  
  
1. Write C/C++ code  
Write C/C++ functions to be called using JNI. These functions are typically written in C/C++ libraries and interact with Java using the JNI API.  
2. Generate header file  
You must use the raw interface of the JNI API to generate header files for C/C++ functions. Use the javah tool to generate header files. javah extracts JNI functions from Java class files and generates native header files for those functions.  
  
For example, suppose the class com.example.HelloWorld has a JNI function called hello(). You can then generate the header file with the command:  
  
> javah -jni com.example.HelloWorld    
  
This command creates the file com/example/HelloWorld.h. This file is used when calling JNI functions from C/C++ code.  
  
3. Building C/C++ code  
To build C/C++ code, you need to generate a dynamic library using source code along with header files. Libraries usually have the extension .so   (Linux), .dll (Windows), or .dylib (macOS).  
  
4. Write Java code  
Write Java code that calls JNI functions. This code is usually written in Java. This code calls a C/C++ function using a generated header file.  
  
5. Build Java code  
Compile your Java code to generate .class files.  
  
6. execution  
Executes Java code and calls JNI functions. At this time, the library path must be specified. For example, on Linux, you can use the LD_LIBRARY_PATH environment variable to specify the library path.  
    
--------------------------------------------------------------------------------  

