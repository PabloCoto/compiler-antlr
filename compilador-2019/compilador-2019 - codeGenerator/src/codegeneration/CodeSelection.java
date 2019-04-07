package codegeneration;

import java.io.*;
import java.util.*;

import ast.*;
import ast.enumerable.AmbitoVariable;
import visitor.*;

enum CodeFunction {
	ADDRESS, VALUE
}

public class CodeSelection extends DefaultVisitor {

	public CodeSelection(Writer writer, String sourceFile) {
		this.writer = new PrintWriter(writer);
		this.sourceFile = sourceFile;

		instruccion.put("+", "add");
		instruccion.put("-", "sub");
		instruccion.put("*", "mul");
		instruccion.put("/", "div");
		instruccion.put("<", "lt");
		instruccion.put(">", "gt");
		instruccion.put("AND", "and");
		instruccion.put("OR", "or");
		instruccion.put("==", "eq");
		instruccion.put("!=", "ne");
		instruccion.put(">=", "ge");
		instruccion.put("<=", "le");
	}

//	class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {
		out("#source \"" + sourceFile + "\"");
		visitChildren(node.getDefinicion(), param);
		out("halt");
		return null;
	}

//	class DefVariable { String ident;  Tipo tipo; }
	public Object visit(DefVariable node, Object param) {
		out("#line " + node.getEnd().getLine());
		if (node.getAmbito() == AmbitoVariable.GLOBAL) {
			out("#GLOBAL " + node.getIdent() + ":" + node.getTipo().getMAPLName());
		}
		return null;
	}

//	class DefFuncion { String ident;  List<DefVariable> parametrosFuncion;  Tipo tipo;  List<DefVariable> definiciones;  List<Sentencia> sentencias; }
	public Object visit(DefFuncion node, Object param) {
		visitChildren(node.getSentencias(), param);
		return null;
	}

//	class Print { Expresion expresion; }
	public Object visit(Print node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getExpresion().accept(this, CodeFunction.VALUE);
		out("out", node.getExpresion().getTipo());
		return null;
	}

//	class Printsp { Expresion expresion; }
	public Object visit(Printsp node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getExpresion().accept(this, CodeFunction.VALUE);
		out("out", node.getExpresion().getTipo());
		out("pushb 32");
		out("outb");
		return null;
	}

//	class Println { Expresion expresion; }
	public Object visit(Println node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getExpresion().accept(this, CodeFunction.VALUE);
		out("out", node.getExpresion().getTipo());
		out("pushb 10");
		out("outb");
		return null;
	}

//	class Return { Expresion expresion; }
	public Object visit(Return node, Object param) {
		out("#line " + node.getEnd().getLine());
		if (node.getExpresion() != null) {
			node.getExpresion().accept(this, CodeFunction.VALUE);
		}
		int returnSize = node.funcionEnLaQueEstoy.getTipo().getSize();
		int localesSize = 0;
		for (DefVariable def : node.funcionEnLaQueEstoy.getDefiniciones()) {
			localesSize += def.getTipo().getSize();
		}
		int parametrosSize = 0;
		for (DefVariable def : node.funcionEnLaQueEstoy.getParametrosFuncion()) {
			parametrosSize += def.getTipo().getSize();
		}
		out("ret " + returnSize + "," + localesSize + "," + parametrosSize);
		return null;
	}

//	class Read { Expresion expresion; }
	public Object visit(Read node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getExpresion().accept(this, CodeFunction.ADDRESS);
		out("in", node.getExpresion().getTipo());
		out("store", node.getExpresion().getTipo());
		return null;
	}

//	class BucleWhile { Expresion condicion;  List<Sentencia> cuerpo; }
	public Object visit(BucleWhile node, Object param) {
		numEtiquetaWhile++;
		int numBucleWhile = numEtiquetaWhile;
		out("#line " + node.getEnd().getLine());
		out("bucleWhile" + numBucleWhile + ":");
		node.getCondicion().accept(this, CodeFunction.VALUE);
		out("jz finBucleWhile" + numBucleWhile);
		visitChildren(node.getCuerpo(), param);
		out("jmp bucleWhile" + numBucleWhile);
		out("finBucleWhile" + numBucleWhile);
		return null;
	}

//	class SentenciaCondicional { Expresion condicion;  List<Sentencia> cuerpoIf;  List<Sentencia> cuerpoElse; }
	public Object visit(SentenciaCondicional node, Object param) {
		numEtiquetaIf++;
		int numIf = numEtiquetaIf;
		out("#line " + node.getEnd().getLine());
		out("sentenciaIf" + numIf + ":");
		node.getCondicion().accept(this, CodeFunction.VALUE);
		out("jz sentenciaElse" + numIf);
		visitChildren(node.getCuerpoIf(), param);
		out("jmp finSentenciaIf" + numIf);
		out("sentenciaElse" + numIf + ":");
		visitChildren(node.getCuerpoElse(), param);
		out("finSentenciaIf" + numIf);
		return null;
	}

//	class InvocacionFuncionSentencia { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncionSentencia node, Object param) {
		out("#line " + node.getEnd().getLine());
		super.visit(node, CodeFunction.VALUE); // hace el visitChildre de los parametros
		out("call " + node.getId());
		if (node.funcionEnLaQueEstoy.getTipo().getClass() != TipoVoid.class) {
			out("pop" + node.funcionEnLaQueEstoy.getTipo());
		}
		return null;
	}

