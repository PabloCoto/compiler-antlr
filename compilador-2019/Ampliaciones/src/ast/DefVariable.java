/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import java.util.List;

import org.antlr.v4.runtime.*;

import ast.enumerable.AmbitoVariable;

//	defVariable:definicion -> ident:String  tipo:tipo

public class DefVariable extends AbstractDefinicion {

	public DefVariable(String ident, Tipo tipo, AmbitoVariable ambito) {
		this.ident = ident;
		this.tipo = tipo;
		this.ambito = ambito;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public DefVariable(Object ident, Object tipo, AmbitoVariable ambito) {
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);
		
		this.ambito = ambito;
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
	
	public AmbitoVariable getAmbito() {
		return ambito;
	}

	public void setAmbito(AmbitoVariable ambito) {
		this.ambito = ambito;
	}

	private String ident;
	private Tipo tipo;
	private AmbitoVariable ambito;
	private int address;

	public String toString() {
       return "{ident:" + getIdent() + ", tipo:" + getTipo() + "}";
   }
	public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
