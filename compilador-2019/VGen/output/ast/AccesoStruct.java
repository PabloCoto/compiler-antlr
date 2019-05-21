/**
 * @generated VGen (for ANTLR) 1.5.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	accesoStruct:expresion -> expresion:expresion  ident:String

public class AccesoStruct extends AbstractExpresion {

	public AccesoStruct(Expresion expresion, String ident) {
		this.expresion = expresion;
		this.ident = ident;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expresion);
	}

	public AccesoStruct(Object expresion, Object ident) {
		this.expresion = (Expresion) ((expresion instanceof ParserRuleContext) ? getAST(expresion) : expresion);
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expresion, ident);
	}

	public Expresion getExpresion() {
		return expresion;
	}
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expresion;
	private String ident;

	public String toString() {
       return "{expresion:" + getExpresion() + ", ident:" + getIdent() + "}";
   }
}
