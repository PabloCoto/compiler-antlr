package main;

import org.antlr.v4.runtime.*;

import parser.*;

public class Main {
    public static final String program = "source.txt"; // Usar args[0] en la versión final

    public static void main(String[] args) throws Exception {

        Lexicon textLexer = new Lexicon(CharStreams.fromFileName("source.txt"));

        Token token;
        while ((token = textLexer.nextToken()).getType() != Lexicon.EOF) {
            System.out.println("Token: " + token.getType());
        }

    }
}
