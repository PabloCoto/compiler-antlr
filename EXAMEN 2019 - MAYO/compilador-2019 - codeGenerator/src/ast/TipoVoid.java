/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	tipoVoid:tipo -> 

public class TipoVoid extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{TipoVoid}";
   }


	@Override
	public int getSize() {
		return 0;
	}


	//Devolver un assert error
	@Override
	public char getSuffix() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getMAPLName() {
		// TODO Auto-generated method stub
		return null;
	}
}
