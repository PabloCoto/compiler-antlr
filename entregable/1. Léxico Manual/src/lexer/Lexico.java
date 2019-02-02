/*
Añadir EN ESTE ORDEN:
- Constantes reales: 3.15, 78.23, ... (parte entera obligatoria/parte decimal OPCIONAL)
- Operadores aritméticos y otros simbolos:  + - * / . : = ; [ ] ( ) { } < >
- Palabras reservadas: if, while, read, write, int y real
*/

package lexer;

import java.io.*;

public class Lexico {
    // public static final int POR = '*';  // '*' -> 42
    public static final int INT_CONSTANT = 256;
    public static final int IDENT = 257;

    private Reader input;
    private int currentChar;

    public Lexico(Reader reader) throws IOException {
        input = reader;
        readNext();
    }

    // Funciones auxiliares -------------------------------
    private char readNext() throws IOException {
        currentChar = input.read();
        return (char) currentChar;
    }

    private char getChar() throws IOException {
        return (char) currentChar;
    }

    // Aquí empieza el Analizador Léxico ------------------
    public Token nextToken() throws IOException {

        while (true) {
            while (Character.isWhitespace(getChar()))
                readNext();

            if (currentChar == -1)
                return new Token(0, null);

            if (getChar() == '*') {
                readNext();
                return new Token('*', "*");
            }

            if (Character.isDigit(getChar())) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(getChar());
                while (Character.isDigit(readNext()))
                    buffer.append(getChar());
                return new Token(INT_CONSTANT, buffer.toString());
            }

            if (Character.isLetter(getChar())) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(getChar());
                while (Character.isLetterOrDigit(readNext()))
                    buffer.append(getChar());
                return new Token(IDENT, buffer.toString());
            }

            System.out.println("Error lexico: " + getChar());
            readNext();
        }
    }
}
