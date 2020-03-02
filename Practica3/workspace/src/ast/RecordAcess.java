package ast;

public class RecordAcess extends AbstractExpression {
    private Expression expression;
    private String name;

    public RecordAcess(int line, int column, Expression expression, String name) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }
}
