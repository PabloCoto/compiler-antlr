/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Programa node, Object param);
	public Object visit(DefVariable node, Object param);
	public Object visit(DefStruct node, Object param);
	public Object visit(CuerpoStruct node, Object param);
	public Object visit(DefFuncion node, Object param);
	public Object visit(TipoEntero node, Object param);
	public Object visit(TipoReal node, Object param);
	public Object visit(TipoChar node, Object param);
	public Object visit(TipoArray node, Object param);
	public Object visit(TipoStruct node, Object param);
	public Object visit(TipoVoid node, Object param);
	public Object visit(Return node, Object param);
	public Object visit(Asignacion node, Object param);
	public Object visit(Printsp node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Println node, Object param);
	public Object visit(Read node, Object param);
	public Object visit(BucleWhile node, Object param);
	public Object visit(SentenciaCondicional node, Object param);
	public Object visit(InvocacionFuncionSentencia node, Object param);
	public Object visit(AccesoStruct node, Object param);
	public Object visit(AccesoArray node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(LiteralInt node, Object param);
	public Object visit(LiteralReal node, Object param);
	public Object visit(LiteralChar node, Object param);
	public Object visit(Cast node, Object param);
	public Object visit(Negacion node, Object param);
	public Object visit(ExpresionAritmetica node, Object param);
	public Object visit(ExpresionBinaria node, Object param);
	public Object visit(ExpresionLogica node, Object param);
	public Object visit(InvocacionFuncionExpresion node, Object param);
}
