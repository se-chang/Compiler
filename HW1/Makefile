all: testLexer.class

testLexer.class: testLexer.java myLexer.java
	javac -cp ./antlr-3.5.2-complete.jar testLexer.java myLexer.java

myLexer.java: myLexer.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myLexer.g

test1: testLexer.class
	java -cp ./antlr-3.5.2-complete.jar:. testLexer input01.c

test2: testLexer.class
	java -cp ./antlr-3.5.2-complete.jar:. testLexer input02.c

test3: testLexer.class
	java -cp ./antlr-3.5.2-complete.jar:. testLexer input03.c

test4: testLexer.class
	java -cp ./antlr-3.5.2-complete.jar:. testLexer input04.c

clear:
	rm *.class *.tokens myLexer.java
