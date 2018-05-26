all: testParser.class

testParser.class: testParser.java myParser.java
	javac -cp ./antlr-3.5.2-complete.jar:. testParser.java

myParser.java: myParser.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myParser.g

test1: testParser.class
	java -cp ./antlr-3.5.2-complete.jar:. testParser input01.c

test2: testParser.class
	java -cp ./antlr-3.5.2-complete.jar:. testParser input02.c

test3: testParser.class
	java -cp ./antlr-3.5.2-complete.jar:. testParser input03.c

test4: testParser.class
	java -cp ./antlr-3.5.2-complete.jar:. testParser input04.c

clear:
	rm *.class myParserLexer.java myParserParser.java myParser.tokens
