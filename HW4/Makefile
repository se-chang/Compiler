all: myCompiler_test.class
myCompiler_test.class: myCompiler.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete.jar myCompilerLexer.java myCompilerParser.java myCompiler_test.java register.java
test1: myCompiler_test.class
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test input1.c > input1.s
	gcc input1.s -o input1.out
	./input1.out
test2: myCompiler_test.class
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test input2.c > input2.s
	gcc input2.s -o input2.out
	./input2.out
test3: myCompiler_test.class
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test input3.c > input3.s
	gcc input3.s -o input3.out
	./input3.out
clear:
	rm myCompiler.tokens myCompilerLexer.java myCompilerParser.java *.class *.s *.out
