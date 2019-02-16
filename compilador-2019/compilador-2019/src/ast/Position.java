package ast;

/**
 * @author Raúl Izquierdo
 */

public class Position {

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    private int line, column;
}