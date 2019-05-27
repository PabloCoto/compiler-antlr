lexer grammar Lexicon
	;
	
/* reserved words */
INT: 'int';
FLOAT: 'float';
CHAR: 'char';

/* constants */
INT_CONSTANT : [0-9]+;
REAL_CONSTANT : [0-9]+ '.' [0-9]+;
CHAR_CONSTANT : '\''(.|'\\n')'\'';
	
/* ident token */
IDENT : [a-zA-Z_][a-zA-Z0-9_]*;
	
/* to skip */
LINE_COMMENT:	'//' .*? '\n'	-> skip;
MULTILINE_COMMENT:	'/*' .*? '*/'	-> skip;
WHITESPACE: [ \t\r\n]+ -> skip;