//	class AccesoStruct { Expresion expresion;  String ident; }
	public Object visit(AccesoStruct node, Object param) {
		out("#line " + node.getEnd().getLine());
		super.visit(node, CodeFunction.ADDRESS);
		if (node.getExpresion().getTipo().getClass() == TipoStruct.class) {
			DefStruct defstruct = ((TipoStruct) node.getExpresion().getTipo()).getDefinicion();
			List<CuerpoStruct> campos = defstruct.getCuerpostruct();
			for (CuerpoStruct campo : campos) {
				if (campo.getIdent().equals(node.getIdent())) {
					out("push " + campo.getAddress());
					out("add");
					break;
				}
			}
			if (param == CodeFunction.VALUE) {
				out("load" + node.getTipo());
			}
		}
		return null;
	}

//	class AccesoArray { Expresion ident;  Expresion posicion; }
	public Object visit(AccesoArray node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getIdent().accept(this, CodeFunction.ADDRESS);
		node.getPosicion().accept(this, CodeFunction.VALUE);
		out("push " + node.getIdent().getTipo().getSize());
		out("mul");
		out("add");
		if (param == CodeFunction.VALUE) {
			out("load" + node.getTipo());
		}
		return null;
	}

//	class Variable { String ident; }
	public Object visit(Variable node, Object param) {
		out("#line " + node.getEnd().getLine());
		if (param == CodeFunction.VALUE) {
			visit(node, CodeFunction.ADDRESS);
			out("load" + node.getDefinicion().getTipo());
		} else {
			assert (param == CodeFunction.ADDRESS);
			if (node.getDefinicion().getAmbito() == AmbitoVariable.GLOBAL) {
				out("pusha " + node.getDefinicion().getAddress());
			} else {
				out("push BP");
				out("push " + node.getDefinicion().getAddress());
				out("add");
			}
		}
		return null;
	}

//	class LiteralInt { String value; }
	public Object visit(LiteralInt node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("push " + node.getValue());
		return null;
	}

//	class LiteralReal { String value; }
	public Object visit(LiteralReal node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("pushf " + node.getValue());
		return null;
	}

	// class LiteralChar { String value; }
	public Object visit(LiteralChar node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("pushb " + node.getValue());
		return null;
	}

//	class Cast { Tipo tipo;  Expresion expresion; }
	public Object visit(Cast node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("#line " + node.getEnd().getLine());
		node.getExpresion().accept(this, CodeFunction.VALUE);
		out(node.getExpresion().getTipo().getSuffix() + "2" + node.getTipo().getSuffix());
		return null;
	}

//	class Negacion { Expresion expresion; }
	public Object visit(Negacion node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("#line " + node.getEnd().getLine());
		node.getExpresion().accept(this, CodeFunction.VALUE);
		out("not");
		return null;
	}
	
//	class ExpresionAritmetica { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionAritmetica node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("#line " + node.getEnd().getLine());
		node.getIzquierda().accept(this, CodeFunction.VALUE);
		node.getDerecha().accept(this, CodeFunction.VALUE);
		out(node.getOperador() + node.getDerecha().getTipo());
		return null;
	}
	
//	class ExpresionBinaria { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionBinaria node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("#line " + node.getEnd().getLine());
		node.getIzquierda().accept(this, CodeFunction.VALUE);
		node.getDerecha().accept(this, CodeFunction.VALUE);
		out(node.getOperador() + node.getDerecha().getTipo());
		return null;
	}
	
//	class ExpresionLogica { Expresion izquierda;  String operador;  Expresion derecha; }
	public Object visit(ExpresionLogica node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("#line " + node.getEnd().getLine());
		node.getIzquierda().accept(this, CodeFunction.VALUE);
		node.getDerecha().accept(this, CodeFunction.VALUE);
		out(node.getOperador());
		return null;
	}
	
//	class InvocacionFuncionExpresion { String id;  List<Expresion> parametros; }
	public Object visit(InvocacionFuncionExpresion node, Object param) {
		assert (param == CodeFunction.VALUE);
		out("#line " + node.getEnd().getLine());
		super.visit(node, CodeFunction.VALUE); //llama a los parametros de la invocacion
		out("call " + node.getId());
		return null;
	}

//	class Asignacion { Expresion izq;  Expresion der; }
	public Object visit(Asignacion node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getIzq().accept(this, CodeFunction.ADDRESS);
		node.getDer().accept(this, CodeFunction.VALUE);
		out("STORE", node.getIzq().getTipo());
		return null;
	}

	// Método auxiliar recomendado (opcional) -------------
	private void out(String instruction) {
		writer.println(instruction);
	}

	// MÃ©todo auxiliar
	private void out(String instruccion, Tipo tipo) {
		out(instruccion + tipo.getSuffix());
	}

	private PrintWriter writer;
	private String sourceFile;
	private Map<String, String> instruccion = new HashMap<String, String>();
	private int numEtiquetaWhile = 0;
	private int numEtiquetaIf = 0;

}
