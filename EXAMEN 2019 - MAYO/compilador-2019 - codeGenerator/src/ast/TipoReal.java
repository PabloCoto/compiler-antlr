/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	tipoReal:tipo -> 

public class TipoReal extends AbstractTipo {

	
	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{TipoReal}";
   }
	
	public int getSize() {
        return 4;
    }


	@Override
	public char getSuffix() {
		// TODO Auto-generated method stub
		return 'f';
	}


	@Override
	public String getMAPLName() {
		// TODO Auto-generated method stub
		return "float";
	}
}
