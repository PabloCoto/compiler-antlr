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
	
definiciones returns [List<Definicion> list = new ArrayList<Definicion>()]
	: (definicion{$list.add($definicion.ast);})*
	;
	
definicion returns[Definicion ast]
	: defVariable {$ast = $defVariable.ast;}
	| defStruct {$ast = $defStruct.ast;}
	| defFuncion {$ast = $defFuncion.ast;}
	;

defVariable returns[DefVariable ast]
	: 'var' IDENT ':' tipo ';' { $ast = new DefVariable($IDENT, $tipo.ast); }
	;
	
defStruct returns[DefStruct ast]
	: 'struct' IDENT '{' cuerpoStruct '}' ';' { $ast = new DefStruct($IDENT, $cuerpoStruct.list); }
	;
	
defFuncion returns[DefFuncion ast]
	: IDENT listaParametros (':')? tipo  '{' variables sentencias '}' {  $ast = new DefFuncion($IDENT, $listaParametros.list, $tipo.ast, $variables.list, $sentencias.list); }
	;
	
tipo returns[Tipo ast]
	: 'int' {  $ast = new TipoEntero(); }
	| 'float' {  $ast = new TipoReal(); }
	| 'char' {  $ast = new TipoChar(); }
	| IDENT {  $ast = new TipoStruct($IDENT); }
	| tipoArray {  $ast = $tipoArray.ast; }
	| {  $ast = new TipoVoid(); }
	;
	
cuerpoStruct returns[List<CuerpoStruct> list = new ArrayList<CuerpoStruct>()]
	: (IDENT ':' tipo ';' { $list.add(new CuerpoStruct($IDENT, $tipo.ast)); } )* 
	;

tipoArray returns[Tipo ast]
	: '[' INT_CONSTANT ']' tipo {  $ast = new TipoArray($INT_CONSTANT, $tipo.ast); }
	;


listaParametros returns[List<Param> list = new ArrayList<Param>();]
	: '(' (paramFuncion{$list.add($paramFuncion.ast);}(',' paramFuncion{$list.add($paramFuncion.ast);})*) ')'
	|  '(' ')'
	;

	
paramFuncion returns[Param ast]
	: IDENT ':' tipo {  $ast = new Param($IDENT, $tipo.ast); }
	;
	
variables returns[List<DefVariable> list = new ArrayList<DefVariable>();]
	: (defVariable { $list.add($defVariable.ast); })*
	;
	
sentencias returns[List<Sentencia> list = new ArrayList<Sentencia>();]
	: (sentencia { $list.add($sentencia.ast); })*
	;
	
sentencia returns[Sentencia ast]
	: 'return' expresion ';' { $ast = new Return($expresion.ast); }
	| 'return' ';' { $ast = new Return(null); }
	| expresion '=' expresion ';' { $ast = new Asignacion($ctx.expresion(0).ast, $ctx.expresion(1).ast); }
	| 'printsp' expresion ';' { $ast = new Print($expresion.ast); }
	| 'print' expresion ';' { $ast = new Print($expresion.ast); }
	| 'println' expresion? ';' { $ast = new Print($expresion.ast); }
	| 'read' expresion ';' { $ast = new Read($expresion.ast); }
	| bucleWhile { $ast = $bucleWhile.ast; }
	| bucleIf { $ast = $bucleIf.ast; }
	| IDENT '(' (parametrosInvocacion)? ')' ';' { $ast = new InvocacionFuncion($IDENT, $parametrosInvocacion.list); }
	;
	
parametrosInvocacion returns[List<Expresion> list = new ArrayList<Expresion>()]
	: expresion  {$list.add($expresion.ast);} (',' expresion {$list.add($expresion.ast);})* 
	;

expresion returns[Expresion ast]
	: IDENT { $ast = new Variable($IDENT);}
	| INT_CONSTANT { $ast = new LiteralInt($INT_CONSTANT);}
	| REAL_CONSTANT { $ast = new LiteralReal($REAL_CONSTANT);}
	| CHAR_CONSTANT { $ast = new LiteralChar($CHAR_CONSTANT);}
	| '(' ex=expresion ')' { $ast = $ex.ast;}
	| ex1=expresion '[' ex2=expresion ']' { $ast = new AccesoArray($ex1.ast, $ex2.ast);}
	| ex=expresion '.' IDENT { $ast = new AccesoStruct($ex.ast, $IDENT);}
	| 'cast' '<' tipo '>' '(' ex=expresion ')' { $ast = new Cast($tipo.ast, $ex.ast);}
	| '!' ex=expresion { $ast = new Negacion($ex.ast);}
	|  ex1=expresion op=('*'|'/') ex2=expresion   { $ast = new ExpresionAritmetica($ex1.ast, $op, $ex2.ast);}
	|  ex1=expresion op=('+'|'-') ex2=expresion  { $ast = new ExpresionAritmetica($ex1.ast, $op, $ex2.ast);}
	| ex1=expresion op=('>'|'>='|'<'|'<=') ex2=expresion { $ast = new ExpresionBinaria($ex1.ast, $op, $ex2.ast);}
	| ex1=expresion op=('=='|'!=') ex2=expresion { $ast = new ExpresionBinaria($ex1.ast, $op, $ex2.ast);}
	| ex1=expresion op='&&' ex2=expresion { $ast = new ExpresionBinaria($ex1.ast, $op, $ex2.ast);}
	| ex1=expresion op='||' ex2=expresion { $ast = new ExpresionBinaria($ex1.ast, $op, $ex2.ast);}
	| IDENT '(' (parametrosInvocacion)? ')' { $ast = new InvocacionFuncion($IDENT, $parametrosInvocacion.list);}
	;

bucleWhile returns[Sentencia ast]
	: 'while' '(' expresion ')' '{' sentencias '}' { $ast = new BucleWhile($expresion.ast, $sentencias.list);}
	;
	
bucleIf returns[Sentencia ast]
	: 'if' '(' expresion ')' '{' sentencias '}' ('else' '{' sentencias '}') { $ast = new BucleIf($expresion.ast, $ctx.sentencias(0).list, $ctx.sentencias(1).list);}
	| 'if' '(' expresion ')' '{' sentencias '}' { $ast = new BucleIf($expresion.ast, $ctx.sentencias(0).list, null);}
	;