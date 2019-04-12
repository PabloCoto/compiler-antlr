/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	tipoArray:tipo -> dimension:String  tipo:tipo

public class TipoArray extends AbstractTipo {

	public TipoArray(String dimension, Tipo tipo) {
		this.dimension = dimension;
		this.tipo = tipo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public TipoArray(Object dimension, Object tipo) {
		this.dimension = (dimension instanceof Token) ? ((Token)dimension).getText() : (String) dimension;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(dimension, tipo);
	}

	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
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

	private String dimension;
	private Tipo tipo;

	public String toString() {
       return "{dimension:" + getDimension() + ", tipo:" + getTipo() + "}";
   }

	public int getSize() {
        return tipo.getSize()*Integer.parseInt(dimension);
    }

	@Override
	public char getSuffix() {
		// TODO Auto-generated method stub
		return tipo.getSuffix();
	}

	@Override
	public String getMAPLName() {
		// TODO Auto-generated method stub
		return dimension + " * " +  tipo.getMAPLName();
	}
}
