/**
 * @generated VGen (for ANTLR) 1.5.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	cuerpoStruct -> ident:String  tipo:tipo

public class CuerpoStruct extends AbstractAST  {

	public CuerpoStruct(String ident, Tipo tipo) {
		this.ident = ident;
		this.tipo = tipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public CuerpoStruct(Object ident, Object tipo) {
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident, tipo);
	}

	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String ident;
	private Tipo tipo;

	public String toString() {
       return "{ident:" + getIdent() + ", tipo:" + getTipo() + "}";
   }
}
