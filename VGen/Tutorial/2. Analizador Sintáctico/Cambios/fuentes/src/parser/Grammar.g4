grammar Grammar
	;
import Lexicon
	;

start: 'DATA' variable* 'CODE' sentence*;

variable: tipo IDENT ';';

tipo: 'float' | 'int';

sentence: 'print' expr ';' | expr '=' expr ';';

expr
	: expr ('*' | '/') expr
	| expr ('+' | '-') expr
	| '(' expr ')'
	| IDENT
	| INT_CONSTANT
	| REAL_CONSTANT
	;
