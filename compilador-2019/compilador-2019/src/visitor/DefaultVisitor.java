/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {
		visitChildren(node.getDefinicion(), param);
		return null;
	}

	//	class DefVariable { String ident;  Tipo tipo; }
	public Object visit(DefVariable node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class DefStruct { String ident;  List<CuerpoStruct> cuerpostruct; }
	public Object visit(DefStruct node, Object param) {
		visitChildren(node.getCuerpostruct(), param);
		return null;
	}

	//	class CuerpoStruct { String ident;  Tipo tipo; }
	public Object visit(CuerpoStruct node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class DefFuncion { String ident;  List<Param> parametrosFuncion;  Tipo tipo;  List<DefVariable> definiciones;  List<Sentencia> sentencias; }
	public Object visit(DefFuncion node, Object param) {
		visitChildren(node.getParametrosFuncion(), param);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		visitChildren(node.getDefiniciones(), param);
		visitChildren(node.getSentencias(), param);
		return null;
	}

	//	class Param { String ident;  Tipo tipo; }
	public Object visit(Param node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class TipoEntero {  }
	public Object visit(TipoEntero node, Object param) {
		return null;
	}

	//	class TipoReal {  }
	public Object visit(TipoReal node, Object param) {
		return null;
	}

	//	class TipoChar {  }
	public Object visit(TipoChar node, Object param) {
		return null;
	}

	//	class TipoArray { String dimension;  Tipo tipo; }
	public Object visit(TipoArray node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class TipoStruct { String ident; }
	public Object visit(TipoStruct node, Object param) {
		return null;
	}

	//	class TipoVoid {  }
	public Object visit(TipoVoid node, Object param) {
		return null;
	}

	//	class Return { Expresion expresion; }
	public Object visit(Return node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class Asignacion { Expresion izq;  Expresion der; }
	public Object visit(Asignacion node, Object param) {
		if (node.getIzq() != null)
			node.getIzq().accept(this, param);
		if (node.getDer() != null)
			node.getDer().accept(this, param);
		return null;
	}

	//	class Print { Expresion expresion; }
	public Object visit(Print node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class Read { Expresion expresion; }
	public Object visit(Read node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class BucleWhile { Expresion condicion;  List<Sentencia> cuerpo; }
	public Object visit(BucleWhile node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getCuerpo(), param);
		return null;
	}

	//	class BucleIf { Expresion condicion;  List<Sentencia> cuerpoIf;  List<Sentencia> cuerpoElse; }
	public Object visit(BucleIf node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getCuerpoIf(), param);
		visitChildren(node.getCuerpoElse(), param);
		return null;
	}

	//	class InvocacionFuncion { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncion node, Object param) {
		visitChildren(node.getParametros(), param);
		return null;
	}

	//	class AccesoStruct { Expresion expresion;  String ident; }
	public Object visit(AccesoStruct node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class AccesoArray { Expresion ident;  Expresion posicion; }
	public Object visit(AccesoArray node, Object param) {
		if (node.getIdent() != null)
			node.getIdent().accept(this, param);
		if (node.getPosicion() != null)
			node.getPosicion().accept(this, param);
		return null;
	}

	//	class Variable { String ident; }
	public Object visit(Variable node, Object param) {
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
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class Negacion { Expresion expresion; }
	public Object visit(Negacion node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class ExpresionAritmetica { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionAritmetica node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class ExpresionBinaria { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionBinaria node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
