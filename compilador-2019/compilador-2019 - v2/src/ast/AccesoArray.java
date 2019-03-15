/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	accesoArray:expresion -> ident:expresion  posicion:expresion

public class AccesoArray extends AbstractExpresion {

	public AccesoArray(Expresion ident, Expresion posicion) {
		this.ident = ident;
		this.posicion = posicion;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident, posicion);
	}

	public AccesoArray(Object ident, Object posicion) {
		this.ident = (Expresion) ((ident instanceof ParserRuleContext) ? getAST(ident) : ident);
		this.posicion = (Expresion) ((posicion instanceof ParserRuleContext) ? getAST(posicion) : posicion);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident, posicion);
	}

	public Expresion getIdent() {
		return ident;
	}
	public void setIdent(Expresion ident) {
		this.ident = ident;
	}

	public Expresion getPosicion() {
		return posicion;
	}
	public void setPosicion(Expresion posicion) {
		this.posicion = posicion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion ident;
	private Expresion posicion;

	public String toString() {
       return "{ident:" + getIdent() + ", posicion:" + getPosicion() + "}";
   }
}
