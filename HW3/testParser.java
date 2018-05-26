import org.antlr.runtime.*;

public class testParser {
    public static void main(String[] args) throws Exception {
        
        CharStream input = new ANTLRFileStream(args[0]);
        myParserLexer lexer = new myParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        myParserParser parser = new myParserParser(tokens);
        parser.program();
    }
}
