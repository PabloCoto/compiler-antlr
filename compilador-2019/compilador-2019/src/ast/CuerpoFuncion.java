/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	cuerpoFuncion -> definiciones:defVariable*  sentencias:sentencia*

public class CuerpoFuncion extends AbstractAST  {

	public CuerpoFuncion(List<DefVariable> definiciones, List<Sentencia> sentencias) {
		this.definiciones = definiciones;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(definiciones, sentencias);
	}

	@SuppressWarnings("unchecked")
	public CuerpoFuncion(Object definiciones, Object sentencias) {
		this.definiciones = (List<DefVariable>) definiciones;
		this.sentencias = (List<Sentencia>) sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(definiciones, sentencias);
	}

	public List<DefVariable> getDefiniciones() {
		return definiciones;
	}
	public void setDefiniciones(List<DefVariable> definiciones) {
		this.definiciones = definiciones;
	}

	public List<Sentencia> getSentencias() {
		return sentencias;
	}
	public void setSentencias(List<Sentencia> sentencias) {
		this.sentencias = sentencias;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<DefVariable> definiciones;
	private List<Sentencia> sentencias;

	public String toString() {
       return "{definiciones:" + getDefiniciones() + ", sentencias:" + getSentencias() + "}";
   }
}
