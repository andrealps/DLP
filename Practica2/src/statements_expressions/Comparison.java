package statements_expressions;

public class Comparison extends AbstractBinaryExpression {
    private String operator;

    public Comparison(Expression expression1, Expression expression2, String operator) {
        super(expression1, expression2);
        this.operator = operator;
    }
}
