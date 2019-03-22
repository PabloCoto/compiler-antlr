package semantic;

import java.util.*;

import ast.*;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

	//	class Return { Expresion expresion; }
	public Object visit(Return node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}
	
	//	class Asignacion { Expresion izq;  Expresion der; }
	public Object visit(Asignacion node, Object param) {
		super.visit(node, param);
		predicado(node.getIzq().getTipo() ==  node.getDer().getTipo(), "Error. Asignaci髇 - Los operandos deben ser del mismo tipo", node);
		predicado(node.getIzq().isModificable(), "Error. Asignaci髇 - Se requiere expresi髇 modificable", node.getIzq());
		predicado(node.getIzq().getTipo().getClass() != TipoStruct.class && node.getIzq().getTipo().getClass() != TipoArray.class, "Error. Asignaci髇 - El valor de la izquierda debe ser simple", node.getIzq());
		return null;
	}

	//	class Printsp { Expresion expresion; }
	public Object visit(Printsp node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class Print { Expresion expresion; }
	public Object visit(Print node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class Println { Expresion expresion; }
	public Object visit(Println node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class Read { Expresion expresion; }
	public Object visit(Read node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class BucleWhile { Expresion condicion;  List<Sentencia> cuerpo; }
	public Object visit(BucleWhile node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		if (node.getCuerpo() != null)
			for (Sentencia child : node.getCuerpo())
				child.accept(this, param);

		return null;
	}

	//	class SentenciaCondicional { Expresion condicion;  List<Sentencia> cuerpoIf;  List<Sentencia> cuerpoElse; }
	public Object visit(SentenciaCondicional node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		if (node.getCuerpoIf() != null)
			for (Sentencia child : node.getCuerpoIf())
				child.accept(this, param);

		if (node.getCuerpoElse() != null)
			for (Sentencia child : node.getCuerpoElse())
				child.accept(this, param);

		return null;
	}

	//	class InvocacionFuncionSentencia { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncionSentencia node, Object param) {

		// super.visit(node, param);

		if (node.getParametros() != null)
			for (Expresion child : node.getParametros())
				child.accept(this, param);

		return null;
	}

	//	class AccesoStruct { Expresion expresion;  String ident; }
	public Object visit(AccesoStruct node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class AccesoArray { Expresion ident;  Expresion posicion; }
	public Object visit(AccesoArray node, Object param) {

		// super.visit(node, param);

		if (node.getIdent() != null)
			node.getIdent().accept(this, param);

		if (node.getPosicion() != null)
			node.getPosicion().accept(this, param);

		return null;
	}

	//	class Variable { String ident; }
	public Object visit(Variable node, Object param) {
		super.visit(node, param);                                                  // 縃ace falta?

		node.setTipo(node.getDefinicion().getTipo());
		node.setModificable(true);

		if(param != null && node.getTipo().getClass() == TipoStruct.class) {
			TipoStruct struct= (TipoStruct) node.getTipo();
			DefStruct defS= struct.getDefinicion();

			boolean i=false;
			for(CuerpoStruct dC :defS.getCuerpostruct()) {
				if(dC.getIdent().equals((String)param)) {
					i= true;
					Tipo tipo = dC.getTipo();
					if(dC.getTipo().getClass() == TipoArray.class) {
						node.setTipo(((TipoArray)tipo).getTipo());
					}
					else
						node.setTipo(dC.getTipo());

					break;
				}
			}predicado(i,"Error. Estructura - El campo al que se hace referencia no existe en la estructura " 
					+ defS.getIdent(), node.getStart());
		}

		return null;
	}

	//	class LiteralInt { String value; }
	public Object visit(LiteralInt node, Object param) {
		return null;
	}

	//	class LiteralReal { String value; }
	public Object visit(LiteralReal node, Object param) {
		return null;
	}

	//	class LiteralChar { String value; }
	public Object visit(LiteralChar node, Object param) {
		return null;
	}

	//	class Cast { Tipo tipo;  Expresion expresion; }
	public Object visit(Cast node, Object param) {

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class Negacion { Expresion expresion; }
	public Object visit(Negacion node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	//	class ExpresionAritmetica { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionAritmetica node, Object param) {

		// super.visit(node, param);

		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);

		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);

		return null;
	}

	//	class ExpresionBinaria { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionBinaria node, Object param) {

		// super.visit(node, param);

		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);

		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);

		return null;
	}

	//	class InvocacionFuncionExpresion { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncionExpresion node, Object param) {

		// super.visit(node, param);

		if (node.getParametros() != null)
			for (Expresion child : node.getParametros())
				child.accept(this, param);

		return null;
	}
    
    /**
     * predicado. M茅todo auxiliar para implementar los predicados. Borrar si no se quiere usar.
     *
     * Ejemplos de uso (suponiendo que existe un m茅todo "esPrimitivo"):
     *
     *      1. predicado(esPrimitivo(expr.tipo), "La expresi贸n debe ser de un tipo pimitivo", expr.getStart());
     *      2. predicado(esPrimitivo(expr.tipo), "La expresi贸n debe ser de un tipo pimitivo", expr);
     *      3. predicado(esPrimitivo(expr.tipo), "La expresi贸n debe ser de un tipo primitivo");
     *
     * NOTA: El m茅todo getStart() (ejemplo 1) indica la linea/columna del fichero fuente donde estaba el nodo
     * (y as铆 poder dar informaci贸n m谩s detallada de la posici贸n del error). Si se usa VGen, dicho m茅todo
     * habr谩 sido generado en todos los nodos del AST.
     * No es obligatorio llamar a getStart() (ejemplo 2), ya que si se pasa el nodo, se usar谩 por defecto dicha
     * posici贸n.
     * Si no se quiere imprimir la posici贸n del fichero, se puede omitir el tercer argumento (ejemplo 3).
     *
     * @param condicion     Debe cumplirse para que no se produzca un error
     * @param mensajeError  Se imprime si no se cumple la condici贸n
     * @param posicionError Fila y columna del fichero donde se ha producido el error.
     */
    private void predicado(boolean condicion, String mensajeError, Position posicionError) {
        if (!condicion)
            errorManager.notify("Comprobaci贸n de tipos", mensajeError, posicionError);
    }

    private void predicado(boolean condicion, String mensajeError, AST node) {
        predicado(condicion, mensajeError, node.getStart());
    }

    private void predicado(boolean condicion, String mensajeError) {
        predicado(condicion, mensajeError, (Position) null);
    }


    private ErrorManager errorManager;
}
