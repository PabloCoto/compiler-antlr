lexer grammar Lexicon;

INT_CONSTANT
	: [0-9]+;
REAL_CONSTANT
	: [0-9]+ '.' [0-9]+;
IDENT
	: [a-zA-Z_][a-zA-Z0-9_]+;

COMMENT
	: '/*' .*? '*/' -> skip;

WHITESPACE
	: [ \t\r\n]+ -> skip;
