/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	expresionBinaria:expresion -> izquierda:expresion  operador:String  derecha:expresion

public class ExpresionBinaria extends AbstractExpresion {

	public ExpresionBinaria(Expresion izquierda, String operador, Expresion derecha) {
		this.izquierda = izquierda;
		this.operador = operador;
		this.derecha = derecha;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(izquierda, derecha);
	}

	public ExpresionBinaria(Object izquierda, Object operador, Object derecha) {
		this.izquierda = (Expresion) ((izquierda instanceof ParserRuleContext) ? getAST(izquierda) : izquierda);
		this.operador = (operador instanceof Token) ? ((Token)operador).getText() : (String) operador;
		this.derecha = (Expresion) ((derecha instanceof ParserRuleContext) ? getAST(derecha) : derecha);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(izquierda, operador, derecha);
	}

	public Expresion getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Expresion izquierda) {
		this.izquierda = izquierda;
	}

	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}

	public Expresion getDerecha() {
		return derecha;
	}
	public void setDerecha(Expresion derecha) {
		this.derecha = derecha;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion izquierda;
	private String operador;
	private Expresion derecha;

	public String toString() {
       return "{izquierda:" + getIzquierda() + ", operador:" + getOperador() + ", derecha:" + getDerecha() + "}";
   }
}
