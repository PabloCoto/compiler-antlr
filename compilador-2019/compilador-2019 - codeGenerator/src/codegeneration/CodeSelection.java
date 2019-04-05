package codegeneration;

import java.io.*;
import java.util.*;

import ast.*;
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
	
//	class LiteralInt { String value; }
	public Object visit(LiteralInt node, Object param) {
		assert(param == CodeFunction.VALUE);
		out("push " + node.getValue());
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

}
