grammar myParser;

@header {
	import java.util.HashMap;
}

@members {
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
}

program : declare_semic function_ EOF	{ System.out.println("\nDONE!!\n"); };

declare_ returns [int attr_type] : 
	  types_ ID {
		if(!symtab.containsKey($ID.text)) {
			symtab.put($ID.text, $types_.attr_type);
		}
		else {
			System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier " + $ID.getText());
			$attr_type = -2;
		}
	  }
	  declare_value_ [$types_.attr_type] {
		if($types_.attr_type != $declare_value_.attr_type) {
			System.out.println("Type Error: " + $ID.getLine() + ":Unmatched type for declare_value " + $declare_value_.attr_type);
		}
	  }
	  declare_other_ [$types_.attr_type] {
		
	  }
	| // not using type, check if already declare
	  ID {
		if(!symtab.containsKey($ID.text)) {
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText());
			$attr_type = -1;
		}
		else {
			$attr_type = symtab.get($ID.text);
		}
	} declare_value_[$attr_type] declare_other_[$attr_type];
declare_semic : declare_ SEMIC_ declare_semic |;
types_ returns [int attr_type] : 
	  INT_TYPE { $attr_type = 1; }
	| CHAR_TYPE { $attr_type = 2; }
	| VOID_TYPE { $attr_type = 3; }
	| FLOAT_TYPE { $attr_type = 4; }
	;
declare_value_ [int parent_type] returns [int attr_type]: ASSIGN_OP assign_value_ { $attr_type = $assign_value_.attr_type; }
	| { $attr_type = $parent_type; };
declare_other_[int parent_type] returns [int attr_type]: COMMA_ ID{
	if(!symtab.containsKey($ID.text)) {
		symtab.put($ID.text, $parent_type);
	}
	else {
		System.out.println("Type Error: " + $ID.getLine() + ": Redclared identifier " + $ID.getText());
		$attr_type = -2;
	}
	}declare_value_[$parent_type] declare_other_[$parent_type] |;
arithmetic_ returns [int attr_type] : 
	  ID { 
		if(!symtab.containsKey($ID.text))
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText());
		else
			$attr_type = symtab.get($ID.text); 
		} 
	| numbers_ { $attr_type = $numbers_.attr_type; }
	| a = ID operators_ b = ID {
		if(!symtab.containsKey($a.text)) 
			System.out.println("Type Error: " + $a.getLine() + ": Undeclared identifier " + $a.getText());
		if(!symtab.containsKey($b.text)) 
			System.out.println("Type Error: " + $b.getLine() + ": Undeclared identifier " + $b.getText());
		if(symtab.get($a.text) != symtab.get($b.text))
			System.out.println("Type Error: " + $a.getLine() + ": Type mismatch: " + $a.getText() + " and " + $b.getText());
		else
			$attr_type = symtab.get($a.text);
		}
	| ID operators_ numbers_ {
		if(!symtab.containsKey($ID.text))
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText()); 	
		else if(symtab.get($ID.text) != $numbers_.attr_type)
			System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch with the number: " + $ID.getText());
		else
			$attr_type = $numbers_.attr_type;
		}
	| ID operators_ CHAR_ {
		if(!symtab.containsKey($ID.text))
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText()); 	
		else if(symtab.get($ID.text) != 2)
			System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch with CHAR: " + $ID.getText());
		else
			$attr_type = 2;
		}
	| numbers_ operators_ ID {
		if(!symtab.containsKey($ID.text))
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText()); 	
		else if(symtab.get($ID.text) != $numbers_.attr_type)
			System.out.println("Type Error: " + $ID.getLine() + ": Type mismatch with the number: " + $ID.getText());
		else
			$attr_type = $numbers_.attr_type;
		}
	| c = numbers_ operators_ d = numbers_ {
		if($c.attr_type != $d.attr_type)
			System.out.println("Type Error: " + $c.start.getLine() + ": Type mismatch between two numbers" + $c.text);
		else
			$attr_type = $c.attr_type;
		}
	| ppmm_id_ {
			$attr_type = $ppmm_id_.attr_type;
		}
	| function_call_ {
			$attr_type = $function_call_.attr_type;
		};
numbers_ returns [int attr_type] : 
	  DEC_NUM { $attr_type = 1; }
	| FLOAT_NUM { $attr_type = 4; }
	| MINUS_OP DEC_NUM { $attr_type = 1; }
	| MINUS_OP FLOAT_NUM { $attr_type = 4; }
	;
operators_ : PLUS_OP | MINUS_OP | MULTI_OP | DIVID_OP | MOD_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP | 
	EQ_OP | LE_OP | GE_OP | NE_OP | RSHIFT_OP | LSHIFT_OP | LT_OP | GT_OP |
	AND_OP | OR_OP | AMPERSAND_ | BIT_OR_OP | NOT_OP | XOR_OP;
ppmm_id_ returns [int attr_type]: 
	  ppmm_op_ ID {
		if(!symtab.containsKey($ID.text)){
			$attr_type = -2;
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText()); 	
		}
		else{
			$attr_type = symtab.get($ID.text);
		}
	  }
	| ID ppmm_op_ {
		if(!symtab.containsKey($ID.text)){
			$attr_type = -2;
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText()); 	
		}
		else{
			$attr_type = symtab.get($ID.text);
		}
	}
	;
ppmm_op_ : PP_OP | MM_OP;

function_ returns [int attr_type]: types_ ID {
		if(!symtab.containsKey($ID.text)) {
			symtab.put($ID.text, $types_.attr_type);
		}
		else {
			System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier " + $ID.getText());
			$attr_type = -2;
		}
	}SL_BRACK argument_ SR_BRACK BL_BRACK content_ BR_BRACK function_ |;
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
function_call_ returns [int attr_type] : ID SL_BRACK (.)* SR_BRACK{
		if(!symtab.containsKey($ID.text)){
			$attr_type = -2;
			System.out.println("Type Error: " + $ID.getLine() + ": Undeclared identifier " + $ID.getText()); 	
		}
		else{
			$attr_type = symtab.get($ID.text);
		}
	};
	
assign_ : (ID assign_op_ (ID | ID operators_ ID) | ID assign_op_ numbers_ | ppmm_id_) SEMIC_	{ if (TRACEON) System.out.println("assign");};
assign_op_ : EQ_OP | PLUS_E_OP | MINUS_E_OP | MULTI_E_OP | DIVID_E_OP;
assign_value_ returns [int attr_type]: arithmetic_{ $attr_type = $arithmetic_.attr_type; } | CHAR_ { $attr_type = 2; };
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
