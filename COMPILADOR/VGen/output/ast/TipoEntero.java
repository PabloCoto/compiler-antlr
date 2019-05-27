/**
 * @generated VGen (for ANTLR) 1.5.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	tipoEntero:tipo -> 

public class TipoEntero extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{TipoEntero}";
   }
}
