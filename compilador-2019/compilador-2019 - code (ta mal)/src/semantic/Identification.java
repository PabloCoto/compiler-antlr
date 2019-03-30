package semantic;

import java.util.*;

import ast.*;
import ast.enumerable.AmbitoVariable;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

	// hashmaps
	private Map<String, DefFuncion> funciones = new HashMap<String, DefFuncion>();
	private ContextMap<String, DefVariable> variables = new ContextMap<String, DefVariable>();
	private Map<String, DefStruct> estructuras = new HashMap<String, DefStruct>();

	private ErrorManager errorManager;

	public Identification(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// class DefVariable { String ident; Tipo tipo; }
	public Object visit(DefVariable node, Object param) {
		DefVariable definicion = variables.getFromTop(node.getIdent());
		if(node.getAmbito() == AmbitoVariable.PARAM) {
			predicado(definicion == null, "Par醡etro repetido: " + node.getIdent(), node.getStart());
		}
		else if(node.getAmbito() == AmbitoVariable.GLOBAL) {
			predicado(definicion == null, "Variable global repetida: " + node.getIdent(), node.getStart());
		}
		else if(node.getAmbito() == AmbitoVariable.LOCAL) {
			predicado(definicion == null, "Variable local repetida: " + node.getIdent(), node.getStart());
		}
		variables.put(node.getIdent(), node);
		return super.visit(node, param);
	}

	// class DefStruct { String ident; List<CuerpoStruct> cuerpostruct; }
	public Object visit(DefStruct node, Object param) {
		DefStruct definicion = estructuras.get(node.getIdent());
		predicado(definicion == null, "Estructura repetida: " + node.getIdent(), node);

		Map<String, CuerpoStruct> cuerpoStruct = new HashMap<String, CuerpoStruct>();
		for (CuerpoStruct campo : node.getCuerpostruct()) {
			CuerpoStruct defCampo = cuerpoStruct.get(campo.getIdent());
			predicado(defCampo == null, "Campo repetido: " + campo.getIdent(), campo.getStart());

			cuerpoStruct.put(campo.getIdent(), campo);
		}

		estructuras.put(node.getIdent(), node);

		return null;
	}

	// class DefFuncion { String ident; List<Param> parametrosFuncion; Tipo tipo;
	// List<DefVariable> definiciones; List<Sentencia> sentencias; }
	public Object visit(DefFuncion node, Object param) {
		DefFuncion definicion = funciones.get(node.getIdent());
		predicado(definicion == null, "Funci髇 repetida: " + node.getIdent(), node);
		funciones.put(node.getIdent(), node);

		variables.set();
		super.visit(node, funciones.get(node.getIdent())); //cambiar por param
		variables.reset();

		return null;
	}

//	class Return { Expresion expresion; }
	public Object visit(Return node, Object param) {
		node.setFuncionEnLaQueEstoy((DefFuncion)param);
		
		
		return super.visit(node, param);
	}
	
	// class TipoStruct { String ident; }
	public Object visit(TipoStruct node, Object param) {
		DefStruct definicion = estructuras.get(node.getIdent());
		predicado(definicion != null, "Estructura no definida: " + node.getIdent(), node.getStart());
		node.setDefinicion(definicion); // Enlazar referencia con definicion
		return super.visit(node, param);
	}

	// class InvocacionFuncionExpresion { String id; List<Expresion> parametros; }
	public Object visit(InvocacionFuncionExpresion node, Object param) {
		DefFuncion funcion = funciones.get(node.getId());
		predicado(funcion != null, "Funci髇 no definida: " + node.getId(), node);
		node.setDefinicion(funcion); // Enlazar referencia con definicion
		return null;
	}

	//	class InvocacionFuncionSentencia { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncionSentencia node, Object param) {
		DefFuncion funcion = funciones.get(node.getId());
		predicado(funcion != null, "Procedimiento no definido: " + node.getId(), node);
		node.setDefinicion(funcion); // Enlazar referencia con definicion
		return null;
	}
	
	// class Variable { String ident; }
	public Object visit(Variable node, Object param) {
		DefVariable definicion = variables.getFromAny(node.getIdent());
		predicado(definicion != null, "Variable no definida: " + node.getIdent(), node.getStart()); //AQUI SON LOS ULTIMOS ERRORES DEL PRINT
		node.setDefinicion(definicion); // Enlazar referencia con definici髇
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
			errorManager.notify("Identificacion", mensajeError, posicionError);
	}

	private void predicado(boolean condicion, String mensajeError, AST node) {
		predicado(condicion, mensajeError, node.getStart());
	}

	private void predicado(boolean condicion, String mensajeError) {
		predicado(condicion, mensajeError, (Position) null);
	}

}
