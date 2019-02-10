grammar Grammar;
import Lexicon;

start 
	: DATA variables CODE sentencias EOF;
	
variables
	: variable variables
	| variable
	;
	
variable
	: TIPO ID ';' 
	;
	
TIPO
	: INT
	| REAL
	;

sentencias
	: sentencia sentencias
	| sentencia
	;

sentencia 
	: read
	| print
	| ifCondicion
	| asignacion
	| bucleWhile
	;
	
print
	: 'print' expresion ';' 
	;

expresion 
	: ID 
	| INT_CONSTANT 
	| REAL_CONSTANT 
	| cast 
	| expresion MAS expresion 
	| expresion DISTINTO expresion
	| '(' expresion ')'
	;
	
asignacion 
	: ID IGUAL expresion ';'
	;

cast 
	: '<' TIPO '>' '(' expresion ')' 
	;

read
	: 'read' ID ';'
	;

ifCondicion
	: 'if' cuerpoCondicion body
	| 'if' cuerpoCondicion body 'else' body
	;
	
bucleWhile
	: 'while' cuerpoCondicion body
	;
	
cuerpoCondicion
	: '(' expresion ')' 
	;
	
body
	: '{' cuerpoSentencia '}'
	;
	
cuerpoSentencia
	: sentencia sentencias
	| sentencia
	;

invocacionFuncion
	: ID '(' (params)+ ';'
	;
	
params 
	: expresion (',' expresion)* ;
