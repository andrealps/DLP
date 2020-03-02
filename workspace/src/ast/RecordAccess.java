package ast;

public class RecordAccess extends AbstractExpression {
    private Expression expression;
    private String name;

    public RecordAccess(int line, int column, Expression expression, String name) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }
}
