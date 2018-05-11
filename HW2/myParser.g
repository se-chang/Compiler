grammar myParser;

@members {
	boolean TRACEON = false;
}

program : declare_semic function_ EOF	{ System.out.println("\nDONE!!\n"); };

declare_ : (types_|) star_ id_ declare_value_ declare_other_;
declare_semic : declare_ SEMIC_ declare_semic |;
types_ : INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | LONG_TYPE LONG_TYPE | SHORT_TYPE;
star_ : MULTI_OP  star_ |;
id_ : (NOT_OP | MINUS_OP|) ID array_;
array_ : ML_BRACK (DEC_NUM | ID | ppmm_id_) MR_BRACK |;
declare_value_ : ASSIGN_OP assign_value_ |;
declare_other_ : COMMA_ (types_ |) star_ ID array_ declare_value_ declare_other_ |;
arithmetic_ : id_ | numbers_ | id_ operators_ id_ | id_ operators_ numbers_ | id_ operators_ CHAR_ | 
			numbers_ operators_ id_ | numbers_ operators_ numbers_ | ppmm_id_ | function_call_ |;
numbers_ : DEC_NUM | FLOAT_NUM | MINUS_OP DEC_NUM | MINUS_OP FLOAT_NUM;
operators_ : PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | 
	EQ_OP | LE_OP | GE_OP | NE_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP |
	AND_OP | OR_OP | AMPERSAND_ | BIT_OR_OP | NOT_OP | XOR_OP;
ppmm_id_ : ppmm_op_ ID | ID ppmm_op_;
ppmm_op_ : PP_OP | MM_OP;

function_ : types_ ID SL_BRACK argument_ SR_BRACK BL_BRACK content_ BR_BRACK function_ |;
argument_ : declare_ | VOID_TYPE | ;
content_ : if_ content_		
	| while_ content_ 	
	| for_ content_ 
	| switch_ content_
	| declare_ SEMIC_ content_ 	{ if (TRACEON) System.out.println("declare");}
	| function_call_ SEMIC_ content_ 	
	| assign_ content_ 
	| return_ content_
	| break_ content_	{ if (TRACEON) System.out.println("break");}
	|;

if_ : IF_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK else_	{ if (TRACEON) System.out.println("if");};
else_ : ELSE_ if_ { if (TRACEON) System.out.println("else if");}| ELSE_ BL_BRACK content_ BR_BRACK { if (TRACEON) System.out.println("else");}|	;	
while_ : WHILE_ SL_BRACK arithmetic_ SR_BRACK BL_BRACK content_  BR_BRACK	{ if (TRACEON) System.out.println("while");};	
for_ : FOR_ SL_BRACK declare_ SEMIC_ arithmetic_ SEMIC_ arithmetic_ SR_BRACK BL_BRACK content_ BR_BRACK	{ if (TRACEON) System.out.println("for");};	
switch_ : SWITCH_ SL_BRACK ID SR_BRACK BL_BRACK case_ default_ BR_BRACK;
case_ : CASE_ (DEC_NUM | CHAR_) COLON_ content_ case_  |;
default_ : DEFAULT_ COLON_ content_ |;
function_call_ : ID SL_BRACK (.)* SR_BRACK	{ if (TRACEON) System.out.println("function");};	
assign_ : (ID array_ assign_op_ (id_ | id_ operators_ id_) | ID array_ assign_op_ numbers_ | ppmm_id_) SEMIC_	{ if (TRACEON) System.out.println("assign");};
assign_op_ : EQ_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP;
assign_value_ : arithmetic_ | BL_BRACK DEC_NUM BR_BRACK | STRING_ | CHAR_;
return_ : RETURN_ arithmetic_ SEMIC_ { if(TRACEON) System.out.println("return"); };
break_ : BREAK_ SEMIC_ ;


/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
DOUBLE_TYPE : 'double'; 
LONG_TYPE : 'long';
SHORT_TYPE : 'short';
WHILE_    : 'while';
FOR_      : 'for';
IF_       : 'if';
ELSE_     : 'else';
SWITCH_   : 'switch';
CASE_     : 'case';
BREAK_    : 'break';
DEFAULT_  : 'default';
CONTINUE_ : 'continue';
RETURN_ : 'return';
EOF_ : 'EOF';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
LT_OP : '<';
GT_OP : '>';

PLUS_OP : '+';
MINUS_OP : '-';
MULTI_OP : '*';
DIVID_OP : '/';
MOD_OP : '%';

ASSIGN_OP : '=';
PLUS_E_OP : '+=';
MINUS_E_OP : '-=';
MULTI_E_OP : '*=';
DIVID_E_OP : '/=';
MOD_E_OP : '%=';

AND_OP : '&&';
OR_OP : '||';
BIT_OR_OP : '|';
NOT_OP : '!';
XOR_OP : '^';

COMMA_ : ',';
SEMIC_ : ';';
COLON_ : ':';
QUESTION_ : '?';
AMPERSAND_ : '&';
SL_BRACK : '(';
SR_BRACK : ')';
ML_BRACK : '[';
MR_BRACK : ']';
BL_BRACK : '{';
BR_BRACK : '}';

PRE_PROCESS : '#'(.)*'\n' {$channel=HIDDEN;};

STRING_ : '"'(.)*'"';
CHAR_ : ('\''(.)*'\'');

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n' {$channel=HIDDEN;};
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/' {$channel=HIDDEN;};


NEW_LINE: '\n' {skip();};

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+ {skip();}
    ;
