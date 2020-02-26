package ast;

public class ArrayAccess {
    private String name;
    private Expression expression;

    public ArrayAccess(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }
}
