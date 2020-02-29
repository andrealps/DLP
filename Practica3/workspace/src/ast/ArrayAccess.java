package ast;

public class ArrayAccess extends AbstractExpression{
    private String name;
    private Expression expression;

    public ArrayAccess(int line, int column, String name, Expression expression) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }
}
