/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	sentenciaCondicional:sentencia -> condicion:expresion  cuerpoIf:sentencia*  cuerpoElse:sentencia*

public class SentenciaCondicional extends AbstractSentencia {

	public SentenciaCondicional(Expresion condicion, List<Sentencia> cuerpoIf, List<Sentencia> cuerpoElse) {
		this.condicion = condicion;
		this.cuerpoIf = cuerpoIf;
		this.cuerpoElse = cuerpoElse;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, cuerpoIf, cuerpoElse);
	}

	@SuppressWarnings("unchecked")
	public SentenciaCondicional(Object condicion, Object cuerpoIf, Object cuerpoElse) {
		this.condicion = (Expresion) ((condicion instanceof ParserRuleContext) ? getAST(condicion) : condicion);
		this.cuerpoIf = (List<Sentencia>) cuerpoIf;
		this.cuerpoElse = (List<Sentencia>) cuerpoElse;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, cuerpoIf, cuerpoElse);
	}

	public Expresion getCondicion() {
		return condicion;
	}
	public void setCondicion(Expresion condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getCuerpoIf() {
		return cuerpoIf;
	}
	public void setCuerpoIf(List<Sentencia> cuerpoIf) {
		this.cuerpoIf = cuerpoIf;
	}

	public List<Sentencia> getCuerpoElse() {
		return cuerpoElse;
	}
	public void setCuerpoElse(List<Sentencia> cuerpoElse) {
		this.cuerpoElse = cuerpoElse;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion condicion;
	private List<Sentencia> cuerpoIf;
	private List<Sentencia> cuerpoElse;

	public String toString() {
       return "{condicion:" + getCondicion() + ", cuerpoIf:" + getCuerpoIf() + ", cuerpoElse:" + getCuerpoElse() + "}";
   }
}
