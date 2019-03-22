/**
 * @generated VGen (for ANTLR) 1.5.0
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Program node, Object param);
	public Object visit(VarDefinition node, Object param);
	public Object visit(IntType node, Object param);
	public Object visit(RealType node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Assignment node, Object param);
	public Object visit(ArithmeticExpression node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(IntConstant node, Object param);
	public Object visit(RealConstant node, Object param);
}
