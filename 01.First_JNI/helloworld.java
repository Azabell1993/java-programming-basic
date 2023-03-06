public class helloworld {
    static {
        System.loadLibrary("helloworld");
    }
 
    private static native void print();
 
    public static void main(String[] args) {
        helloworld.print();
    }
}

/*
 * 
 * $env:JAVA_HOME="C:\Program Files\Java\jdk-11.0.16.1"
>> $env:PATH+=";$env:JAVA_HOME\bin"
>> $env:CLASSPATH=".;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar"
>> javac helloworld.java
>> gcc -fPIC -I"$env:JAVA_HOME\include" -I"$env:JAVA_HOME\include\win32" -shared -o helloworld.dll helloworld.c
>> java helloworld
Exception in thread "main" java.lang.UnsatisfiedLinkError: helloworld.print()V
        at helloworld.print(Native Method)
        at helloworld.main(helloworld.java:9)
        
 */