grammar Grammar
	;
import Lexicon
	;

start: first* EOF;

first: defVariable
	| arrayDef
	| structDef
	| defFuncion
	;

defVariable: 'var' IDENT ':' tiposCompuestos ';'
	;
	
arrayDef: 'var' IDENT ':' ('[' INT_CONSTANT ']')+ tiposCompuestos ';'
	;
	
structDef : 'struct' IDENT '{' cuerpoStruct+ '}' ';'
	;
	
cuerpoStruct : IDENT ':' tiposCompuestos ';'
	| IDENT ':' ('[' INT_CONSTANT ']')+ tiposCompuestos ';'
	;

tiposSimples: 'int'
	| 'float'
	| 'char'
	;
	
tiposCompuestos: tiposSimples 
	| IDENT
	;

defFuncion: IDENT '(' (paramFuncion (',' paramFuncion)*)? ')' (':' tiposSimples)? '{' cuerpoFuncion '}'
	;
	
paramFuncion: IDENT ':' tiposSimples
	;
	
cuerpoFuncion: (defVariable|arrayDef|structDef)* sentencia*
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
	| 'cast' '<' tiposSimples '>' expresion
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
	
bucleIf: 'if' '(' expresion+ ')' '{' sentencia* '}' ('else' '{' sentencia* '}')?
	;

