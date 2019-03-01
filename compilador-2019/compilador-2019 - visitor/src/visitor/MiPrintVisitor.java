package visitor;

import ast.*;

public class MiPrintVisitor extends DefaultVisitor {

	//	class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {

		 super.visit(node, param);

//		if (node.getDefinicion() != null)
//			for (Definicion child : node.getDefinicion())
//				child.accept(this, param);

		return null;
	}

	//	class DefVariable { String ident;  Tipo tipo; }
	public Object visit(DefVariable node, Object param) {

		 super.visit(node, param);

//		if (node.getTipo() != null)
//			node.getTipo().accept(this, param);

		return null;
	}

	//	class DefStruct { String ident;  List<CuerpoStruct> cuerpostruct; }
	public Object visit(DefStruct node, Object param) {

		 super.visit(node, param);

//		if (node.getCuerpostruct() != null)
//			for (CuerpoStruct child : node.getCuerpostruct())
//				child.accept(this, param);

		return null;
	}

	//	class CuerpoStruct { String ident;  Tipo tipo; }
	public Object visit(CuerpoStruct node, Object param) {

		 super.visit(node, param);

//		if (node.getTipo() != null)
//			node.getTipo().accept(this, param);

		return null;
	}

	//	class DefFuncion { String ident;  List<Param> parametrosFuncion;  Tipo tipo;  List<DefVariable> definiciones;  List<Sentencia> sentencias; }
	public Object visit(DefFuncion node, Object param) {

		 super.visit(node, param);

//		if (node.getParametrosFuncion() != null)
//			for (Param child : node.getParametrosFuncion())
//				child.accept(this, param);
//
//		if (node.getTipo() != null)
//			node.getTipo().accept(this, param);
//
//		if (node.getDefiniciones() != null)
//			for (DefVariable child : node.getDefiniciones())
//				child.accept(this, param);
//
//		if (node.getSentencias() != null)
//			for (Sentencia child : node.getSentencias())
//				child.accept(this, param);

		return null;
	}

	//	class Param { String ident;  Tipo tipo; }
	public Object visit(Param node, Object param) {

		 super.visit(node, param);

//		if (node.getTipo() != null)
//			node.getTipo().accept(this, param);

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

		 super.visit(node, param);

//		if (node.getTipo() != null)
//			node.getTipo().accept(this, param);

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

		 super.visit(node, param);

//		if (node.getExpresion() != null)
//			node.getExpresion().accept(this, param);

		return null;
	}

	//	class Asignacion { Expresion izq;  Expresion der; }
	public Object visit(Asignacion node, Object param) {

		// super.visit(node, param);

		if (node.getIzq() != null)
			node.getIzq().accept(this, param);

		if (node.getDer() != null)
			node.getDer().accept(this, param);

		return null;
	}

	//	class Print { Expresion expresion; }
	public Object visit(Print node, Object param) {

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

	//	class InvocacionFuncion { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncion node, Object param) {

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
}
