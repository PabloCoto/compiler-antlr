/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	tipoStruct:tipo -> ident:String

public class TipoStruct extends AbstractTipo {

	public TipoStruct(String ident) {
		this.ident = ident;
	}

	public TipoStruct(Object ident) {
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident);
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
	

	public void setDefinicion(DefStruct struct) {
		this.definition = struct;
	}
	
	public DefStruct getDefinicion() {
		return definition;
	}

	private String ident;
	private DefStruct definition;

	public String toString() {
       return "{ident:" + getIdent() + "}";
   }

	@Override
	public int getSize() {
		return definition.getSize();
	}

	@Override
	public char getSuffix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMAPLName() {
		// TODO Auto-generated method stub
		return definition.getIdent();
	}
}
