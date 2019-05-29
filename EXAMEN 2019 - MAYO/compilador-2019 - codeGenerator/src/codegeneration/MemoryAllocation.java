package codegeneration;

import ast.*;
import ast.enumerable.AmbitoVariable;
import visitor.*;

/**
 * Clase encargada de asignar direcciones a las variables.
 */
public class MemoryAllocation extends DefaultVisitor {

	// class Programa { List<DefVariable> definiciones; List<Sentencia> sentencias;
	// }
	public Object visit(Programa node, Object param) {

		int dirLocales = 0;
		int dirGlobales = 0;

		for (Definicion child : node.getDefinicion()) {
			if (child instanceof DefVariable) {
				DefVariable var = ((DefVariable) child);
				if (var.getAmbito() == AmbitoVariable.GLOBAL) {
					var.setAddress(dirGlobales);
					dirGlobales += var.getTipo().getSize();
				} 
			} else if (child instanceof DefFuncion) {
				DefFuncion fun = ((DefFuncion) child);
				dirLocales = 0;
				int dirParams = 4;
				for (int i = fun.getParametrosFuncion().size() - 1; i >= 0; i--) {
					fun.getParametrosFuncion().get(i).setAddress(dirParams);
					dirParams += fun.getParametrosFuncion().get(i).getTipo().getSize();
				}
				for (DefVariable var : fun.getDefiniciones()) {

					dirLocales += -var.getTipo().getSize();
					var.setAddress(dirLocales);

				}
			} else if (child instanceof DefStruct) {
				DefStruct str = ((DefStruct) child);
				int dirCampos = 0;
				for (CuerpoStruct campo : str.getCuerpostruct()) {
					campo.setAddress(dirCampos);
					dirCampos += campo.getTipo().getSize();
				}
			}
		}
		return null;
	}

}
