package main;

public class AbstractASTNode implements ASTNode {
    private int line;
    private String column;

    public AbstractASTNode(int line, String column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public String getColumn() {
        return column;
    }
}