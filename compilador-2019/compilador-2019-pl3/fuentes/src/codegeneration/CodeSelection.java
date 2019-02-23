package codegeneration;

import java.io.*;
import java.util.*;

import ast.*;
import visitor.*;

public class CodeSelection extends DefaultVisitor {

    public CodeSelection(Writer writer, String sourceFile) {
        this.writer = new PrintWriter(writer);
        this.sourceFile = sourceFile;
    }

    /*
     * Poner aquí los visit necesarios. Si se ha usado VGen, solo hay que copiarlos
     * de la clase 'visitor/_PlantillaParaVisitors.txt'.
     */

    // Ejemplo:
    //
    // public Object visit(Programa node, Object param) {
    //      out("#source \"" + sourceFile + "\"");
    //      out("call main");
    //      out("halt");
    //
    //      super.visit(node, param); // Recorrer los hijos
    //      return null;
    // }

    // Método auxiliar recomendado (opcional) -------------
    private void out(String instruction) {
        writer.println(instruction);
    }

    private PrintWriter writer;
    private String sourceFile;
}
