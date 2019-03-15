/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	programa -> definicion:definicion*

public class Programa extends AbstractAST  {

	public Programa(List<Definicion> definicion) {
		this.definicion = definicion;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(definicion);
	}

	@SuppressWarnings("unchecked")
	public Programa(Object definicion) {
		this.definicion = (List<Definicion>) definicion;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(definicion);
	}

	public List<Definicion> getDefinicion() {
		return definicion;
	}
	public void setDefinicion(List<Definicion> definicion) {
		this.definicion = definicion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Definicion> definicion;

	public String toString() {
       return "{definicion:" + getDefinicion() + "}";
   }
}
