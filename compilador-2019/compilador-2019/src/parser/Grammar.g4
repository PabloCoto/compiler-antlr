grammar Grammar
	;
import Lexicon
	;

@parser::header {
    import ast.*;
}

start returns[Programa ast]
	: definiciones EOF { $ast = new Programa($definiciones.list); }
	;

definiciones returns[List<Definicion> list = new ArrayList<Definicion>()]
	: (defVariable { $list.add($defVariable.ast); } |defStruct { $list.add($defStruct.ast); }|defFuncion { $list.add($defFuncion.ast); })*
	;

defVariable returns[DefVariable ast]
	: 'var' IDENT ':' tipo ';' { $ast = new DefVariable($IDENT.text, $tipo.ast); }
	;
	
defStruct returns[DefStruct ast]
	: 'struct' IDENT '{' cuerpoStruct '}' ';' { $ast = new DefStruct($IDENT.text, $cuerpoStruct.list); }
	;
	
cuerpoStruct returns[List<CuerpoStruct> list = new ArrayList<CuerpoStruct>()]
	: (IDENT ':' tipo ';' { $list.add(new CuerpoStruct($IDENT.text, $tipo.ast)); } )* 
	;

tipo returns[Tipo ast]
	: 'int' {  $ast = new TipoEntero(); }
	| 'float' {  $ast = new TipoReal(); }
	| 'char' {  $ast = new TipoChar(); }
	| IDENT {  $ast = new TipoStruct($IDENT.text); }
	| tipoArray {  $ast = $tipoArray.ast; }
	;

tipoArray returns[TipoArray ast]
	: '[' INT_CONSTANT ']' tipo {  $ast = new TipoArray($INT_CONSTANT.text, $tipo.ast); }
	;

defFuncion returns[DefFuncion ast]
	: IDENT '(' listaParametros ')' (':' tipo)? '{' cuerpoFuncion '}'
		{  $ast = new DefFuncion($IDENT.text, $listaParametros.list, $tipo.ast, $cuerpoFuncion.ast); }
	;
	
listaParametros returns[List<Param> list = new ArrayList<Param>();]
	: (paramFuncion {$list.add($ctx.paramFuncion(0).ast);} (',' paramFuncion {$list.add($ctx.paramFuncion(1).ast);} )*)?
	; 
	
paramFuncion returns[Param ast]
	: IDENT ':' tipo {  $ast = new Param($IDENT.text, $tipo.ast); }
	;
	
cuerpoFuncion returns[CuerpoFuncion ast]
	:  variables sentencias {$ast = new CuerpoFuncion($variables.list, $sentencias.list);}
	;
	
variables returns[List<DefVariable> list = new ArrayList<DefVariable>();]
	: (defVariable { $list.add($defVariable.ast); })*
	;
	
sentencias returns[List<Sentencia> list = new ArrayList<Sentencia>();]
	: (sentencia { $list.add($sentencia.ast); })*
	;
	
sentencia returns[Sentencia ast]
	: 'return' expresion? ';' { $ast = new Return($expresion.ast); }
	| expresion '=' expresion ';' { $ast = new Asignacion($ctx.expresion(0).ast, $ctx.expresion(1).ast); }
	| 'printsp' expresion ';' { $ast = new Print($expresion.ast); }
	| 'print' expresion ';' { $ast = new Print($expresion.ast); }
	| 'println' expresion? ';' { $ast = new Print($expresion.ast); }
	| 'read' expresion ';' { $ast = new Read($expresion.ast); }
	| bucleWhile { $ast = $bucleWhile.ast; }
	| bucleIf { $ast = $bucleIf.ast; }
	| IDENT '(' (parametrosInvocacion)? ')' ';' { $ast = new InvocacionFuncion($IDENT.text, $parametrosInvocacion.list); }
	;
	
parametrosInvocacion returns[List<Expresion> list = new ArrayList<Expresion>()]
	: expresion  {$list.add($expresion.ast);} (',' expresion {$list.add($expresion.ast);})* 
	;

expresion returns[Expresion ast]
	: IDENT { $ast = new Variable($IDENT.text);}
	| INT_CONSTANT { $ast = new LiteralInt($INT_CONSTANT.text);}
	| REAL_CONSTANT { $ast = new LiteralReal($REAL_CONSTANT.text);}
	| CHAR_CONSTANT { $ast = new LiteralChar($CHAR_CONSTANT.text);}
	| '(' expresion ')' { $ast = $expresion.ast;}
	| expresion '[' expresion ']' { $ast = new AccesoArray($ctx.expresion(0).ast, $ctx.expresion(1).ast);}
	| expresion '.' IDENT { $ast = new AccesoStruct($expresion.ast, $IDENT.text);}
	| 'cast' '<' tipo '>' '(' expresion ')' { $ast = new Cast($tipo.ast, $expresion.ast);}
	| '!' expresion { $ast = new Negacion($expresion.ast);}
	|  expresion op=('*'|'/') expresion   { $ast = new ExpresionAritmetica($ctx.expresion(0).ast, $op.text, $ctx.expresion(1).ast);}
	|  expresion op=('+'|'-') expresion  { $ast = new ExpresionAritmetica($ctx.expresion(0).ast, $op.text, $ctx.expresion(1).ast);}
	| expresion op=('>'|'>='|'<'|'<=') expresion { $ast = new ExpresionBinaria($ctx.expresion(0).ast, $op.text, $ctx.expresion(1).ast);}
	| expresion op=('=='|'!=') expresion { $ast = new ExpresionBinaria($ctx.expresion(0).ast, $op.text, $ctx.expresion(1).ast);}
	| expresion op='&&' expresion { $ast = new ExpresionBinaria($ctx.expresion(0).ast, $op.text, $ctx.expresion(1).ast);}
	| expresion op='||' expresion { $ast = new ExpresionBinaria($ctx.expresion(0).ast, $op.text, $ctx.expresion(1).ast);}
	| IDENT '(' (parametrosInvocacion)? ')' { $ast = new InvocacionFuncion($IDENT.text, $parametrosInvocacion.list);}
	;

bucleWhile returns[BucleWhile ast]
	: 'while' '(' expresion ')' '{' sentencias '}' { $ast = new BucleWhile($expresion.ast, $sentencias.list);}
	;
	
bucleIf returns[BucleIf ast]
	: 'if' '(' expresion ')' '{' sentencias '}' ('else' '{' sentencias '}')? { $ast = new BucleIf($expresion.ast, $ctx.sentencias(0).list, $ctx.sentencias(1).list);}
	;