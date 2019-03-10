grammar Grammar
	;

import Lexicon
	;

@parser::header {
    import ast.*;
}

start returns[Program ast]
	: 'DATA' variables 'CODE' sentences EOF { $ast = new Program($variables.list, $sentences.list); }
	;

variables returns[List<VarDefinition> list = new ArrayList<VarDefinition>()]
	: (variable { $list.add($variable.ast); })*
	;

sentences returns[List<Sentence> list = new ArrayList<Sentence>()]
	: (sentence { $list.add($sentence.ast); })*
	;

tipo returns[Type ast]
	: 'float'	{  $ast = new RealType(); }
	| 'int'		{  $ast = new IntType(); }
	;

// Versión básica original.
// No guarda posiciones de línea.
// Usa '$IDENT.text' y '$ctx.expr(0).ast'

variable returns[VarDefinition ast]
	: tipo IDENT ';' { $ast = new VarDefinition($tipo.ast, $IDENT.text); }
	;

sentence returns[Sentence ast]
	: 'print' expr ';'	{ $ast = new Print($expr.ast); }
	| expr '=' expr ';'	{ $ast = new Assignment($ctx.expr(0).ast, $ctx.expr(1).ast); }
	;

expr returns[Expression ast]
	: expr op=('*' | '/') expr	{ $ast = new ArithmeticExpression($ctx.expr(0).ast, $op.text, $ctx.expr(1).ast); }
	| expr op=('+' | '-') expr	{ $ast = new ArithmeticExpression($ctx.expr(0).ast, $op.text, $ctx.expr(1).ast); }
	| '(' expr ')'				{ $ast = $expr.ast; }
	| IDENT						{ $ast = new Variable($IDENT.text); }
	| INT_CONSTANT				{ $ast = new IntConstant($INT_CONSTANT.text); }
	| REAL_CONSTANT				{ $ast = new RealConstant($REAL_CONSTANT.text); }
	;

// Versión avanzada con VGen (opcional).
// Incluye el control de número de línea ya que no usa '.text' en los $TOKENS.
// Además, se pueden quitar los '.ast' cuando se accede por índice ('$ctx.expr(0).ast').
/*
variable returns[VarDefinition ast]
	: tipo IDENT ';' { $ast = new VarDefinition($tipo.ast, $IDENT); }
	;

sentence returns[Sentence ast]
	: 'print' expr ';'	{ $ast = new Print($expr.ast); }
	| expr '=' expr ';'	{ $ast = new Assignment($ctx.expr(0), $ctx.expr(1)); }
	;

expr returns[Expression ast]
	: expr op=('*' | '/') expr	{ $ast = new ArithmeticExpression($ctx.expr(0), $op, $ctx.expr(1)); }
	| expr op=('+' | '-') expr	{ $ast = new ArithmeticExpression($ctx.expr(0), $op, $ctx.expr(1)); }
	| '(' expr ')'				{ $ast = $expr.ast; }
	| IDENT						{ $ast = new Variable($IDENT); }
	| INT_CONSTANT				{ $ast = new IntConstant($INT_CONSTANT); }
	| REAL_CONSTANT				{ $ast = new RealConstant($REAL_CONSTANT); }
	;
*/
