lexer grammar Lexicon;

INT_CONSTANT
	: [0-9]+;
	
REAL_CONSTANT
	: [0-9]+ '.' [0-9]+;
	
MAS
	: '+';
	
DISTINTO
	: '!=';

IGUAL
	: '=' ;
	
DATA
	: 'DATA';

CODE
	: 'CODE';

INT
	: 'int';
REAL
	: 'real';
	
ID
	: [a-zA-Z][a-zA-Z0-9_]*;
	
LINE_COMMENT
	: '//' .*? '\n' -> skip;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip;

WHITESPACE
	: [ \t\r\n]+ -> skip;
