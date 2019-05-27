/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	defStruct:definicion -> ident:String  cuerpostruct:cuerpoStruct*

public class DefStruct extends AbstractDefinicion {

	public DefStruct(String ident, List<CuerpoStruct> cuerpostruct) {
		this.ident = ident;
		this.cuerpostruct = cuerpostruct;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(cuerpostruct);
	}

	@SuppressWarnings("unchecked")
	public DefStruct(Object ident, Object cuerpostruct) {
		this.ident = (ident instanceof Token) ? ((Token)ident).getText() : (String) ident;
		this.cuerpostruct = (List<CuerpoStruct>) cuerpostruct;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ident, cuerpostruct);
	}

	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}

	public List<CuerpoStruct> getCuerpostruct() {
		return cuerpostruct;
	}
	public void setCuerpostruct(List<CuerpoStruct> cuerpostruct) {
		this.cuerpostruct = cuerpostruct;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String ident;
	private List<CuerpoStruct> cuerpostruct;

	public String toString() {
       return "{ident:" + getIdent() + ", cuerpostruct:" + getCuerpostruct() + "}";
   }
	
	public int getSize() {
		int suma = 0;
		for (CuerpoStruct defCam:cuerpostruct) {
			suma += defCam.getSize();
		}
		return suma;
	}
}
