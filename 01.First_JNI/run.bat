$env:JAVA_HOME="C:\Program Files\Java\jdk-11.0.16.1"
$env:PATH+=";$env:JAVA_HOME\bin"
$env:CLASSPATH=".;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar"
javac helloworld.java
gcc -fPIC -I"$env:JAVA_HOME\include" -I"$env:JAVA_HOME\include\win32" -shared -o helloworld.dll helloworld.c
java helloworld