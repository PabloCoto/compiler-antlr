/**
 * @generated VGen (for ANTLR) 1.5.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	cast:expresion -> tipo:tipo  expresion:expresion

public class Cast extends AbstractExpresion {

	public Cast(Tipo tipo, Expresion expresion) {
		this.tipo = tipo;
		this.expresion = expresion;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo, expresion);
	}

	public Cast(Object tipo, Object expresion) {
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);
		this.expresion = (Expresion) ((expresion instanceof ParserRuleContext) ? getAST(expresion) : expresion);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo, expresion);
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Expresion getExpresion() {
		return expresion;
	}
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Tipo tipo;
	private Expresion expresion;

	public String toString() {
       return "{tipo:" + getTipo() + ", expresion:" + getExpresion() + "}";
   }
}
