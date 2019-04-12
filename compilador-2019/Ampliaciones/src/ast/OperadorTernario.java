/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	operadorTernario:expresion -> ex1:expresion  ex2:expresion  ex3:expresion

public class OperadorTernario extends AbstractExpresion {

	public OperadorTernario(Expresion ex1, Expresion ex2, Expresion ex3) {
		this.ex1 = ex1;
		this.ex2 = ex2;
		this.ex3 = ex3;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ex1, ex2, ex3);
	}

	public OperadorTernario(Object ex1, Object ex2, Object ex3) {
		this.ex1 = (Expresion) ((ex1 instanceof ParserRuleContext) ? getAST(ex1) : ex1);
		this.ex2 = (Expresion) ((ex2 instanceof ParserRuleContext) ? getAST(ex2) : ex2);
		this.ex3 = (Expresion) ((ex3 instanceof ParserRuleContext) ? getAST(ex3) : ex3);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ex1, ex2, ex3);
	}

	public Expresion getEx1() {
		return ex1;
	}
	public void setEx1(Expresion ex1) {
		this.ex1 = ex1;
	}

	public Expresion getEx2() {
		return ex2;
	}
	public void setEx2(Expresion ex2) {
		this.ex2 = ex2;
	}

	public Expresion getEx3() {
		return ex3;
	}
	public void setEx3(Expresion ex3) {
		this.ex3 = ex3;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion ex1;
	private Expresion ex2;
	private Expresion ex3;

	public String toString() {
       return "{ex1:" + getEx1() + ", ex2:" + getEx2() + ", ex3:" + getEx3() + "}";
   }
}
