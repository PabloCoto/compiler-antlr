grammar Grammar
	;

import Lexicon
	;

@parser::header {
    import ast.*;
}

// --------------------------------------------------------------------
// Solución 1. Versión básica original.
// - No guarda posiciones de línea.
// - Usa '$IDENT.text' y '$ctx.expr(0).ast'
/*
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
*/

// --------------------------------------------------------------------
// Solución 2. Versión avanzada 1 (Requiere VGen).
// - Ventaja 1. Añade información de fila/columna a los nodos. Ello se consigue pasando a los nodos $TOKEN en vez de $TOKEN.text (ver 'variable' y 'expr).
// - Ventaja 2. Simplifica las reglas. Cuando se accede por índice (por ejemplo '$ctx.expr(0).ast'), no es necesario poner '.ast' (ver 'sentence' y 'expr').
/*
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

// --------------------------------------------------------------------
// Solución 3. Versión avanzada 2 (Requiere VGen).
// - Ventaja. Permite eliminar los no-terminales creados únicamente para listas. En este caso, elimina las reglas 'variables' y 'sentences' al usar en 'Programa' el operador '+='

start returns[Program ast]
	: 'DATA' lv+=variable* 'CODE' ls+=sentence* EOF { $ast = new Program($lv, $ls); }
	;

tipo returns[Type ast]
	: 'float'	{  $ast = new RealType(); }
	| 'int'		{  $ast = new IntType(); }
	;

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
