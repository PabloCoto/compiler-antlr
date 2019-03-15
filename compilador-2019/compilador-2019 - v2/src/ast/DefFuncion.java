/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	defFuncion:definicion -> ident:String  parametrosFuncion:defVariable*  tipo:tipo  definiciones:defVariable*  sentencias:sentencia*

public class DefFuncion extends AbstractDefinicion {

	public DefFuncion(String ident, List<DefVariable> parametrosFuncion, Tipo tipo, List<DefVariable> definiciones, List<Sentencia> sentencias) {
		this.ident = ident;
		this.parametrosFuncion = parametrosFuncion;
		this.tipo = tipo;
		this.definiciones = definiciones;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametrosFuncion, tipo, definiciones, sentencias);
	}

	@SuppressWarnings("unchecked")
	public DefFuncion(Object ident, Object parametrosFuncion, Object tipo, Object definiciones, Object sentencias) {
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;
		this.parametrosFuncion = (List<DefVariable>) parametrosFuncion;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);
		this.definiciones = (List<DefVariable>) definiciones;
		this.sentencias = (List<Sentencia>) sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident, parametrosFuncion, tipo, definiciones, sentencias);
	}

	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}

	public List<DefVariable> getParametrosFuncion() {
		return parametrosFuncion;
	}
	public void setParametrosFuncion(List<DefVariable> parametrosFuncion) {
		this.parametrosFuncion = parametrosFuncion;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
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

	private String ident;
	private List<DefVariable> parametrosFuncion;
	private Tipo tipo;
	private List<DefVariable> definiciones;
	private List<Sentencia> sentencias;

	public String toString() {
       return "{ident:" + getIdent() + ", parametrosFuncion:" + getParametrosFuncion() + ", tipo:" + getTipo() + ", definiciones:" + getDefiniciones() + ", sentencias:" + getSentencias() + "}";
   }
}
