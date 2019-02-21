grammar Grammar
	;
import Lexicon
	;

start: (definicion)* EOF;

definicion :defVariable|defStruct|defFuncion
	;

defVariable: 'var' IDENT ':' tipo ';'
	;
	
defStruct: 'struct' IDENT '{' cuerpoStruct* '}' ';'
	;
	
cuerpoStruct : (IDENT ':' tipo ';')
	;

tipo: 'int'
	| 'float'
	| 'char'
	| IDENT
	| tipoArray
	;

tipoArray: '[' INT_CONSTANT ']' tipo
	;

defFuncion: IDENT '(' (paramFuncion (',' paramFuncion)*)? ')' (':' tipo)? '{' cuerpoFuncion '}'
	;
	
paramFuncion: IDENT ':' tipo
	;
	
cuerpoFuncion: (defVariable|defStruct)* sentencia*
	;
	
sentencia: 'return' expresion? ';'
	| expresion '=' expresion ';'
	| 'printsp' expresion ';'
	| 'print' expresion ';'
	| 'println' expresion? ';'
	| 'read' expresion ';'
	| bucleWhile
	| bucleIf
	| IDENT '(' (expresion (',' expresion)*)? ')' ';'
	;

expresion: IDENT
	| INT_CONSTANT
	| REAL_CONSTANT
	| CHAR_CONSTANT
	| '(' expresion ')'
	| expresion '[' expresion ']'
	| expresion '.' expresion
	| 'cast' '<' tipo '>' '(' expresion ')'
	| '!' expresion 
	|  expresion '*' expresion  
	|  expresion '/' expresion  
	|  expresion '%' expresion  
	|  expresion '+' expresion  
	|  expresion '-' expresion
	| expresion '>' expresion 
	| expresion '>=' expresion 
	| expresion '<' expresion 
	| expresion '<=' expresion 
	| expresion '!=' expresion 
	| expresion '==' expresion 
	| expresion '&&' expresion 
	| expresion '||' expresion 
	| IDENT '(' (expresion (',' expresion)*)? ')'
	;

bucleWhile: 'while' '(' expresion ')' '{' sentencia* '}'
	;
	
bucleIf: 'if' '(' expresion ')' '{' sentencia* '}' ('else' '{' sentencia* '}')?
	;