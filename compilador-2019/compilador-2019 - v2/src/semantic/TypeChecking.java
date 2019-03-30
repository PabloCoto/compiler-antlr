package semantic;

import java.util.*;

import ast.*;
import ast.enumerable.AmbitoVariable;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

	public TypeChecking(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// class DefVariable { String ident; Tipo tipo; }
	public Object visit(DefVariable node, Object param) {
		if (node.getAmbito() == AmbitoVariable.PARAM) {
			super.visit(node, param);
			predicado(node.getTipo().getClass() != TipoArray.class && node.getTipo().getClass() != TipoStruct.class,
					"DefFuncion: los parametros han de ser de tipos simples", node);
		}
		return null;
	}

	// class DefFuncion { String ident; List<DefVariable> parametrosFuncion; Tipo
	// tipo; List<DefVariable> definiciones; List<Sentencia> sentencias; }
	public Object visit(DefFuncion node, Object param) {
		super.visit(node, param);
		predicado(node.getTipo().getClass()!=TipoStruct.class && node.getTipo().getClass()!=TipoArray.class, "DefFuncion: el retorno debe ser simple", node);
//		for(Sentencia s: node.getSentencias()) {
//		
//		}
		return null;
	}

	// class TipoArray { String dimension; Tipo tipo; }
	public Object visit(TipoArray node, Object param) {
		return node.getTipo();
	}

	// class Return { Expresion expresion; }
	public Object visit(Return node, Object param) {
		super.visit(node, param);
		
		if (node.getExpresion() == null) {
			predicado(node.getFuncionEnLaQueEstoy().getTipo().getClass() == TipoVoid.class,
					"Return: se deber韆 de retornar alg鷑 valor", node);
		} else if (node.getExpresion() != null && node.getFuncionEnLaQueEstoy().getTipo().getClass() != TipoVoid.class) {
			predicado(node.getFuncionEnLaQueEstoy().getTipo() == node.getExpresion().getTipo(),
					"Return: el tipo devuelto no coincide con el tipo de retorno", node);
		} 
		else if(node.getFuncionEnLaQueEstoy().getTipo().getClass() == TipoVoid.class ) {
			predicado(node.getExpresion().getClass() == TipoVoid.class, 
			"Return: no debe tener expresi髇 en funciones void",node.getStart());
		}
		return null;
	}

	// class Asignacion { Expresion izq; Expresion der; }
	public Object visit(Asignacion node, Object param) {
		super.visit(node, param);
		predicado(node.getIzq().getTipo() == node.getDer().getTipo(), "Asignaci髇: valores de distinto tipo", node);
		predicado(node.getIzq().isModificable() == true, "Asignaci髇: valor de la izquierda no modificable",
				node.getIzq());
		predicado(
				node.getIzq().getTipo().getClass() != TipoStruct.class
						&& node.getIzq().getTipo().getClass() != TipoArray.class,
				"Asignaci髇: El valor de la izquierda debe ser simple", node.getIzq());
		return null;
	}

	// class Printsp { Expresion expresion; }
	public Object visit(Printsp node, Object param) {
		super.visit(node, param);
		predicado(node.getExpresion() != null, "Printsp: la expresi髇 no puede ser nula", node);
		if(node.getExpresion().getTipo()!=null)
			predicado(
					node.getExpresion().getTipo().getClass() != TipoStruct.class
							&& node.getExpresion().getTipo().getClass() != TipoArray.class,
					"Printsp: debe ser tipo simple", node);
		return null;
	}

	// class Print { Expresion expresion; }
	public Object visit(Print node, Object param) {
		super.visit(node, param);
		predicado(node.getExpresion() != null, "Print: la expresi髇 no puede ser nula", node);
		
		if(node.getExpresion().getTipo() != null) {
			predicado(
					node.getExpresion().getTipo().getClass() != TipoStruct.class
							&& node.getExpresion().getTipo().getClass() != TipoArray.class,
					"Print: debe ser tipo simple", node);
		}
		return null;
	}

	// class Println { Expresion expresion; }
	public Object visit(Println node, Object param) {
		super.visit(node, param);
		if(node.getExpresion() != null)
			predicado(
					node.getExpresion().getTipo().getClass() != TipoStruct.class
							&& node.getExpresion().getTipo().getClass() != TipoArray.class,
					"Println: debe ser tipo simple", node);
		return null;
	}

	// class Read { Expresion expresion; }
	public Object visit(Read node, Object param) {
		super.visit(node, param);
		predicado(node.getExpresion().isModificable(), "Read: debe ser modificable", node);
		predicado(
				node.getExpresion().getTipo().getClass() != TipoStruct.class
						&& node.getExpresion().getTipo().getClass() != TipoArray.class,
				"Read: debe ser tipo simple", node);
		return null;
	}

	// class BucleWhile { Expresion condicion; List<Sentencia> cuerpo; }
	public Object visit(BucleWhile node, Object param) {
		super.visit(node, param);
		predicado(node.getCondicion().getTipo().getClass() == TipoEntero.class,
				"While: la condici髇 debe de ser de tipo entero", node);
		return null;
	}

	// class SentenciaCondicional { Expresion condicion; List<Sentencia> cuerpoIf;
	// List<Sentencia> cuerpoElse; }
	public Object visit(SentenciaCondicional node, Object param) {
		super.visit(node, param);
		predicado(node.getCondicion().getTipo().getClass() == TipoEntero.class,
				"SentenciaCondicional: La condici髇 debe de ser de tipo entero", node.getStart());
		return null;
	}

	// class InvocacionFuncionSentencia { String id; List<Expresion> parametros; }
	public Object visit(InvocacionFuncionSentencia node, Object param) {
		super.visit(node, param);
		List<DefVariable> parametros = node.getDefinicion().getParametrosFuncion();
		if(parametros.size() != node.getParametros().size()) {
			predicado(parametros.size() == node.getParametros().size(), 
					"InvocacionFuncionSentencia: el n鷐ero de argumentos es incorrecto", node);
		}
		else {
			boolean parametrosOK=true;
			for(int i=0; i<parametros.size();i++) {
				if(parametros.get(i).getTipo().getClass() != node.getParametros().get(i).getTipo().getClass())
					parametrosOK = false;
			}
			predicado(parametrosOK, 
					"InvocacionFuncionSentencia: el tipo de alg鷑 argumento es incorrecto", node);

		}
		return null;
	}

	// class AccesoStruct { Expresion expresion; String ident; }
	public Object visit(AccesoStruct node, Object param) {
		super.visit(node, param);
		predicado(node.getExpresion().getTipo().getClass() == TipoStruct.class, "AccesoStruct: debe ser tipo struct",
				node);
		if(node.getExpresion().getTipo().getClass()==TipoStruct.class) {
			DefStruct struct = ((TipoStruct)node.getExpresion().getTipo()).getDefinicion();
			for(CuerpoStruct c: struct.getCuerpostruct()) {
				if(c.getIdent().equals(node.getIdent())) {
					node.setTipo(c.getTipo());
					break;
				}
			}
		}
		else {
			node.setTipo(node.getExpresion().getTipo());
		}
		node.setModificable(true);
		return null;
	}

	// class AccesoArray { Expresion ident; Expresion posicion; }
	public Object visit(AccesoArray node, Object param) {
		super.visit(node, param);
		predicado(node.getPosicion().getTipo().getClass() == TipoEntero.class, "AccesoArray: debe ser 韓dice entero",
				node);		
		if(node.getPosicion().getTipo().getClass()==TipoEntero.class) {
			predicado(node.getIdent().getTipo().getClass() == TipoArray.class, "AccesoArray: debe ser tipo array", node);
			if(node.getIdent().getTipo().getClass()==TipoArray.class) {
				node.setTipo(((TipoArray)node.getIdent().getTipo()).getTipo());
				node.setModificable(true);
			}
		}
		return null;
	}

	// class Variable { String ident; }
	public Object visit(Variable node, Object param) {
		super.visit(node, param);

		node.setTipo(node.getDefinicion().getTipo());
		node.setModificable(true);

		if (param != null && node.getTipo().getClass() == TipoStruct.class) {
			TipoStruct struct = (TipoStruct) node.getTipo();
			DefStruct defS = struct.getDefinicion();

			boolean i = false;
			for (CuerpoStruct dC : defS.getCuerpostruct()) {
				if (dC.getIdent().equals((String) param)) {
					i = true;
					Tipo tipo = dC.getTipo();
					if (dC.getTipo().getClass() == TipoArray.class) {
						node.setTipo(((TipoArray) tipo).getTipo());
					} else
						node.setTipo(dC.getTipo());

					break;
				}
			}
			predicado(i, "TipoStruct: El campo al que se hace referencia no existe en la estructura " + defS.getIdent(),
					node);
		}

		return null;
	}

	// class LiteralInt { String value; }
	public Object visit(LiteralInt node, Object param) {
		node.setTipo(new TipoEntero());
		node.setModificable(false);
		return null;
	}

	// class LiteralReal { String value; }
	public Object visit(LiteralReal node, Object param) {
		node.setTipo(new TipoReal());
		node.setModificable(false);
		return null;
	}

	// class LiteralChar { String value; }
	public Object visit(LiteralChar node, Object param) {
		node.setTipo(new TipoChar());
		node.setModificable(false);
		return null;
	}

	// class Cast { Tipo tipo; Expresion expresion; }
	public Object visit(Cast node, Object param) {
		super.visit(node, param);
		predicado(node.getTipo().getClass() != TipoStruct.class && node.getTipo().getClass() != TipoArray.class,
				"Cast: deben ser tipos simples", node.getStart());
		predicado(node.getTipo().getClass() != node.getExpresion().getTipo().getClass(),
				"Cast: deben ser distintos tipos", node.getStart());
		predicado(
				node.getExpresion().getTipo().getClass() != TipoStruct.class
						&& node.getExpresion().getTipo().getClass() != TipoArray.class,
				"Cast: expresion debe ser tipo simples", node.getStart());
		node.setTipo(node.getTipo());
		node.setModificable(false);
		return null;
	}

	// class Negacion { Expresion expresion; }
	public Object visit(Negacion node, Object param) {
		super.visit(node, param);
		predicado(node.getTipo().getClass() == TipoEntero.class, "Negacion: deben ser tipos simples", node.getStart());
		node.setTipo(new TipoEntero());
		node.setModificable(false);
		return null;
	}

	// class ExpresionAritmetica { Expresion izquierda; String operador; Expresion
	// derecha; }
	public Object visit(ExpresionAritmetica node, Object param) {
		super.visit(node, param);
		predicado(node.getIzquierda().getTipo() == node.getDerecha().getTipo(),
				"ExpresionAritmetica: Deben ser del mismo tipo", node.getStart());
		predicado(node.getIzquierda().getTipo().getClass() == TipoReal.class || node.getIzquierda().getTipo().getClass() == TipoEntero.class,
				"ExpresionAritmetica: deben ser tipos simples", node.getStart()); // char?
		node.setTipo(node.getIzquierda().getTipo());
		node.setModificable(false);
		return null;
	}

	// class ExpresionBinaria { Expresion izquierda; String operador; Expresion
	// derecha; }
	public Object visit(ExpresionBinaria node, Object param) {
		super.visit(node, param);
		predicado(node.getIzquierda().getTipo().getClass() == TipoReal.class || node.getIzquierda().getTipo().getClass() == TipoEntero.class,
				"ExpresionBinaria: deben ser tipos simples", node.getStart()); // char?
		predicado(node.getIzquierda().getTipo() == node.getDerecha().getTipo(),
				"ExpresionAritmetica: Deben ser del mismo tipo", node.getStart());
		node.setTipo(node.getIzquierda().getTipo());
		node.setModificable(false);
		return null;
	}

	// class ExpresionLogica { Expresion izquierda; String operador; Expresion
	// derecha; }
	public Object visit(ExpresionLogica node, Object param) {
		super.visit(node, param);
		predicado(node.getIzquierda().getTipo().getClass() == TipoEntero.class, "ExpresionLogica: deben ser tipos simples",
				node.getStart()); // char?
		predicado(node.getIzquierda().getTipo() == node.getDerecha().getTipo(),
				"ExpresionLogica: Deben ser del mismo tipo", node.getStart());
		node.setTipo(node.getIzquierda().getTipo());
		node.setModificable(false);
		return null;
	}

	// class InvocacionFuncionExpresion { String id; List<Expresion> parametros; }
	public Object visit(InvocacionFuncionExpresion node, Object param) {
		super.visit(node, param);
		node.setTipo(node.getDefinicion().getTipo());
		node.setModificable(false);

		List<DefVariable> parametros = node.getDefinicion().getParametrosFuncion();
		if (parametros.size() != node.getParametros().size()) {
			predicado(parametros.size() == node.getParametros().size(),
					"InvocacionFuncionExpresion: n鷐ero de argumentos no coincide", node);
		} else {
			boolean tipoParametro = false;
			for (int i = 0; i < parametros.size(); i++) {
				if (parametros.get(i).getTipo().getClass() != node.getParametros().get(i).getTipo().getClass())
					tipoParametro = false;
			}
			predicado(tipoParametro, "InvocacionFuncionExpresion: el tipo de los par醡etros no coincide",
					node.getStart());
		} // FALTA LO DEL VOID
		
		predicado(node.getDefinicion().getTipo().getClass() != TipoVoid.class, "InvocacionFuncionExpresion: no se puede invocar una funcion void como expresion", node);
		return null;
	}

	/**
	 * predicado. M茅todo auxiliar para implementar los predicados. Borrar si no se
	 * quiere usar.
	 *
	 * Ejemplos de uso (suponiendo que existe un m茅todo "esPrimitivo"):
	 *
	 * 1. predicado(esPrimitivo(expr.tipo), "La expresi贸n debe ser de un tipo
	 * pimitivo", expr.getStart()); 2. predicado(esPrimitivo(expr.tipo), "La
	 * expresi贸n debe ser de un tipo pimitivo", expr); 3.
	 * predicado(esPrimitivo(expr.tipo), "La expresi贸n debe ser de un tipo
	 * primitivo");
	 *
	 * NOTA: El m茅todo getStart() (ejemplo 1) indica la linea/columna del fichero
	 * fuente donde estaba el nodo (y as铆 poder dar informaci贸n m谩s detallada de
	 * la posici贸n del error). Si se usa VGen, dicho m茅todo habr谩 sido generado
	 * en todos los nodos del AST. No es obligatorio llamar a getStart() (ejemplo
	 * 2), ya que si se pasa el nodo, se usar谩 por defecto dicha posici贸n. Si no
	 * se quiere imprimir la posici贸n del fichero, se puede omitir el tercer
	 * argumento (ejemplo 3).
	 *
	 * @param condicion     Debe cumplirse para que no se produzca un error
	 * @param mensajeError  Se imprime si no se cumple la condici贸n
	 * @param posicionError Fila y columna del fichero donde se ha producido el
	 *                      error.
	 */
	private void predicado(boolean condicion, String mensajeError, Position posicionError) {
		if (!condicion)
			errorManager.notify("Comprobaci髇 de tipos", mensajeError, posicionError);
	}

	private void predicado(boolean condicion, String mensajeError, AST node) {
		predicado(condicion, mensajeError, node.getStart());
	}

	private void predicado(boolean condicion, String mensajeError) {
		predicado(condicion, mensajeError, (Position) null);
	}

	private ErrorManager errorManager;
}
