/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	tipoChar:tipo -> 

public class TipoChar extends AbstractTipo {

	
	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{TipoChar}";
   }
	
	public int getSize() {
        return 1;
    }


	@Override
	public char getSuffix() {
		// TODO Auto-generated method stub
		return 'b';
	}


	@Override
	public String getMAPLName() {
		// TODO Auto-generated method stub
		return "char";
	}
}
