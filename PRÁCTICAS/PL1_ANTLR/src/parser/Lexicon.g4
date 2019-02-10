/*
Añadir EN ESTE ORDEN:
- En el main, además del token, imprimir el lexema, línea y columna.
- Identificadores. Deben empezar por letra y luego puede ser letra, dígito o subrayado '_'.
- Palabras reservadas: read, write, int y float.
- Operadores aritméticos y otros simbolos:  + - = ;
- Constantes reales: 3.15, 78.23, ... (parte entera obligatoria/ parte decimal OBLIGATORIA).
- Comentarios de una línea y multilinea.

- Leer "Tarea.pdf" y hacerlo antes de la siguiente clase práctica
*/

lexer grammar Lexicon;

INT_CONSTANT
	: [0-9]+;

REAL_CONSTANT
	: [0-9]+ '.' [0-9]+;

MAS
	: '+';
MENOS
	: '-';
IGUAL
	: '=';
PTO_COMA
	: ';';

READ
	: 'read';
WRITE
	: 'write';
INT
	: 'int';
FLOAT
	: 'float';

IDENT
	: [a-zA-Z][a-zA-Z0-9_]*;

LINE_COMMENT
	: '//' .*? '\n' -> skip;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip;

WHITESPACE
	: [ \t\r\n]+ -> skip;
