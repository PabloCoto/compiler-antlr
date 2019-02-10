package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;

import parser.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName("source.txt"));
         GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName("test.txt"));

        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new DiagnosticErrorListener()); // Notificar entradas ambiguas       //linea opcional
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);			//linea opcional

        parser.start(); //empieza por la primera regla 
       
        System.out.println("Compilación Finalizada");
    }
}
