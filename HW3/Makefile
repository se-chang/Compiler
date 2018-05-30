all: testChecker.class

testChecker.class: testChecker.java myChecker.java
	javac -cp ./antlr-3.5.2-complete.jar:. testChecker.java

myChecker.java: myChecker.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g

test1: testChecker.class
	java -cp ./antlr-3.5.2-complete.jar:. testChecker input01.c
	make clear
test2: testChecker.class
	java -cp ./antlr-3.5.2-complete.jar:. testChecker input02.c

test3: testChecker.class
	java -cp ./antlr-3.5.2-complete.jar:. testChecker input03.c

test4: testChecker.class
	java -cp ./antlr-3.5.2-complete.jar:. testChecker input04.c

clear:
	rm *.class myCheckerLexer.java myCheckerParser.java myChecker.tokens
