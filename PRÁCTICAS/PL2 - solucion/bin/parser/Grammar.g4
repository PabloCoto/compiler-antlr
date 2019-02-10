grammar Grammar;
import Lexicon;

start
	: 'DATA' definicion+ 'CODE' sentencia+;

definicion
	: tipo IDENT ';';

tipo
	: 'int'
	| 'real';

sentencia
	: 'print' expr ';'
	| 'read' IDENT ';'
	| IDENT '=' expr ';'
	| 'if' '(' expr ')' '{' sentencia+ '}'
	| 'if' '(' expr ')' '{' sentencia+ '}' 'else' '{' sentencia+ '}'
	| 'while' '(' expr ')' '{' sentencia+ '}';

expr
	: INT_CONSTANT
	| REAL_CONSTANT
	| IDENT
	| expr '+' expr
	| expr '!=' expr
	| '(' expr ')'
	| '<' tipo '>' '(' expr ')';
