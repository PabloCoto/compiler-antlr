/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	defFuncion:definicion -> ident:String  parametrosFuncion:param*  tipo:tipo  cuerpofuncion:cuerpoFuncion

public class DefFuncion extends AbstractDefinicion {

	public DefFuncion(String ident, List<Param> parametrosFuncion, Tipo tipo, CuerpoFuncion cuerpofuncion) {
		this.ident = ident;
		this.parametrosFuncion = parametrosFuncion;
		this.tipo = tipo;
		this.cuerpofuncion = cuerpofuncion;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametrosFuncion, tipo, cuerpofuncion);
	}

	@SuppressWarnings("unchecked")
	public DefFuncion(Object ident, Object parametrosFuncion, Object tipo, Object cuerpofuncion) {
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;
		this.parametrosFuncion = (List<Param>) parametrosFuncion;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);
		this.cuerpofuncion = (CuerpoFuncion) ((cuerpofuncion instanceof ParserRuleContext) ? getAST(cuerpofuncion) : cuerpofuncion);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident, parametrosFuncion, tipo, cuerpofuncion);
	}

	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}

	public List<Param> getParametrosFuncion() {
		return parametrosFuncion;
	}
	public void setParametrosFuncion(List<Param> parametrosFuncion) {
		this.parametrosFuncion = parametrosFuncion;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public CuerpoFuncion getCuerpofuncion() {
		return cuerpofuncion;
	}
	public void setCuerpofuncion(CuerpoFuncion cuerpofuncion) {
		this.cuerpofuncion = cuerpofuncion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String ident;
	private List<Param> parametrosFuncion;
	private Tipo tipo;
	private CuerpoFuncion cuerpofuncion;

	public String toString() {
       return "{ident:" + getIdent() + ", parametrosFuncion:" + getParametrosFuncion() + ", tipo:" + getTipo() + ", cuerpofuncion:" + getCuerpofuncion() + "}";
   }
}
