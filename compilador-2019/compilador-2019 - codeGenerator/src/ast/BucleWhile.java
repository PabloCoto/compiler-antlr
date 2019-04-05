/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	bucleWhile:sentencia -> condicion:expresion  cuerpo:sentencia*

public class BucleWhile extends AbstractSentencia {

	public BucleWhile(Expresion condicion, List<Sentencia> cuerpo) {
		this.condicion = condicion;
		this.cuerpo = cuerpo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, cuerpo);
	}

	@SuppressWarnings("unchecked")
	public BucleWhile(Object condicion, Object cuerpo) {
		this.condicion = (Expresion) ((condicion instanceof ParserRuleContext) ? getAST(condicion) : condicion);
		this.cuerpo = (List<Sentencia>) cuerpo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, cuerpo);
	}

	public Expresion getCondicion() {
		return condicion;
	}
	public void setCondicion(Expresion condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(List<Sentencia> cuerpo) {
		this.cuerpo = cuerpo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion condicion;
	private List<Sentencia> cuerpo;
	public DefFuncion funcionEnLaQueEstoy;

	public String toString() {
       return "{condicion:" + getCondicion() + ", cuerpo:" + getCuerpo() + "}";
   }
}
