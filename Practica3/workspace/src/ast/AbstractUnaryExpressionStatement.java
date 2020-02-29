package ast;

/**
 * Un statement que a su vez tiene una única expresión
 */
public class AbstractUnaryExpressionStatement extends AbstractStatement {
    private Expression expression;

    public AbstractUnaryExpressionStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
