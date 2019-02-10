package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;

import parser.*;

public class Main {
    public static final String program = "source.txt"; // Usar args[0] en la versión final

    public static void main(String[] args) throws Exception {
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName(program));

        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new DiagnosticErrorListener()); // Notificar entradas ambiguas
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

        parser.start();

        System.out.println("Compilación Finalizada");
    }
}
