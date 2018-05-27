// $ANTLR 3.5.2 myParser.g 2018-05-27 17:26:04

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myParserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPERSAND_", "AND_OP", "ASSIGN_OP", 
		"BIT_OR_OP", "BL_BRACK", "BREAK_", "BR_BRACK", "CASE_", "CHAR_", "CHAR_TYPE", 
		"COLON_", "COMMA_", "COMMENT1", "COMMENT2", "DEC_NUM", "DEFAULT_", "DIGIT", 
		"DIVID_E_OP", "DIVID_OP", "DOUBLE_TYPE", "ELSE_", "EOF_", "EQ_OP", "FLOAT_NUM", 
		"FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "FLOAT_TYPE", "FOR_", "GE_OP", 
		"GT_OP", "ID", "IF_", "INT_TYPE", "LETTER", "LE_OP", "LONG_TYPE", "LSHIFT_OP", 
		"LT_OP", "MINUS_E_OP", "MINUS_OP", "ML_BRACK", "MM_OP", "MOD_E_OP", "MOD_OP", 
		"MR_BRACK", "MULTI_E_OP", "MULTI_OP", "NEW_LINE", "NE_OP", "NOT_OP", "OR_OP", 
		"PLUS_E_OP", "PLUS_OP", "PP_OP", "PRE_PROCESS", "QUESTION_", "RETURN_", 
		"RSHIFT_OP", "SEMIC_", "SHORT_TYPE", "SL_BRACK", "SR_BRACK", "STRING_", 
		"SWITCH_", "VOID_TYPE", "WHILE_", "WS", "XOR_OP"
	};
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
	public static final int DEC_NUM=18;
	public static final int DEFAULT_=19;
	public static final int DIGIT=20;
	public static final int DIVID_E_OP=21;
	public static final int DIVID_OP=22;
	public static final int DOUBLE_TYPE=23;
	public static final int ELSE_=24;
	public static final int EOF_=25;
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
	public static final int SHORT_TYPE=64;
	public static final int SL_BRACK=65;
	public static final int SR_BRACK=66;
	public static final int STRING_=67;
	public static final int SWITCH_=68;
	public static final int VOID_TYPE=69;
	public static final int WHILE_=70;
	public static final int WS=71;
	public static final int XOR_OP=72;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myParserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myParserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myParserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myParser.g"; }


		boolean TRACEON = false;
		HashMap<String, Integer> symtab = new HashMap<String, Integer>();

		/* attr_type:
		   1 => int
		   2 => char
		   3 => void
		   4 => float
		   -1 => do not exist
		   -2 => error
		*/



	// $ANTLR start "program"
	// myParser.g:21:1: program : declare_semic function_ EOF ;
	public final void program() throws RecognitionException {
		try {
			// myParser.g:21:9: ( declare_semic function_ EOF )
			// myParser.g:21:11: declare_semic function_ EOF
			{
			pushFollow(FOLLOW_declare_semic_in_program22);
			declare_semic();
			state._fsp--;

			pushFollow(FOLLOW_function__in_program24);
			function_();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program26); 
			 System.out.println("\nDONE!!\n"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declare_"
	// myParser.g:23:1: declare_ returns [int attr_type] : ( types_ ID declare_value_ declare_other_ | ID declare_value_ declare_other_ );
	public final int declare_() throws RecognitionException {
		int attr_type = 0;


		Token ID1=null;
		Token ID3=null;
		int types_2 =0;

		try {
			// myParser.g:23:34: ( types_ ID declare_value_ declare_other_ | ID declare_value_ declare_other_ )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR_TYPE||LA1_0==FLOAT_TYPE||LA1_0==INT_TYPE||LA1_0==VOID_TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==ID) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myParser.g:24:2: types_ ID declare_value_ declare_other_
					{
					pushFollow(FOLLOW_types__in_declare_42);
					types_2=types_();
					state._fsp--;

					ID1=(Token)match(input,ID,FOLLOW_ID_in_declare_44); 

							if(!symtab.containsKey((ID1!=null?ID1.getText():null))) {
								symtab.put((ID1!=null?ID1.getText():null), types_2);
							}
							else {
								System.out.println("Type Error: " + ID1.getLine() + ": Redeclared identifier " + ID1.getText());
								attr_type = -2;
							}
						
					pushFollow(FOLLOW_declare_value__in_declare_47);
					declare_value_();
					state._fsp--;

					pushFollow(FOLLOW_declare_other__in_declare_49);
					declare_other_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:33:4: ID declare_value_ declare_other_
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_declare_54); 

							if(!symtab.containsKey((ID3!=null?ID3.getText():null))) {
								System.out.println("Type Error: " + ID3.getLine() + ": Undeclared identifier " + ID3.getText());
								attr_type = -1;
							}
							else {
								attr_type = symtab.get((ID3!=null?ID3.getText():null));
							}
						
					pushFollow(FOLLOW_declare_value__in_declare_58);
					declare_value_();
					state._fsp--;

					pushFollow(FOLLOW_declare_other__in_declare_60);
					declare_other_();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "declare_"



	// $ANTLR start "declare_semic"
	// myParser.g:42:1: declare_semic : ( declare_ SEMIC_ declare_semic |);
	public final void declare_semic() throws RecognitionException {
		try {
			// myParser.g:42:15: ( declare_ SEMIC_ declare_semic |)
			int alt2=2;
			switch ( input.LA(1) ) {
			case INT_TYPE:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ID) ) {
					int LA2_7 = input.LA(3);
					if ( (LA2_7==SL_BRACK) ) {
						alt2=2;
					}
					else if ( (LA2_7==ASSIGN_OP||LA2_7==COMMA_||LA2_7==SEMIC_) ) {
						alt2=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR_TYPE:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==ID) ) {
					int LA2_7 = input.LA(3);
					if ( (LA2_7==SL_BRACK) ) {
						alt2=2;
					}
					else if ( (LA2_7==ASSIGN_OP||LA2_7==COMMA_||LA2_7==SEMIC_) ) {
						alt2=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID_TYPE:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==ID) ) {
					int LA2_7 = input.LA(3);
					if ( (LA2_7==SL_BRACK) ) {
						alt2=2;
					}
					else if ( (LA2_7==ASSIGN_OP||LA2_7==COMMA_||LA2_7==SEMIC_) ) {
						alt2=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT_TYPE:
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4==ID) ) {
					int LA2_7 = input.LA(3);
					if ( (LA2_7==SL_BRACK) ) {
						alt2=2;
					}
					else if ( (LA2_7==ASSIGN_OP||LA2_7==COMMA_||LA2_7==SEMIC_) ) {
						alt2=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ID:
				{
				alt2=1;
				}
				break;
			case EOF:
				{
				alt2=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myParser.g:42:17: declare_ SEMIC_ declare_semic
					{
					pushFollow(FOLLOW_declare__in_declare_semic67);
					declare_();
					state._fsp--;

					match(input,SEMIC_,FOLLOW_SEMIC__in_declare_semic69); 
					pushFollow(FOLLOW_declare_semic_in_declare_semic71);
					declare_semic();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:42:48: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declare_semic"



	// $ANTLR start "types_"
	// myParser.g:43:1: types_ returns [int attr_type] : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE );
	public final int types_() throws RecognitionException {
		int attr_type = 0;


		try {
			// myParser.g:43:32: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE )
			int alt3=4;
			switch ( input.LA(1) ) {
			case INT_TYPE:
				{
				alt3=1;
				}
				break;
			case CHAR_TYPE:
				{
				alt3=2;
				}
				break;
			case VOID_TYPE:
				{
				alt3=3;
				}
				break;
			case FLOAT_TYPE:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// myParser.g:44:4: INT_TYPE
					{
					match(input,INT_TYPE,FOLLOW_INT_TYPE_in_types_88); 
					 attr_type = 1; 
					}
					break;
				case 2 :
					// myParser.g:45:4: CHAR_TYPE
					{
					match(input,CHAR_TYPE,FOLLOW_CHAR_TYPE_in_types_95); 
					 attr_type = 2; 
					}
					break;
				case 3 :
					// myParser.g:46:4: VOID_TYPE
					{
					match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_types_102); 
					 attr_type = 3; 
					}
					break;
				case 4 :
					// myParser.g:47:4: FLOAT_TYPE
					{
					match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_types_109); 
					 attr_type = 4; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "types_"



	// $ANTLR start "declare_value_"
	// myParser.g:49:1: declare_value_ : ( ASSIGN_OP assign_value_ |);
	public final void declare_value_() throws RecognitionException {
		try {
			// myParser.g:49:16: ( ASSIGN_OP assign_value_ |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ASSIGN_OP) ) {
				alt4=1;
			}
			else if ( (LA4_0==COMMA_||LA4_0==SEMIC_||LA4_0==SR_BRACK) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myParser.g:49:18: ASSIGN_OP assign_value_
					{
					match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_declare_value_120); 
					pushFollow(FOLLOW_assign_value__in_declare_value_122);
					assign_value_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:49:43: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declare_value_"



	// $ANTLR start "declare_other_"
	// myParser.g:50:1: declare_other_ : ( COMMA_ ID declare_value_ declare_other_ |);
	public final void declare_other_() throws RecognitionException {
		try {
			// myParser.g:50:16: ( COMMA_ ID declare_value_ declare_other_ |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==COMMA_) ) {
				alt5=1;
			}
			else if ( (LA5_0==SEMIC_||LA5_0==SR_BRACK) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myParser.g:50:18: COMMA_ ID declare_value_ declare_other_
					{
					match(input,COMMA_,FOLLOW_COMMA__in_declare_other_131); 
					match(input,ID,FOLLOW_ID_in_declare_other_133); 
					pushFollow(FOLLOW_declare_value__in_declare_other_136);
					declare_value_();
					state._fsp--;

					pushFollow(FOLLOW_declare_other__in_declare_other_138);
					declare_other_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:50:60: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declare_other_"



	// $ANTLR start "arithmetic_"
	// myParser.g:51:1: arithmetic_ : ( ID | numbers_ | ID operators_ ID | ID operators_ numbers_ | ID operators_ CHAR_ | numbers_ operators_ ID | numbers_ operators_ numbers_ | ppmm_id_ | function_call_ |);
	public final void arithmetic_() throws RecognitionException {
		try {
			// myParser.g:51:13: ( ID | numbers_ | ID operators_ ID | ID operators_ numbers_ | ID operators_ CHAR_ | numbers_ operators_ ID | numbers_ operators_ numbers_ | ppmm_id_ | function_call_ |)
			int alt6=10;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case SL_BRACK:
					{
					alt6=9;
					}
					break;
				case COMMA_:
				case SEMIC_:
				case SR_BRACK:
					{
					alt6=1;
					}
					break;
				case AMPERSAND_:
				case AND_OP:
				case BIT_OR_OP:
				case DIVID_E_OP:
				case DIVID_OP:
				case EQ_OP:
				case GE_OP:
				case GT_OP:
				case LE_OP:
				case LSHIFT_OP:
				case LT_OP:
				case MINUS_E_OP:
				case MINUS_OP:
				case MOD_OP:
				case MULTI_E_OP:
				case MULTI_OP:
				case NE_OP:
				case NOT_OP:
				case OR_OP:
				case PLUS_E_OP:
				case PLUS_OP:
				case RSHIFT_OP:
				case XOR_OP:
					{
					switch ( input.LA(3) ) {
					case ID:
						{
						alt6=3;
						}
						break;
					case DEC_NUM:
					case FLOAT_NUM:
					case MINUS_OP:
						{
						alt6=4;
						}
						break;
					case CHAR_:
						{
						alt6=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case MM_OP:
				case PP_OP:
					{
					alt6=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case DEC_NUM:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==COMMA_||LA6_2==SEMIC_||LA6_2==SR_BRACK) ) {
					alt6=2;
				}
				else if ( ((LA6_2 >= AMPERSAND_ && LA6_2 <= AND_OP)||LA6_2==BIT_OR_OP||(LA6_2 >= DIVID_E_OP && LA6_2 <= DIVID_OP)||LA6_2==EQ_OP||(LA6_2 >= GE_OP && LA6_2 <= GT_OP)||LA6_2==LE_OP||(LA6_2 >= LSHIFT_OP && LA6_2 <= MINUS_OP)||LA6_2==MOD_OP||(LA6_2 >= MULTI_E_OP && LA6_2 <= MULTI_OP)||(LA6_2 >= NE_OP && LA6_2 <= PLUS_OP)||LA6_2==RSHIFT_OP||LA6_2==XOR_OP) ) {
					int LA6_11 = input.LA(3);
					if ( (LA6_11==ID) ) {
						alt6=6;
					}
					else if ( (LA6_11==DEC_NUM||LA6_11==FLOAT_NUM||LA6_11==MINUS_OP) ) {
						alt6=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT_NUM:
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==COMMA_||LA6_3==SEMIC_||LA6_3==SR_BRACK) ) {
					alt6=2;
				}
				else if ( ((LA6_3 >= AMPERSAND_ && LA6_3 <= AND_OP)||LA6_3==BIT_OR_OP||(LA6_3 >= DIVID_E_OP && LA6_3 <= DIVID_OP)||LA6_3==EQ_OP||(LA6_3 >= GE_OP && LA6_3 <= GT_OP)||LA6_3==LE_OP||(LA6_3 >= LSHIFT_OP && LA6_3 <= MINUS_OP)||LA6_3==MOD_OP||(LA6_3 >= MULTI_E_OP && LA6_3 <= MULTI_OP)||(LA6_3 >= NE_OP && LA6_3 <= PLUS_OP)||LA6_3==RSHIFT_OP||LA6_3==XOR_OP) ) {
					int LA6_11 = input.LA(3);
					if ( (LA6_11==ID) ) {
						alt6=6;
					}
					else if ( (LA6_11==DEC_NUM||LA6_11==FLOAT_NUM||LA6_11==MINUS_OP) ) {
						alt6=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS_OP:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==DEC_NUM) ) {
					int LA6_12 = input.LA(3);
					if ( (LA6_12==COMMA_||LA6_12==SEMIC_||LA6_12==SR_BRACK) ) {
						alt6=2;
					}
					else if ( ((LA6_12 >= AMPERSAND_ && LA6_12 <= AND_OP)||LA6_12==BIT_OR_OP||(LA6_12 >= DIVID_E_OP && LA6_12 <= DIVID_OP)||LA6_12==EQ_OP||(LA6_12 >= GE_OP && LA6_12 <= GT_OP)||LA6_12==LE_OP||(LA6_12 >= LSHIFT_OP && LA6_12 <= MINUS_OP)||LA6_12==MOD_OP||(LA6_12 >= MULTI_E_OP && LA6_12 <= MULTI_OP)||(LA6_12 >= NE_OP && LA6_12 <= PLUS_OP)||LA6_12==RSHIFT_OP||LA6_12==XOR_OP) ) {
						int LA6_11 = input.LA(4);
						if ( (LA6_11==ID) ) {
							alt6=6;
						}
						else if ( (LA6_11==DEC_NUM||LA6_11==FLOAT_NUM||LA6_11==MINUS_OP) ) {
							alt6=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_4==FLOAT_NUM) ) {
					int LA6_13 = input.LA(3);
					if ( (LA6_13==COMMA_||LA6_13==SEMIC_||LA6_13==SR_BRACK) ) {
						alt6=2;
					}
					else if ( ((LA6_13 >= AMPERSAND_ && LA6_13 <= AND_OP)||LA6_13==BIT_OR_OP||(LA6_13 >= DIVID_E_OP && LA6_13 <= DIVID_OP)||LA6_13==EQ_OP||(LA6_13 >= GE_OP && LA6_13 <= GT_OP)||LA6_13==LE_OP||(LA6_13 >= LSHIFT_OP && LA6_13 <= MINUS_OP)||LA6_13==MOD_OP||(LA6_13 >= MULTI_E_OP && LA6_13 <= MULTI_OP)||(LA6_13 >= NE_OP && LA6_13 <= PLUS_OP)||LA6_13==RSHIFT_OP||LA6_13==XOR_OP) ) {
						int LA6_11 = input.LA(4);
						if ( (LA6_11==ID) ) {
							alt6=6;
						}
						else if ( (LA6_11==DEC_NUM||LA6_11==FLOAT_NUM||LA6_11==MINUS_OP) ) {
							alt6=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MM_OP:
			case PP_OP:
				{
				alt6=8;
				}
				break;
			case COMMA_:
			case SEMIC_:
			case SR_BRACK:
				{
				alt6=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// myParser.g:51:15: ID
					{
					match(input,ID,FOLLOW_ID_in_arithmetic_147); 
					}
					break;
				case 2 :
					// myParser.g:51:20: numbers_
					{
					pushFollow(FOLLOW_numbers__in_arithmetic_151);
					numbers_();
					state._fsp--;

					}
					break;
				case 3 :
					// myParser.g:51:31: ID operators_ ID
					{
					match(input,ID,FOLLOW_ID_in_arithmetic_155); 
					pushFollow(FOLLOW_operators__in_arithmetic_157);
					operators_();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_arithmetic_159); 
					}
					break;
				case 4 :
					// myParser.g:51:50: ID operators_ numbers_
					{
					match(input,ID,FOLLOW_ID_in_arithmetic_163); 
					pushFollow(FOLLOW_operators__in_arithmetic_165);
					operators_();
					state._fsp--;

					pushFollow(FOLLOW_numbers__in_arithmetic_167);
					numbers_();
					state._fsp--;

					}
					break;
				case 5 :
					// myParser.g:51:75: ID operators_ CHAR_
					{
					match(input,ID,FOLLOW_ID_in_arithmetic_171); 
					pushFollow(FOLLOW_operators__in_arithmetic_173);
					operators_();
					state._fsp--;

					match(input,CHAR_,FOLLOW_CHAR__in_arithmetic_175); 
					}
					break;
				case 6 :
					// myParser.g:52:4: numbers_ operators_ ID
					{
					pushFollow(FOLLOW_numbers__in_arithmetic_183);
					numbers_();
					state._fsp--;

					pushFollow(FOLLOW_operators__in_arithmetic_185);
					operators_();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_arithmetic_187); 
					}
					break;
				case 7 :
					// myParser.g:52:29: numbers_ operators_ numbers_
					{
					pushFollow(FOLLOW_numbers__in_arithmetic_191);
					numbers_();
					state._fsp--;

					pushFollow(FOLLOW_operators__in_arithmetic_193);
					operators_();
					state._fsp--;

					pushFollow(FOLLOW_numbers__in_arithmetic_195);
					numbers_();
					state._fsp--;

					}
					break;
				case 8 :
					// myParser.g:52:60: ppmm_id_
					{
					pushFollow(FOLLOW_ppmm_id__in_arithmetic_199);
					ppmm_id_();
					state._fsp--;

					}
					break;
				case 9 :
					// myParser.g:52:71: function_call_
					{
					pushFollow(FOLLOW_function_call__in_arithmetic_203);
					function_call_();
					state._fsp--;

					}
					break;
				case 10 :
					// myParser.g:52:87: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arithmetic_"



	// $ANTLR start "numbers_"
	// myParser.g:53:1: numbers_ returns [int attr_type] : ( DEC_NUM | FLOAT_NUM | MINUS_OP DEC_NUM | MINUS_OP FLOAT_NUM );
	public final int numbers_() throws RecognitionException {
		int attr_type = 0;


		try {
			// myParser.g:53:34: ( DEC_NUM | FLOAT_NUM | MINUS_OP DEC_NUM | MINUS_OP FLOAT_NUM )
			int alt7=4;
			switch ( input.LA(1) ) {
			case DEC_NUM:
				{
				alt7=1;
				}
				break;
			case FLOAT_NUM:
				{
				alt7=2;
				}
				break;
			case MINUS_OP:
				{
				int LA7_3 = input.LA(2);
				if ( (LA7_3==DEC_NUM) ) {
					alt7=3;
				}
				else if ( (LA7_3==FLOAT_NUM) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// myParser.g:54:4: DEC_NUM
					{
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_numbers_220); 
					 attr_type = 1; 
					}
					break;
				case 2 :
					// myParser.g:55:4: FLOAT_NUM
					{
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_numbers_227); 
					 attr_type = 4; 
					}
					break;
				case 3 :
					// myParser.g:56:4: MINUS_OP DEC_NUM
					{
					match(input,MINUS_OP,FOLLOW_MINUS_OP_in_numbers_234); 
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_numbers_236); 
					 attr_type = 1; 
					}
					break;
				case 4 :
					// myParser.g:57:4: MINUS_OP FLOAT_NUM
					{
					match(input,MINUS_OP,FOLLOW_MINUS_OP_in_numbers_243); 
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_numbers_245); 
					 attr_type = 4; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "numbers_"



	// $ANTLR start "operators_"
	// myParser.g:59:1: operators_ : ( PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | EQ_OP | LE_OP | GE_OP | NE_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP | AND_OP | OR_OP | AMPERSAND_ | BIT_OR_OP | NOT_OP | XOR_OP );
	public final void operators_() throws RecognitionException {
		try {
			// myParser.g:59:12: ( PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | EQ_OP | LE_OP | GE_OP | NE_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP | AND_OP | OR_OP | AMPERSAND_ | BIT_OR_OP | NOT_OP | XOR_OP )
			// myParser.g:
			{
			if ( (input.LA(1) >= AMPERSAND_ && input.LA(1) <= AND_OP)||input.LA(1)==BIT_OR_OP||(input.LA(1) >= DIVID_E_OP && input.LA(1) <= DIVID_OP)||input.LA(1)==EQ_OP||(input.LA(1) >= GE_OP && input.LA(1) <= GT_OP)||input.LA(1)==LE_OP||(input.LA(1) >= LSHIFT_OP && input.LA(1) <= MINUS_OP)||input.LA(1)==MOD_OP||(input.LA(1) >= MULTI_E_OP && input.LA(1) <= MULTI_OP)||(input.LA(1) >= NE_OP && input.LA(1) <= PLUS_OP)||input.LA(1)==RSHIFT_OP||input.LA(1)==XOR_OP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operators_"



	// $ANTLR start "ppmm_id_"
	// myParser.g:62:1: ppmm_id_ : ( ppmm_op_ ID | ID ppmm_op_ );
	public final void ppmm_id_() throws RecognitionException {
		try {
			// myParser.g:62:10: ( ppmm_op_ ID | ID ppmm_op_ )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==MM_OP||LA8_0==PP_OP) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myParser.g:62:12: ppmm_op_ ID
					{
					pushFollow(FOLLOW_ppmm_op__in_ppmm_id_354);
					ppmm_op_();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_ppmm_id_356); 
					}
					break;
				case 2 :
					// myParser.g:62:26: ID ppmm_op_
					{
					match(input,ID,FOLLOW_ID_in_ppmm_id_360); 
					pushFollow(FOLLOW_ppmm_op__in_ppmm_id_362);
					ppmm_op_();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ppmm_id_"



	// $ANTLR start "ppmm_op_"
	// myParser.g:63:1: ppmm_op_ : ( PP_OP | MM_OP );
	public final void ppmm_op_() throws RecognitionException {
		try {
			// myParser.g:63:10: ( PP_OP | MM_OP )
			// myParser.g:
			{
			if ( input.LA(1)==MM_OP||input.LA(1)==PP_OP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ppmm_op_"



	// $ANTLR start "function_"
	// myParser.g:65:1: function_ : ( types_ ID SL_BRACK argument_ SR_BRACK BL_BRACK content_ BR_BRACK function_ |);
	public final void function_() throws RecognitionException {
		try {
			// myParser.g:65:11: ( types_ ID SL_BRACK argument_ SR_BRACK BL_BRACK content_ BR_BRACK function_ |)
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CHAR_TYPE||LA9_0==FLOAT_TYPE||LA9_0==INT_TYPE||LA9_0==VOID_TYPE) ) {
				alt9=1;
			}
			else if ( (LA9_0==EOF) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myParser.g:65:13: types_ ID SL_BRACK argument_ SR_BRACK BL_BRACK content_ BR_BRACK function_
					{
					pushFollow(FOLLOW_types__in_function_381);
					types_();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_function_383); 
					match(input,SL_BRACK,FOLLOW_SL_BRACK_in_function_385); 
					pushFollow(FOLLOW_argument__in_function_387);
					argument_();
					state._fsp--;

					match(input,SR_BRACK,FOLLOW_SR_BRACK_in_function_389); 
					match(input,BL_BRACK,FOLLOW_BL_BRACK_in_function_391); 
					pushFollow(FOLLOW_content__in_function_393);
					content_();
					state._fsp--;

					match(input,BR_BRACK,FOLLOW_BR_BRACK_in_function_395); 
					pushFollow(FOLLOW_function__in_function_397);
					function_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:65:89: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function_"



	// $ANTLR start "argument_"
	// myParser.g:66:1: argument_ : ( declare_ | VOID_TYPE |);
	public final void argument_() throws RecognitionException {
		try {
			// myParser.g:66:11: ( declare_ | VOID_TYPE |)
			int alt10=3;
			switch ( input.LA(1) ) {
			case CHAR_TYPE:
			case FLOAT_TYPE:
			case ID:
			case INT_TYPE:
				{
				alt10=1;
				}
				break;
			case VOID_TYPE:
				{
				int LA10_2 = input.LA(2);
				if ( (LA10_2==ID) ) {
					alt10=1;
				}
				else if ( (LA10_2==SR_BRACK) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SR_BRACK:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myParser.g:66:13: declare_
					{
					pushFollow(FOLLOW_declare__in_argument_406);
					declare_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:66:24: VOID_TYPE
					{
					match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_argument_410); 
					}
					break;
				case 3 :
					// myParser.g:66:36: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argument_"



	// $ANTLR start "content_"
	// myParser.g:67:1: content_ : ( if_ content_ | while_ content_ | for_ content_ | switch_ content_ | declare_ SEMIC_ content_ | function_call_ SEMIC_ content_ | assign_ content_ | return_ content_ | break_ content_ |);
	public final void content_() throws RecognitionException {
		try {
			// myParser.g:67:10: ( if_ content_ | while_ content_ | for_ content_ | switch_ content_ | declare_ SEMIC_ content_ | function_call_ SEMIC_ content_ | assign_ content_ | return_ content_ | break_ content_ |)
			int alt11=10;
			switch ( input.LA(1) ) {
			case IF_:
				{
				alt11=1;
				}
				break;
			case WHILE_:
				{
				alt11=2;
				}
				break;
			case FOR_:
				{
				alt11=3;
				}
				break;
			case SWITCH_:
				{
				alt11=4;
				}
				break;
			case CHAR_TYPE:
			case FLOAT_TYPE:
			case INT_TYPE:
			case VOID_TYPE:
				{
				alt11=5;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case SL_BRACK:
					{
					alt11=6;
					}
					break;
				case ASSIGN_OP:
				case COMMA_:
				case SEMIC_:
					{
					alt11=5;
					}
					break;
				case DIVID_E_OP:
				case EQ_OP:
				case MINUS_E_OP:
				case MM_OP:
				case MULTI_E_OP:
				case PLUS_E_OP:
				case PP_OP:
					{
					alt11=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case MM_OP:
			case PP_OP:
				{
				alt11=7;
				}
				break;
			case RETURN_:
				{
				alt11=8;
				}
				break;
			case BREAK_:
				{
				alt11=9;
				}
				break;
			case BR_BRACK:
			case CASE_:
			case DEFAULT_:
				{
				alt11=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myParser.g:67:12: if_ content_
					{
					pushFollow(FOLLOW_if__in_content_420);
					if_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_422);
					content_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:68:4: while_ content_
					{
					pushFollow(FOLLOW_while__in_content_429);
					while_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_431);
					content_();
					state._fsp--;

					}
					break;
				case 3 :
					// myParser.g:69:4: for_ content_
					{
					pushFollow(FOLLOW_for__in_content_438);
					for_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_440);
					content_();
					state._fsp--;

					}
					break;
				case 4 :
					// myParser.g:70:4: switch_ content_
					{
					pushFollow(FOLLOW_switch__in_content_446);
					switch_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_448);
					content_();
					state._fsp--;

					}
					break;
				case 5 :
					// myParser.g:71:4: declare_ SEMIC_ content_
					{
					pushFollow(FOLLOW_declare__in_content_453);
					declare_();
					state._fsp--;

					match(input,SEMIC_,FOLLOW_SEMIC__in_content_455); 
					pushFollow(FOLLOW_content__in_content_457);
					content_();
					state._fsp--;

					 if (TRACEON) System.out.println("declare");
					}
					break;
				case 6 :
					// myParser.g:72:4: function_call_ SEMIC_ content_
					{
					pushFollow(FOLLOW_function_call__in_content_465);
					function_call_();
					state._fsp--;

					match(input,SEMIC_,FOLLOW_SEMIC__in_content_467); 
					pushFollow(FOLLOW_content__in_content_469);
					content_();
					state._fsp--;

					}
					break;
				case 7 :
					// myParser.g:73:4: assign_ content_
					{
					pushFollow(FOLLOW_assign__in_content_476);
					assign_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_478);
					content_();
					state._fsp--;

					}
					break;
				case 8 :
					// myParser.g:74:4: return_ content_
					{
					pushFollow(FOLLOW_return__in_content_484);
					return_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_486);
					content_();
					state._fsp--;

					}
					break;
				case 9 :
					// myParser.g:75:4: break_ content_
					{
					pushFollow(FOLLOW_break__in_content_491);
					break_();
					state._fsp--;

					pushFollow(FOLLOW_content__in_content_493);
					content_();
					state._fsp--;

					 if (TRACEON) System.out.println("break");
					}
					break;
				case 10 :
					// myParser.g:76:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "content_"



	// $ANTLR start "if_"
	// myParser.g:78:1: if_ : IF_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK else_ ;
	public final void if_() throws RecognitionException {
		try {
			// myParser.g:78:5: ( IF_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK else_ )
			// myParser.g:78:7: IF_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK else_
			{
			match(input,IF_,FOLLOW_IF__in_if_506); 
			match(input,SL_BRACK,FOLLOW_SL_BRACK_in_if_508); 
			pushFollow(FOLLOW_arithmetic__in_if_510);
			arithmetic_();
			state._fsp--;

			match(input,SR_BRACK,FOLLOW_SR_BRACK_in_if_512); 
			match(input,BL_BRACK,FOLLOW_BL_BRACK_in_if_514); 
			pushFollow(FOLLOW_content__in_if_516);
			content_();
			state._fsp--;

			match(input,BR_BRACK,FOLLOW_BR_BRACK_in_if_518); 
			pushFollow(FOLLOW_else__in_if_520);
			else_();
			state._fsp--;

			 if (TRACEON) System.out.println("if");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_"



	// $ANTLR start "else_"
	// myParser.g:79:1: else_ : ( ELSE_ if_ | ELSE_ BL_BRACK content_ BR_BRACK |);
	public final void else_() throws RecognitionException {
		try {
			// myParser.g:79:7: ( ELSE_ if_ | ELSE_ BL_BRACK content_ BR_BRACK |)
			int alt12=3;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ELSE_) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==BL_BRACK) ) {
					alt12=2;
				}
				else if ( (LA12_1==IF_) ) {
					alt12=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA12_0 >= BREAK_ && LA12_0 <= CASE_)||LA12_0==CHAR_TYPE||LA12_0==DEFAULT_||(LA12_0 >= FLOAT_TYPE && LA12_0 <= FOR_)||(LA12_0 >= ID && LA12_0 <= INT_TYPE)||LA12_0==MM_OP||LA12_0==PP_OP||LA12_0==RETURN_||(LA12_0 >= SWITCH_ && LA12_0 <= WHILE_)) ) {
				alt12=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// myParser.g:79:9: ELSE_ if_
					{
					match(input,ELSE_,FOLLOW_ELSE__in_else_529); 
					pushFollow(FOLLOW_if__in_else_531);
					if_();
					state._fsp--;

					 if (TRACEON) System.out.println("else if");
					}
					break;
				case 2 :
					// myParser.g:79:67: ELSE_ BL_BRACK content_ BR_BRACK
					{
					match(input,ELSE_,FOLLOW_ELSE__in_else_536); 
					match(input,BL_BRACK,FOLLOW_BL_BRACK_in_else_538); 
					pushFollow(FOLLOW_content__in_else_540);
					content_();
					state._fsp--;

					match(input,BR_BRACK,FOLLOW_BR_BRACK_in_else_542); 
					 if (TRACEON) System.out.println("else");
					}
					break;
				case 3 :
					// myParser.g:79:145: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "else_"



	// $ANTLR start "while_"
	// myParser.g:80:1: while_ : WHILE_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK ;
	public final void while_() throws RecognitionException {
		try {
			// myParser.g:80:8: ( WHILE_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK )
			// myParser.g:80:10: WHILE_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK
			{
			match(input,WHILE_,FOLLOW_WHILE__in_while_554); 
			match(input,SL_BRACK,FOLLOW_SL_BRACK_in_while_556); 
			pushFollow(FOLLOW_arithmetic__in_while_558);
			arithmetic_();
			state._fsp--;

			match(input,SR_BRACK,FOLLOW_SR_BRACK_in_while_560); 
			match(input,BL_BRACK,FOLLOW_BL_BRACK_in_while_562); 
			pushFollow(FOLLOW_content__in_while_564);
			content_();
			state._fsp--;

			match(input,BR_BRACK,FOLLOW_BR_BRACK_in_while_567); 
			 if (TRACEON) System.out.println("while");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_"



	// $ANTLR start "for_"
	// myParser.g:81:1: for_ : FOR_ SL_BRACK declare_ SEMIC_ arithmetic_ SEMIC_ arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK ;
	public final void for_() throws RecognitionException {
		try {
			// myParser.g:81:6: ( FOR_ SL_BRACK declare_ SEMIC_ arithmetic_ SEMIC_ arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK )
			// myParser.g:81:8: FOR_ SL_BRACK declare_ SEMIC_ arithmetic_ SEMIC_ arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK
			{
			match(input,FOR_,FOLLOW_FOR__in_for_577); 
			match(input,SL_BRACK,FOLLOW_SL_BRACK_in_for_579); 
			pushFollow(FOLLOW_declare__in_for_581);
			declare_();
			state._fsp--;

			match(input,SEMIC_,FOLLOW_SEMIC__in_for_583); 
			pushFollow(FOLLOW_arithmetic__in_for_585);
			arithmetic_();
			state._fsp--;

			match(input,SEMIC_,FOLLOW_SEMIC__in_for_587); 
			pushFollow(FOLLOW_arithmetic__in_for_589);
			arithmetic_();
			state._fsp--;

			match(input,SR_BRACK,FOLLOW_SR_BRACK_in_for_591); 
			match(input,BL_BRACK,FOLLOW_BL_BRACK_in_for_593); 
			pushFollow(FOLLOW_content__in_for_595);
			content_();
			state._fsp--;

			match(input,BR_BRACK,FOLLOW_BR_BRACK_in_for_597); 
			 if (TRACEON) System.out.println("for");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_"



	// $ANTLR start "switch_"
	// myParser.g:82:1: switch_ : SWITCH_ SL_BRACK ID SR_BRACK BL_BRACK case_ default_ BR_BRACK ;
	public final void switch_() throws RecognitionException {
		try {
			// myParser.g:82:9: ( SWITCH_ SL_BRACK ID SR_BRACK BL_BRACK case_ default_ BR_BRACK )
			// myParser.g:82:11: SWITCH_ SL_BRACK ID SR_BRACK BL_BRACK case_ default_ BR_BRACK
			{
			match(input,SWITCH_,FOLLOW_SWITCH__in_switch_607); 
			match(input,SL_BRACK,FOLLOW_SL_BRACK_in_switch_609); 
			match(input,ID,FOLLOW_ID_in_switch_611); 
			match(input,SR_BRACK,FOLLOW_SR_BRACK_in_switch_613); 
			match(input,BL_BRACK,FOLLOW_BL_BRACK_in_switch_615); 
			pushFollow(FOLLOW_case__in_switch_617);
			case_();
			state._fsp--;

			pushFollow(FOLLOW_default__in_switch_619);
			default_();
			state._fsp--;

			match(input,BR_BRACK,FOLLOW_BR_BRACK_in_switch_621); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "switch_"



	// $ANTLR start "case_"
	// myParser.g:83:1: case_ : ( CASE_ ( DEC_NUM | CHAR_ ) COLON_ content_ case_ |);
	public final void case_() throws RecognitionException {
		try {
			// myParser.g:83:7: ( CASE_ ( DEC_NUM | CHAR_ ) COLON_ content_ case_ |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==CASE_) ) {
				alt13=1;
			}
			else if ( (LA13_0==BR_BRACK||LA13_0==DEFAULT_) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myParser.g:83:9: CASE_ ( DEC_NUM | CHAR_ ) COLON_ content_ case_
					{
					match(input,CASE_,FOLLOW_CASE__in_case_628); 
					if ( input.LA(1)==CHAR_||input.LA(1)==DEC_NUM ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,COLON_,FOLLOW_COLON__in_case_638); 
					pushFollow(FOLLOW_content__in_case_640);
					content_();
					state._fsp--;

					pushFollow(FOLLOW_case__in_case_642);
					case_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:83:57: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "case_"



	// $ANTLR start "default_"
	// myParser.g:84:1: default_ : ( DEFAULT_ COLON_ content_ |);
	public final void default_() throws RecognitionException {
		try {
			// myParser.g:84:10: ( DEFAULT_ COLON_ content_ |)
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DEFAULT_) ) {
				alt14=1;
			}
			else if ( (LA14_0==BR_BRACK) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// myParser.g:84:12: DEFAULT_ COLON_ content_
					{
					match(input,DEFAULT_,FOLLOW_DEFAULT__in_default_652); 
					match(input,COLON_,FOLLOW_COLON__in_default_654); 
					pushFollow(FOLLOW_content__in_default_656);
					content_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:84:38: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "default_"



	// $ANTLR start "function_call_"
	// myParser.g:85:1: function_call_ : ID SL_BRACK ( . )* SR_BRACK ;
	public final void function_call_() throws RecognitionException {
		try {
			// myParser.g:85:16: ( ID SL_BRACK ( . )* SR_BRACK )
			// myParser.g:85:18: ID SL_BRACK ( . )* SR_BRACK
			{
			match(input,ID,FOLLOW_ID_in_function_call_665); 
			match(input,SL_BRACK,FOLLOW_SL_BRACK_in_function_call_667); 
			// myParser.g:85:30: ( . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==SR_BRACK) ) {
					alt15=2;
				}
				else if ( ((LA15_0 >= AMPERSAND_ && LA15_0 <= SL_BRACK)||(LA15_0 >= STRING_ && LA15_0 <= XOR_OP)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myParser.g:85:31: .
					{
					matchAny(input); 
					}
					break;

				default :
					break loop15;
				}
			}

			match(input,SR_BRACK,FOLLOW_SR_BRACK_in_function_call_674); 
			 if (TRACEON) System.out.println("function");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function_call_"



	// $ANTLR start "assign_"
	// myParser.g:86:1: assign_ : ( ID assign_op_ ( ID | ID operators_ ID ) | ID assign_op_ numbers_ | ppmm_id_ ) SEMIC_ ;
	public final void assign_() throws RecognitionException {
		try {
			// myParser.g:86:9: ( ( ID assign_op_ ( ID | ID operators_ ID ) | ID assign_op_ numbers_ | ppmm_id_ ) SEMIC_ )
			// myParser.g:86:11: ( ID assign_op_ ( ID | ID operators_ ID ) | ID assign_op_ numbers_ | ppmm_id_ ) SEMIC_
			{
			// myParser.g:86:11: ( ID assign_op_ ( ID | ID operators_ ID ) | ID assign_op_ numbers_ | ppmm_id_ )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==DIVID_E_OP||LA17_1==EQ_OP||LA17_1==MINUS_E_OP||LA17_1==MULTI_E_OP||LA17_1==PLUS_E_OP) ) {
					int LA17_3 = input.LA(3);
					if ( (LA17_3==ID) ) {
						alt17=1;
					}
					else if ( (LA17_3==DEC_NUM||LA17_3==FLOAT_NUM||LA17_3==MINUS_OP) ) {
						alt17=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA17_1==MM_OP||LA17_1==PP_OP) ) {
					alt17=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA17_0==MM_OP||LA17_0==PP_OP) ) {
				alt17=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// myParser.g:86:12: ID assign_op_ ( ID | ID operators_ ID )
					{
					match(input,ID,FOLLOW_ID_in_assign_685); 
					pushFollow(FOLLOW_assign_op__in_assign_687);
					assign_op_();
					state._fsp--;

					// myParser.g:86:26: ( ID | ID operators_ ID )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ID) ) {
						int LA16_1 = input.LA(2);
						if ( (LA16_1==SEMIC_) ) {
							alt16=1;
						}
						else if ( ((LA16_1 >= AMPERSAND_ && LA16_1 <= AND_OP)||LA16_1==BIT_OR_OP||(LA16_1 >= DIVID_E_OP && LA16_1 <= DIVID_OP)||LA16_1==EQ_OP||(LA16_1 >= GE_OP && LA16_1 <= GT_OP)||LA16_1==LE_OP||(LA16_1 >= LSHIFT_OP && LA16_1 <= MINUS_OP)||LA16_1==MOD_OP||(LA16_1 >= MULTI_E_OP && LA16_1 <= MULTI_OP)||(LA16_1 >= NE_OP && LA16_1 <= PLUS_OP)||LA16_1==RSHIFT_OP||LA16_1==XOR_OP) ) {
							alt16=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 16, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// myParser.g:86:27: ID
							{
							match(input,ID,FOLLOW_ID_in_assign_690); 
							}
							break;
						case 2 :
							// myParser.g:86:32: ID operators_ ID
							{
							match(input,ID,FOLLOW_ID_in_assign_694); 
							pushFollow(FOLLOW_operators__in_assign_696);
							operators_();
							state._fsp--;

							match(input,ID,FOLLOW_ID_in_assign_698); 
							}
							break;

					}

					}
					break;
				case 2 :
					// myParser.g:86:52: ID assign_op_ numbers_
					{
					match(input,ID,FOLLOW_ID_in_assign_703); 
					pushFollow(FOLLOW_assign_op__in_assign_705);
					assign_op_();
					state._fsp--;

					pushFollow(FOLLOW_numbers__in_assign_707);
					numbers_();
					state._fsp--;

					}
					break;
				case 3 :
					// myParser.g:86:77: ppmm_id_
					{
					pushFollow(FOLLOW_ppmm_id__in_assign_711);
					ppmm_id_();
					state._fsp--;

					}
					break;

			}

			match(input,SEMIC_,FOLLOW_SEMIC__in_assign_714); 
			 if (TRACEON) System.out.println("assign");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_"



	// $ANTLR start "assign_op_"
	// myParser.g:87:1: assign_op_ : ( EQ_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP );
	public final void assign_op_() throws RecognitionException {
		try {
			// myParser.g:87:12: ( EQ_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP )
			// myParser.g:
			{
			if ( input.LA(1)==DIVID_E_OP||input.LA(1)==EQ_OP||input.LA(1)==MINUS_E_OP||input.LA(1)==MULTI_E_OP||input.LA(1)==PLUS_E_OP ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_op_"



	// $ANTLR start "assign_value_"
	// myParser.g:88:1: assign_value_ : ( arithmetic_ | BL_BRACK DEC_NUM BR_BRACK | STRING_ | CHAR_ );
	public final void assign_value_() throws RecognitionException {
		try {
			// myParser.g:88:15: ( arithmetic_ | BL_BRACK DEC_NUM BR_BRACK | STRING_ | CHAR_ )
			int alt18=4;
			switch ( input.LA(1) ) {
			case COMMA_:
			case DEC_NUM:
			case FLOAT_NUM:
			case ID:
			case MINUS_OP:
			case MM_OP:
			case PP_OP:
			case SEMIC_:
			case SR_BRACK:
				{
				alt18=1;
				}
				break;
			case BL_BRACK:
				{
				alt18=2;
				}
				break;
			case STRING_:
				{
				alt18=3;
				}
				break;
			case CHAR_:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// myParser.g:88:17: arithmetic_
					{
					pushFollow(FOLLOW_arithmetic__in_assign_value_746);
					arithmetic_();
					state._fsp--;

					}
					break;
				case 2 :
					// myParser.g:88:31: BL_BRACK DEC_NUM BR_BRACK
					{
					match(input,BL_BRACK,FOLLOW_BL_BRACK_in_assign_value_750); 
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_assign_value_752); 
					match(input,BR_BRACK,FOLLOW_BR_BRACK_in_assign_value_754); 
					}
					break;
				case 3 :
					// myParser.g:88:59: STRING_
					{
					match(input,STRING_,FOLLOW_STRING__in_assign_value_758); 
					}
					break;
				case 4 :
					// myParser.g:88:69: CHAR_
					{
					match(input,CHAR_,FOLLOW_CHAR__in_assign_value_762); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_value_"



	// $ANTLR start "return_"
	// myParser.g:89:1: return_ : RETURN_ arithmetic_ SEMIC_ ;
	public final void return_() throws RecognitionException {
		try {
			// myParser.g:89:9: ( RETURN_ arithmetic_ SEMIC_ )
			// myParser.g:89:11: RETURN_ arithmetic_ SEMIC_
			{
			match(input,RETURN_,FOLLOW_RETURN__in_return_769); 
			pushFollow(FOLLOW_arithmetic__in_return_771);
			arithmetic_();
			state._fsp--;

			match(input,SEMIC_,FOLLOW_SEMIC__in_return_773); 
			 if(TRACEON) System.out.println("return"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "return_"



	// $ANTLR start "break_"
	// myParser.g:90:1: break_ : BREAK_ SEMIC_ ;
	public final void break_() throws RecognitionException {
		try {
			// myParser.g:90:8: ( BREAK_ SEMIC_ )
			// myParser.g:90:10: BREAK_ SEMIC_
			{
			match(input,BREAK_,FOLLOW_BREAK__in_break_782); 
			match(input,SEMIC_,FOLLOW_SEMIC__in_break_784); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "break_"

	// Delegated rules



	public static final BitSet FOLLOW_declare_semic_in_program22 = new BitSet(new long[]{0x0000002080002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_function__in_program24 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program26 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_types__in_declare_42 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_declare_44 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_declare_value__in_declare_47 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_declare_other__in_declare_49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_declare_54 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_declare_value__in_declare_58 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_declare_other__in_declare_60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare__in_declare_semic67 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_declare_semic69 = new BitSet(new long[]{0x0000002880002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_declare_semic_in_declare_semic71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_types_88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_TYPE_in_types_95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_types_102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_TYPE_in_types_109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_OP_in_declare_value_120 = new BitSet(new long[]{0x0400500808041100L,0x0000000000000008L});
	public static final BitSet FOLLOW_assign_value__in_declare_value_122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA__in_declare_other_131 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_declare_other_133 = new BitSet(new long[]{0x0000000000008040L});
	public static final BitSet FOLLOW_declare_value__in_declare_other_136 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_declare_other__in_declare_other_138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arithmetic_147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numbers__in_arithmetic_151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arithmetic_155 = new BitSet(new long[]{0x43ED1E86046000B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_operators__in_arithmetic_157 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_arithmetic_159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arithmetic_163 = new BitSet(new long[]{0x43ED1E86046000B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_operators__in_arithmetic_165 = new BitSet(new long[]{0x0000100008040000L});
	public static final BitSet FOLLOW_numbers__in_arithmetic_167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arithmetic_171 = new BitSet(new long[]{0x43ED1E86046000B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_operators__in_arithmetic_173 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CHAR__in_arithmetic_175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numbers__in_arithmetic_183 = new BitSet(new long[]{0x43ED1E86046000B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_operators__in_arithmetic_185 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_arithmetic_187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numbers__in_arithmetic_191 = new BitSet(new long[]{0x43ED1E86046000B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_operators__in_arithmetic_193 = new BitSet(new long[]{0x0000100008040000L});
	public static final BitSet FOLLOW_numbers__in_arithmetic_195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ppmm_id__in_arithmetic_199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call__in_arithmetic_203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_numbers_220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_numbers_227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_OP_in_numbers_234 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DEC_NUM_in_numbers_236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_OP_in_numbers_243 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_numbers_245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ppmm_op__in_ppmm_id_354 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_ppmm_id_356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ppmm_id_360 = new BitSet(new long[]{0x0400400000000000L});
	public static final BitSet FOLLOW_ppmm_op__in_ppmm_id_362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_types__in_function_381 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_function_383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SL_BRACK_in_function_385 = new BitSet(new long[]{0x0000002880002000L,0x0000000000000024L});
	public static final BitSet FOLLOW_argument__in_function_387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SR_BRACK_in_function_389 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BL_BRACK_in_function_391 = new BitSet(new long[]{0x2400403980002600L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_function_393 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_function_395 = new BitSet(new long[]{0x0000002080002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_function__in_function_397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare__in_argument_406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_argument_410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_content_420 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_content_429 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_content_438 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch__in_content_446 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declare__in_content_453 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_content_455 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call__in_content_465 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_content_467 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign__in_content_476 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return__in_content_484 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_break__in_content_491 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_content_493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF__in_if_506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SL_BRACK_in_if_508 = new BitSet(new long[]{0x0400500808040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic__in_if_510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SR_BRACK_in_if_512 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BL_BRACK_in_if_514 = new BitSet(new long[]{0x2400403980002600L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_if_516 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_if_518 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_else__in_if_520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE__in_else_529 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_if__in_else_531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE__in_else_536 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BL_BRACK_in_else_538 = new BitSet(new long[]{0x2400403980002600L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_else_540 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_else_542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE__in_while_554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SL_BRACK_in_while_556 = new BitSet(new long[]{0x0400500808040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic__in_while_558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SR_BRACK_in_while_560 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BL_BRACK_in_while_562 = new BitSet(new long[]{0x2400403980002600L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_while_564 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_while_567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR__in_for_577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SL_BRACK_in_for_579 = new BitSet(new long[]{0x0000002880002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_declare__in_for_581 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_for_583 = new BitSet(new long[]{0x8400500808040000L});
	public static final BitSet FOLLOW_arithmetic__in_for_585 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_for_587 = new BitSet(new long[]{0x0400500808040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic__in_for_589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SR_BRACK_in_for_591 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BL_BRACK_in_for_593 = new BitSet(new long[]{0x2400403980002600L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_for_595 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_for_597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH__in_switch_607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SL_BRACK_in_switch_609 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_switch_611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SR_BRACK_in_switch_613 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BL_BRACK_in_switch_615 = new BitSet(new long[]{0x0000000000080C00L});
	public static final BitSet FOLLOW_case__in_switch_617 = new BitSet(new long[]{0x0000000000080400L});
	public static final BitSet FOLLOW_default__in_switch_619 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_switch_621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE__in_case_628 = new BitSet(new long[]{0x0000000000041000L});
	public static final BitSet FOLLOW_set_in_case_630 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_COLON__in_case_638 = new BitSet(new long[]{0x2400403980002A00L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_case_640 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_case__in_case_642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT__in_default_652 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_COLON__in_default_654 = new BitSet(new long[]{0x2400403980002200L,0x0000000000000070L});
	public static final BitSet FOLLOW_content__in_default_656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_function_call_665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SL_BRACK_in_function_call_667 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_SR_BRACK_in_function_call_674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign_685 = new BitSet(new long[]{0x0104080004200000L});
	public static final BitSet FOLLOW_assign_op__in_assign_687 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_assign_690 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_ID_in_assign_694 = new BitSet(new long[]{0x43ED1E86046000B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_operators__in_assign_696 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_assign_698 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_ID_in_assign_703 = new BitSet(new long[]{0x0104080004200000L});
	public static final BitSet FOLLOW_assign_op__in_assign_705 = new BitSet(new long[]{0x0000100008040000L});
	public static final BitSet FOLLOW_numbers__in_assign_707 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_ppmm_id__in_assign_711 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_assign_714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic__in_assign_value_746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BL_BRACK_in_assign_value_750 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DEC_NUM_in_assign_value_752 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BR_BRACK_in_assign_value_754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING__in_assign_value_758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR__in_assign_value_762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN__in_return_769 = new BitSet(new long[]{0x8400500808040000L});
	public static final BitSet FOLLOW_arithmetic__in_return_771 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_return_773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK__in_break_782 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SEMIC__in_break_784 = new BitSet(new long[]{0x0000000000000002L});
}
