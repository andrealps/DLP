package statements_expressions;

public class AbstractUnaryExpressionStatement extends AbstractStatement {
    private Expression expression;

    public AbstractUnaryExpressionStatement(int line, String column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
