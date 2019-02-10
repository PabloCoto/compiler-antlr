/*
Añadir EN ESTE ORDEN:
- Constantes reales: 3.15, 78.23, ... (parte entera obligatoria/parte decimal OPCIONAL)
- Operadores aritmÃ©ticos y otros simbolos:  + - * / . : = ; [ ] ( ) { } < >
- Palabras reservadas: if, while, read, write, int y real
*/

package lexer;

import java.io.*;
import java.util.*;

public class Lexico {
    public static final int INT_CONSTANT = 256;
    public static final int IDENT = 257;
    public static final int REAL_CONSTANT = 259;
    public static final int WHILE = 260;
    public static final int IF = 261;
    public static final int INT = 262;
    public static final int REAL = 263;
    public static final int WRITE = 264;
    public static final int READ = 265;

    private Reader input;
    private int currentChar; // Se inicializa en constructor

    private String oneCharTokens;
    private Map<String, Integer> reservedWords;
    private int line = 1;

    public Lexico(Reader reader) throws IOException {
        this.input = reader;

        reservedWords = new HashMap<String, Integer>();
        reservedWords.put("while", WHILE);
        reservedWords.put("if", IF);
        reservedWords.put("int", INT);
        reservedWords.put("real", REAL);
        reservedWords.put("write", WRITE);
        reservedWords.put("read", READ);

        this.oneCharTokens = "+-*/.:=;[](){}<>";

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
            while (Character.isWhitespace(getChar())) {
                if (getChar() == '\n')
                    line++;
                readNext();
            }

            if (currentChar == -1)
                return new Token(0, null, line);

            int index = oneCharTokens.indexOf(getChar());
            if (index != -1) {
                char character = getChar();
                readNext();
                return new Token(character, Character.toString(character), line);
            }

            if (Character.isDigit(getChar())) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(getChar());
                while (Character.isDigit(readNext()))
                    buffer.append(getChar());

                if (getChar() != '.')
                    return new Token(INT_CONSTANT, buffer.toString(), line);

                buffer.append(getChar());
                while (Character.isDigit(readNext()))
                    buffer.append(getChar());
                return new Token(REAL_CONSTANT, buffer.toString(), line);
            }

            if (Character.isLetter(getChar())) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(getChar());
                while (Character.isLetterOrDigit(readNext()))
                    buffer.append(getChar());

                String lexeme = buffer.toString();
                Object token = reservedWords.get(lexeme);
                if (token != null)
                    return new Token((Integer) token, lexeme, line);

                return new Token(IDENT, buffer.toString(), line);
            }

            System.out.println("Error léxico en linea " + line + " '" + getChar() + "'");
            readNext();
        }
    }
}
