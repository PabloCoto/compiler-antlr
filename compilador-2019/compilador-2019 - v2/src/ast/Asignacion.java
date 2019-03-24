/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	asignacion:sentencia -> izq:expresion  der:expresion

public class Asignacion extends AbstractSentencia {

	public Asignacion(Expresion izq, Expresion der) {
		this.izq = izq;
		this.der = der;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(izq, der);
	}

	public Asignacion(Object izq, Object der) {
		this.izq = (Expresion) ((izq instanceof ParserRuleContext) ? getAST(izq) : izq);
		this.der = (Expresion) ((der instanceof ParserRuleContext) ? getAST(der) : der);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(izq, der);
	}

	public Expresion getIzq() {
		return izq;
	}
	public void setIzq(Expresion izq) {
		this.izq = izq;
	}

	public Expresion getDer() {
		return der;
	}
	public void setDer(Expresion der) {
		this.der = der;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion izq;
	private Expresion der;
	public DefFuncion funcionEnLaQueEstoy;
	
	public String toString() {
       return "{izq:" + getIzq() + ", der:" + getDer() + "}";
   }
}
