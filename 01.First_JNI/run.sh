gcc -fPIC -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -o libhelloworld.so helloworld.c
javac HelloWorld.java
java -Djava.library.path=. HelloWorld
