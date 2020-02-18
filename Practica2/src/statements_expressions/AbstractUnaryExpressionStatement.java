package statements_expressions;

import main.AbstractASTNode;

/**
 * Un statement que a su vez tiene una única expresión
 */
public class AbstractUnaryExpressionStatement extends AbstractASTNode implements Statement {
    private Expression expression;

    public AbstractUnaryExpressionStatement(int line, String column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
