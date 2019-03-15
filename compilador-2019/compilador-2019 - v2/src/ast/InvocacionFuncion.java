/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	invocacionFuncion:sentencia, expresion -> id:String  parametros:expresion*

public class InvocacionFuncion extends AbstractAST implements Sentencia, Expresion {

	public InvocacionFuncion(String id, List<Expresion> parametros) {
		this.id = id;
		this.parametros = parametros;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros);
	}

	@SuppressWarnings("unchecked")
	public InvocacionFuncion(Object id, Object parametros) {
		this.id = (id instanceof Token) ? ((Token)id).getText() : (String) id;
		this.parametros = (List<Expresion>) parametros;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(id, parametros);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<Expresion> getParametros() {
		return parametros;
	}
	public void setParametros(List<Expresion> parametros) {
		this.parametros = parametros;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}
	
	public DefFuncion getDefinicion() {
        return definition;
    }

    public void setDefinicion(DefFuncion definition) {
        this.definition = definition;
    }

	private String id;
	private List<Expresion> parametros;
	private DefFuncion definition;

	public String toString() {
       return "{id:" + getId() + ", parametros:" + getParametros() + "}";
   }
}
