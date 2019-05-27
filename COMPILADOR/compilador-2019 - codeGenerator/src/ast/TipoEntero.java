/**
 * @generated VGen (for ANTLR) 1.4.0
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


	@Override
	public int getSize() {
		return 2;
	}


	@Override
	public char getSuffix() {
		// TODO Auto-generated method stub
		return 'i';
	}


	@Override
	public String getMAPLName() {
		// TODO Auto-generated method stub
		return "int";
	}
}
