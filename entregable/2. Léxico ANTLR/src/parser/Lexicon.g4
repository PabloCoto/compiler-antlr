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

WHITESPACE
	: [ \t\r\n]+ -> skip;
