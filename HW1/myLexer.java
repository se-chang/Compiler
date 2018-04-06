// $ANTLR 3.5.2 myLexer.g 2018-04-06 19:45:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND_=4;
	public static final int AND_OP=5;
	public static final int ASSIGN_OP=6;
	public static final int BIT_OR_OP=7;
	public static final int BL_BRACK=8;
	public static final int BREAK_=9;
	public static final int BR_BRACK=10;
	public static final int CASE_=11;
	public static final int CHAR_=12;
	public static final int CHAR_TYPE=13;
	public static final int COLON_=14;
	public static final int COMMA_=15;
	public static final int COMMENT1=16;
	public static final int COMMENT2=17;
	public static final int CONTINUE_=18;
	public static final int DEC_NUM=19;
	public static final int DEFAULT_=20;
	public static final int DIGIT=21;
	public static final int DIVID_E_OP=22;
	public static final int DIVID_OP=23;
	public static final int DOUBLE_TYPE=24;
	public static final int ELSE_=25;
	public static final int EQ_OP=26;
	public static final int FLOAT_NUM=27;
	public static final int FLOAT_NUM1=28;
	public static final int FLOAT_NUM2=29;
	public static final int FLOAT_NUM3=30;
	public static final int FLOAT_TYPE=31;
	public static final int FOR_=32;
	public static final int GE_OP=33;
	public static final int GT_OP=34;
	public static final int ID=35;
	public static final int IF_=36;
	public static final int INT_TYPE=37;
	public static final int LETTER=38;
	public static final int LE_OP=39;
	public static final int LONG_TYPE=40;
	public static final int LSHIFT_OP=41;
	public static final int LT_OP=42;
	public static final int MINUS_E_OP=43;
	public static final int MINUS_OP=44;
	public static final int ML_BRACK=45;
	public static final int MM_OP=46;
	public static final int MOD_E_OP=47;
	public static final int MOD_OP=48;
	public static final int MR_BRACK=49;
	public static final int MULTI_E_OP=50;
	public static final int MULTI_OP=51;
	public static final int NEW_LINE=52;
	public static final int NE_OP=53;
	public static final int NOT_OP=54;
	public static final int OR_OP=55;
	public static final int PLUS_E_OP=56;
	public static final int PLUS_OP=57;
	public static final int PP_OP=58;
	public static final int PRE_PROCESS=59;
	public static final int QUESTION_=60;
	public static final int RETURN_=61;
	public static final int RSHIFT_OP=62;
	public static final int SEMIC_=63;
	public static final int SHORT_TYPR=64;
	public static final int SL_BRACK=65;
	public static final int SR_BRACK=66;
	public static final int STRING_=67;
	public static final int SWITCH_=68;
	public static final int VOID_TYPE=69;
	public static final int WHILE_=70;
	public static final int WS=71;
	public static final int XOR_OP=72;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myLexer() {} 
	public myLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myLexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:10:11: ( 'int' )
			// myLexer.g:10:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:11:11: ( 'char' )
			// myLexer.g:11:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:12:11: ( 'void' )
			// myLexer.g:12:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:13:11: ( 'float' )
			// myLexer.g:13:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:14:13: ( 'double' )
			// myLexer.g:14:15: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:15:11: ( 'long' )
			// myLexer.g:15:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "SHORT_TYPR"
	public final void mSHORT_TYPR() throws RecognitionException {
		try {
			int _type = SHORT_TYPR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:16:12: ( 'short' )
			// myLexer.g:16:14: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPR"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:17:11: ( 'while' )
			// myLexer.g:17:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:18:11: ( 'for' )
			// myLexer.g:18:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:19:11: ( 'if' )
			// myLexer.g:19:13: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:20:11: ( 'else' )
			// myLexer.g:20:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_"

	// $ANTLR start "SWITCH_"
	public final void mSWITCH_() throws RecognitionException {
		try {
			int _type = SWITCH_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:21:11: ( 'switch' )
			// myLexer.g:21:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_"

	// $ANTLR start "CASE_"
	public final void mCASE_() throws RecognitionException {
		try {
			int _type = CASE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:22:11: ( 'case' )
			// myLexer.g:22:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_"

	// $ANTLR start "BREAK_"
	public final void mBREAK_() throws RecognitionException {
		try {
			int _type = BREAK_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:23:11: ( 'break' )
			// myLexer.g:23:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_"

	// $ANTLR start "DEFAULT_"
	public final void mDEFAULT_() throws RecognitionException {
		try {
			int _type = DEFAULT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:24:11: ( 'default' )
			// myLexer.g:24:13: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT_"

	// $ANTLR start "CONTINUE_"
	public final void mCONTINUE_() throws RecognitionException {
		try {
			int _type = CONTINUE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:25:11: ( 'continue' )
			// myLexer.g:25:13: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_"

	// $ANTLR start "RETURN_"
	public final void mRETURN_() throws RecognitionException {
		try {
			int _type = RETURN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:26:9: ( 'return' )
			// myLexer.g:26:11: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:32:7: ( '==' )
			// myLexer.g:32:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:33:7: ( '<=' )
			// myLexer.g:33:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:34:7: ( '>=' )
			// myLexer.g:34:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:35:7: ( '!=' )
			// myLexer.g:35:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:36:7: ( '++' )
			// myLexer.g:36:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:37:7: ( '--' )
			// myLexer.g:37:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:38:11: ( '<<' )
			// myLexer.g:38:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:39:11: ( '>>' )
			// myLexer.g:39:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "LT_OP"
	public final void mLT_OP() throws RecognitionException {
		try {
			int _type = LT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:40:7: ( '<' )
			// myLexer.g:40:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_OP"

	// $ANTLR start "GT_OP"
	public final void mGT_OP() throws RecognitionException {
		try {
			int _type = GT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:41:7: ( '>' )
			// myLexer.g:41:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT_OP"

	// $ANTLR start "PLUS_OP"
	public final void mPLUS_OP() throws RecognitionException {
		try {
			int _type = PLUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:42:9: ( '+' )
			// myLexer.g:42:11: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_OP"

	// $ANTLR start "MINUS_OP"
	public final void mMINUS_OP() throws RecognitionException {
		try {
			int _type = MINUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:43:10: ( '-' )
			// myLexer.g:43:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_OP"

	// $ANTLR start "MULTI_OP"
	public final void mMULTI_OP() throws RecognitionException {
		try {
			int _type = MULTI_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:44:10: ( '*' )
			// myLexer.g:44:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTI_OP"

	// $ANTLR start "DIVID_OP"
	public final void mDIVID_OP() throws RecognitionException {
		try {
			int _type = DIVID_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:45:10: ( '/' )
			// myLexer.g:45:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVID_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:46:8: ( '%' )
			// myLexer.g:46:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:47:11: ( '=' )
			// myLexer.g:47:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "PLUS_E_OP"
	public final void mPLUS_E_OP() throws RecognitionException {
		try {
			int _type = PLUS_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:48:11: ( '+=' )
			// myLexer.g:48:13: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_E_OP"

	// $ANTLR start "MINUS_E_OP"
	public final void mMINUS_E_OP() throws RecognitionException {
		try {
			int _type = MINUS_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:49:12: ( '-=' )
			// myLexer.g:49:14: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_E_OP"

	// $ANTLR start "MULTI_E_OP"
	public final void mMULTI_E_OP() throws RecognitionException {
		try {
			int _type = MULTI_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:50:12: ( '*=' )
			// myLexer.g:50:14: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTI_E_OP"

	// $ANTLR start "DIVID_E_OP"
	public final void mDIVID_E_OP() throws RecognitionException {
		try {
			int _type = DIVID_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:51:12: ( '/=' )
			// myLexer.g:51:14: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVID_E_OP"

	// $ANTLR start "MOD_E_OP"
	public final void mMOD_E_OP() throws RecognitionException {
		try {
			int _type = MOD_E_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:52:10: ( '%=' )
			// myLexer.g:52:12: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_E_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:53:8: ( '&&' )
			// myLexer.g:53:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_OP"

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:54:7: ( '||' )
			// myLexer.g:54:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "BIT_OR_OP"
	public final void mBIT_OR_OP() throws RecognitionException {
		try {
			int _type = BIT_OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:55:11: ( '|' )
			// myLexer.g:55:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR_OP"

	// $ANTLR start "NOT_OP"
	public final void mNOT_OP() throws RecognitionException {
		try {
			int _type = NOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:56:8: ( '!' )
			// myLexer.g:56:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_OP"

	// $ANTLR start "XOR_OP"
	public final void mXOR_OP() throws RecognitionException {
		try {
			int _type = XOR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:57:8: ( '^' )
			// myLexer.g:57:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR_OP"

	// $ANTLR start "COMMA_"
	public final void mCOMMA_() throws RecognitionException {
		try {
			int _type = COMMA_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:58:8: ( ',' )
			// myLexer.g:58:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA_"

	// $ANTLR start "SEMIC_"
	public final void mSEMIC_() throws RecognitionException {
		try {
			int _type = SEMIC_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:59:8: ( ';' )
			// myLexer.g:59:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMIC_"

	// $ANTLR start "COLON_"
	public final void mCOLON_() throws RecognitionException {
		try {
			int _type = COLON_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:60:8: ( ':' )
			// myLexer.g:60:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON_"

	// $ANTLR start "QUESTION_"
	public final void mQUESTION_() throws RecognitionException {
		try {
			int _type = QUESTION_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:61:11: ( '?' )
			// myLexer.g:61:13: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_"

	// $ANTLR start "AMPERSAND_"
	public final void mAMPERSAND_() throws RecognitionException {
		try {
			int _type = AMPERSAND_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:62:12: ( '&' )
			// myLexer.g:62:14: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND_"

	// $ANTLR start "SL_BRACK"
	public final void mSL_BRACK() throws RecognitionException {
		try {
			int _type = SL_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:63:10: ( '(' )
			// myLexer.g:63:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_BRACK"

	// $ANTLR start "SR_BRACK"
	public final void mSR_BRACK() throws RecognitionException {
		try {
			int _type = SR_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:64:10: ( ')' )
			// myLexer.g:64:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SR_BRACK"

	// $ANTLR start "ML_BRACK"
	public final void mML_BRACK() throws RecognitionException {
		try {
			int _type = ML_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:65:10: ( '[' )
			// myLexer.g:65:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_BRACK"

	// $ANTLR start "MR_BRACK"
	public final void mMR_BRACK() throws RecognitionException {
		try {
			int _type = MR_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:66:10: ( ']' )
			// myLexer.g:66:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MR_BRACK"

	// $ANTLR start "BL_BRACK"
	public final void mBL_BRACK() throws RecognitionException {
		try {
			int _type = BL_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:67:10: ( '{' )
			// myLexer.g:67:12: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BL_BRACK"

	// $ANTLR start "BR_BRACK"
	public final void mBR_BRACK() throws RecognitionException {
		try {
			int _type = BR_BRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:68:10: ( '}' )
			// myLexer.g:68:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BR_BRACK"

	// $ANTLR start "PRE_PROCESS"
	public final void mPRE_PROCESS() throws RecognitionException {
		try {
			int _type = PRE_PROCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:70:13: ( '#' ( . )* '\\n' )
			// myLexer.g:70:15: '#' ( . )* '\\n'
			{
			match('#'); 
			// myLexer.g:70:18: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\n') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myLexer.g:70:19: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRE_PROCESS"

	// $ANTLR start "STRING_"
	public final void mSTRING_() throws RecognitionException {
		try {
			int _type = STRING_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:72:9: ( '\"' ( . )* '\"' )
			// myLexer.g:72:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// myLexer.g:72:14: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\"') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myLexer.g:72:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_"

	// $ANTLR start "CHAR_"
	public final void mCHAR_() throws RecognitionException {
		try {
			int _type = CHAR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:73:7: ( ( '\\'' ( . )* '\\'' ) )
			// myLexer.g:73:9: ( '\\'' ( . )* '\\'' )
			{
			// myLexer.g:73:9: ( '\\'' ( . )* '\\'' )
			// myLexer.g:73:10: '\\'' ( . )* '\\''
			{
			match('\''); 
			// myLexer.g:73:14: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\'') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myLexer.g:73:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\''); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:75:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myLexer.g:75:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myLexer.g:75:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myLexer.g:75:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myLexer.g:75:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myLexer.g:75:28: ( DIGIT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// myLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:77:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myLexer.g:77:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myLexer.g:77:14: ( LETTER | DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:79:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt7=3;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// myLexer.g:79:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myLexer.g:79:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myLexer.g:79:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myLexer.g:80:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myLexer.g:80:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myLexer.g:80:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match('.'); 
			// myLexer.g:80:33: ( DIGIT )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// myLexer.g:81:20: ( '.' ( DIGIT )+ )
			// myLexer.g:81:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myLexer.g:81:25: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// myLexer.g:82:20: ( ( DIGIT )+ )
			// myLexer.g:82:22: ( DIGIT )+
			{
			// myLexer.g:82:22: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:86:10: ( '//' ( . )* '\\n' )
			// myLexer.g:86:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myLexer.g:86:16: ( . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\n') ) {
					alt12=2;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myLexer.g:86:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:87:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myLexer.g:87:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myLexer.g:87:17: ( options {greedy=false; } : . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='*') ) {
					int LA13_1 = input.LA(2);
					if ( (LA13_1=='/') ) {
						alt13=2;
					}
					else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
						alt13=1;
					}

				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// myLexer.g:87:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:90:9: ( '\\n' )
			// myLexer.g:90:11: '\\n'
			{
			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myLexer.g:92:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// myLexer.g:93:16: ( '0' .. '9' )
			// myLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:96:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// myLexer.g:96:7: ( ' ' | '\\r' | '\\t' )+
			{
			// myLexer.g:96:7: ( ' ' | '\\r' | '\\t' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\t'||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// myLexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// myLexer.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | SHORT_TYPR | WHILE_ | FOR_ | IF_ | ELSE_ | SWITCH_ | CASE_ | BREAK_ | DEFAULT_ | CONTINUE_ | RETURN_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP | PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | ASSIGN_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | MOD_E_OP | AND_OP | OR_OP | BIT_OR_OP | NOT_OP | XOR_OP | COMMA_ | SEMIC_ | COLON_ | QUESTION_ | AMPERSAND_ | SL_BRACK | SR_BRACK | ML_BRACK | MR_BRACK | BL_BRACK | BR_BRACK | PRE_PROCESS | STRING_ | CHAR_ | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | WS )
		int alt15=64;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// myLexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// myLexer.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// myLexer.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// myLexer.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// myLexer.g:1:50: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 6 :
				// myLexer.g:1:62: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 7 :
				// myLexer.g:1:72: SHORT_TYPR
				{
				mSHORT_TYPR(); 

				}
				break;
			case 8 :
				// myLexer.g:1:83: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 9 :
				// myLexer.g:1:90: FOR_
				{
				mFOR_(); 

				}
				break;
			case 10 :
				// myLexer.g:1:95: IF_
				{
				mIF_(); 

				}
				break;
			case 11 :
				// myLexer.g:1:99: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 12 :
				// myLexer.g:1:105: SWITCH_
				{
				mSWITCH_(); 

				}
				break;
			case 13 :
				// myLexer.g:1:113: CASE_
				{
				mCASE_(); 

				}
				break;
			case 14 :
				// myLexer.g:1:119: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 15 :
				// myLexer.g:1:126: DEFAULT_
				{
				mDEFAULT_(); 

				}
				break;
			case 16 :
				// myLexer.g:1:135: CONTINUE_
				{
				mCONTINUE_(); 

				}
				break;
			case 17 :
				// myLexer.g:1:145: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 18 :
				// myLexer.g:1:153: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 19 :
				// myLexer.g:1:159: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 20 :
				// myLexer.g:1:165: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 21 :
				// myLexer.g:1:171: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 22 :
				// myLexer.g:1:177: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 23 :
				// myLexer.g:1:183: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 24 :
				// myLexer.g:1:189: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 25 :
				// myLexer.g:1:199: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 26 :
				// myLexer.g:1:209: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 27 :
				// myLexer.g:1:215: GT_OP
				{
				mGT_OP(); 

				}
				break;
			case 28 :
				// myLexer.g:1:221: PLUS_OP
				{
				mPLUS_OP(); 

				}
				break;
			case 29 :
				// myLexer.g:1:229: MINUS_OP
				{
				mMINUS_OP(); 

				}
				break;
			case 30 :
				// myLexer.g:1:238: MULTI_OP
				{
				mMULTI_OP(); 

				}
				break;
			case 31 :
				// myLexer.g:1:247: DIVID_OP
				{
				mDIVID_OP(); 

				}
				break;
			case 32 :
				// myLexer.g:1:256: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 33 :
				// myLexer.g:1:263: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 34 :
				// myLexer.g:1:273: PLUS_E_OP
				{
				mPLUS_E_OP(); 

				}
				break;
			case 35 :
				// myLexer.g:1:283: MINUS_E_OP
				{
				mMINUS_E_OP(); 

				}
				break;
			case 36 :
				// myLexer.g:1:294: MULTI_E_OP
				{
				mMULTI_E_OP(); 

				}
				break;
			case 37 :
				// myLexer.g:1:305: DIVID_E_OP
				{
				mDIVID_E_OP(); 

				}
				break;
			case 38 :
				// myLexer.g:1:316: MOD_E_OP
				{
				mMOD_E_OP(); 

				}
				break;
			case 39 :
				// myLexer.g:1:325: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 40 :
				// myLexer.g:1:332: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 41 :
				// myLexer.g:1:338: BIT_OR_OP
				{
				mBIT_OR_OP(); 

				}
				break;
			case 42 :
				// myLexer.g:1:348: NOT_OP
				{
				mNOT_OP(); 

				}
				break;
			case 43 :
				// myLexer.g:1:355: XOR_OP
				{
				mXOR_OP(); 

				}
				break;
			case 44 :
				// myLexer.g:1:362: COMMA_
				{
				mCOMMA_(); 

				}
				break;
			case 45 :
				// myLexer.g:1:369: SEMIC_
				{
				mSEMIC_(); 

				}
				break;
			case 46 :
				// myLexer.g:1:376: COLON_
				{
				mCOLON_(); 

				}
				break;
			case 47 :
				// myLexer.g:1:383: QUESTION_
				{
				mQUESTION_(); 

				}
				break;
			case 48 :
				// myLexer.g:1:393: AMPERSAND_
				{
				mAMPERSAND_(); 

				}
				break;
			case 49 :
				// myLexer.g:1:404: SL_BRACK
				{
				mSL_BRACK(); 

				}
				break;
			case 50 :
				// myLexer.g:1:413: SR_BRACK
				{
				mSR_BRACK(); 

				}
				break;
			case 51 :
				// myLexer.g:1:422: ML_BRACK
				{
				mML_BRACK(); 

				}
				break;
			case 52 :
				// myLexer.g:1:431: MR_BRACK
				{
				mMR_BRACK(); 

				}
				break;
			case 53 :
				// myLexer.g:1:440: BL_BRACK
				{
				mBL_BRACK(); 

				}
				break;
			case 54 :
				// myLexer.g:1:449: BR_BRACK
				{
				mBR_BRACK(); 

				}
				break;
			case 55 :
				// myLexer.g:1:458: PRE_PROCESS
				{
				mPRE_PROCESS(); 

				}
				break;
			case 56 :
				// myLexer.g:1:470: STRING_
				{
				mSTRING_(); 

				}
				break;
			case 57 :
				// myLexer.g:1:478: CHAR_
				{
				mCHAR_(); 

				}
				break;
			case 58 :
				// myLexer.g:1:484: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 59 :
				// myLexer.g:1:492: ID
				{
				mID(); 

				}
				break;
			case 60 :
				// myLexer.g:1:495: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 61 :
				// myLexer.g:1:505: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 62 :
				// myLexer.g:1:514: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 63 :
				// myLexer.g:1:523: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 64 :
				// myLexer.g:1:532: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA7_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA7_eofS =
		"\5\uffff";
	static final String DFA7_minS =
		"\2\56\3\uffff";
	static final String DFA7_maxS =
		"\2\71\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "79:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA15_eotS =
		"\1\uffff\13\47\1\75\1\100\1\103\1\105\1\110\1\113\1\115\1\121\1\123\1"+
		"\125\1\127\16\uffff\2\130\4\uffff\1\47\1\133\17\47\35\uffff\1\130\1\153"+
		"\1\uffff\5\47\1\161\11\47\1\uffff\1\173\1\174\1\47\1\176\1\47\1\uffff"+
		"\2\47\1\u0082\3\47\1\u0086\2\47\2\uffff\1\47\1\uffff\1\u008a\2\47\1\uffff"+
		"\1\u008d\1\47\1\u008f\1\uffff\1\u0090\2\47\1\uffff\1\u0093\1\47\1\uffff"+
		"\1\u0095\2\uffff\1\u0096\1\47\1\uffff\1\u0098\2\uffff\1\u0099\2\uffff";
	static final String DFA15_eofS =
		"\u009a\uffff";
	static final String DFA15_minS =
		"\1\11\1\146\1\141\1\157\1\154\1\145\1\157\2\150\1\154\1\162\1\145\1\75"+
		"\1\74\2\75\1\53\1\55\1\75\1\52\1\75\1\46\1\174\16\uffff\2\56\4\uffff\1"+
		"\164\1\60\1\141\1\163\1\156\1\151\1\157\1\162\1\165\1\146\1\156\1\157"+
		"\2\151\1\163\1\145\1\164\35\uffff\1\56\1\60\1\uffff\1\162\1\145\1\164"+
		"\1\144\1\141\1\60\1\142\1\141\1\147\1\162\1\164\1\154\1\145\1\141\1\165"+
		"\1\uffff\2\60\1\151\1\60\1\164\1\uffff\1\154\1\165\1\60\1\164\1\143\1"+
		"\145\1\60\1\153\1\162\2\uffff\1\156\1\uffff\1\60\1\145\1\154\1\uffff\1"+
		"\60\1\150\1\60\1\uffff\1\60\1\156\1\165\1\uffff\1\60\1\164\1\uffff\1\60"+
		"\2\uffff\1\60\1\145\1\uffff\1\60\2\uffff\1\60\2\uffff";
	static final String DFA15_maxS =
		"\1\175\1\156\5\157\1\167\1\150\1\154\1\162\1\145\2\75\1\76\6\75\1\46\1"+
		"\174\16\uffff\2\71\4\uffff\1\164\1\172\1\141\1\163\1\156\1\151\1\157\1"+
		"\162\1\165\1\146\1\156\1\157\2\151\1\163\1\145\1\164\35\uffff\1\71\1\172"+
		"\1\uffff\1\162\1\145\1\164\1\144\1\141\1\172\1\142\1\141\1\147\1\162\1"+
		"\164\1\154\1\145\1\141\1\165\1\uffff\2\172\1\151\1\172\1\164\1\uffff\1"+
		"\154\1\165\1\172\1\164\1\143\1\145\1\172\1\153\1\162\2\uffff\1\156\1\uffff"+
		"\1\172\1\145\1\154\1\uffff\1\172\1\150\1\172\1\uffff\1\172\1\156\1\165"+
		"\1\uffff\1\172\1\164\1\uffff\1\172\2\uffff\1\172\1\145\1\uffff\1\172\2"+
		"\uffff\1\172\2\uffff";
	static final String DFA15_acceptS =
		"\27\uffff\1\53\1\54\1\55\1\56\1\57\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
		"\1\70\1\71\2\uffff\1\73\1\74\1\77\1\100\21\uffff\1\22\1\41\1\23\1\30\1"+
		"\32\1\24\1\31\1\33\1\25\1\52\1\26\1\42\1\34\1\27\1\43\1\35\1\44\1\36\1"+
		"\45\1\75\1\76\1\37\1\46\1\40\1\47\1\60\1\50\1\51\1\72\2\uffff\1\12\17"+
		"\uffff\1\1\5\uffff\1\11\11\uffff\1\2\1\15\1\uffff\1\3\3\uffff\1\6\3\uffff"+
		"\1\13\3\uffff\1\4\2\uffff\1\7\1\uffff\1\10\1\16\2\uffff\1\5\1\uffff\1"+
		"\14\1\21\1\uffff\1\17\1\20";
	static final String DFA15_specialS =
		"\u009a\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\52\1\51\2\uffff\1\52\22\uffff\1\52\1\17\1\43\1\42\1\uffff\1\24\1\25"+
			"\1\44\1\34\1\35\1\22\1\20\1\30\1\21\1\50\1\23\1\45\11\46\1\32\1\31\1"+
			"\15\1\14\1\16\1\33\1\uffff\32\47\1\36\1\uffff\1\37\1\27\1\47\1\uffff"+
			"\1\47\1\12\1\2\1\5\1\11\1\4\2\47\1\1\2\47\1\6\5\47\1\13\1\7\2\47\1\3"+
			"\1\10\3\47\1\40\1\26\1\41",
			"\1\54\7\uffff\1\53",
			"\1\56\6\uffff\1\55\6\uffff\1\57",
			"\1\60",
			"\1\61\2\uffff\1\62",
			"\1\64\11\uffff\1\63",
			"\1\65",
			"\1\66\16\uffff\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\77\1\76",
			"\1\101\1\102",
			"\1\104",
			"\1\106\21\uffff\1\107",
			"\1\111\17\uffff\1\112",
			"\1\114",
			"\1\120\4\uffff\1\117\15\uffff\1\116",
			"\1\122",
			"\1\124",
			"\1\126",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50\1\uffff\12\50",
			"\1\50\1\uffff\12\131",
			"",
			"",
			"",
			"",
			"\1\132",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50\1\uffff\12\131",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\175",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\177",
			"",
			"\1\u0080",
			"\1\u0081",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0087",
			"\1\u0088",
			"",
			"",
			"\1\u0089",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u008b",
			"\1\u008c",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u008e",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0091",
			"\1\u0092",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0094",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0097",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | SHORT_TYPR | WHILE_ | FOR_ | IF_ | ELSE_ | SWITCH_ | CASE_ | BREAK_ | DEFAULT_ | CONTINUE_ | RETURN_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP | PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | ASSIGN_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | MOD_E_OP | AND_OP | OR_OP | BIT_OR_OP | NOT_OP | XOR_OP | COMMA_ | SEMIC_ | COLON_ | QUESTION_ | AMPERSAND_ | SL_BRACK | SR_BRACK | ML_BRACK | MR_BRACK | BL_BRACK | BR_BRACK | PRE_PROCESS | STRING_ | CHAR_ | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | WS );";
		}
	}

}
