import org.antlr.runtime.*;

public class testChecker {
    public static void main(String[] args) throws Exception {
        
        CharStream input = new ANTLRFileStream(args[0]);
        myCheckerLexer lexer = new myCheckerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        myCheckerParser Parser = new myCheckerParser(tokens);
        Parser.program();
    }
}
