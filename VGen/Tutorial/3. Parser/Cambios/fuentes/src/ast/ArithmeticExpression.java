/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	arithmeticExpression:expression -> left:expression  operator:String  right:expression

public class ArithmeticExpression extends AbstractExpression {

	public ArithmeticExpression(Expression left, String operator, Expression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, right);
	}

	public ArithmeticExpression(Object left, Object operator, Object right) {
		this.left = (Expression) ((left instanceof ParserRuleContext) ? getAST(left) : left);
		this.operator = (operator instanceof Token) ? ((Token)operator).getText() : (String) operator;
		this.right = (Expression) ((right instanceof ParserRuleContext) ? getAST(right) : right);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, operator, right);
	}

	public Expression getLeft() {
		return left;
	}
	public void setLeft(Expression left) {
		this.left = left;
	}

	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Expression getRight() {
		return right;
	}
	public void setRight(Expression right) {
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression left;
	private String operator;
	private Expression right;

	public String toString() {
       return "{left:" + getLeft() + ", operator:" + getOperator() + ", right:" + getRight() + "}";
   }
}
