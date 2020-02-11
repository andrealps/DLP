package statements_expressions;

public class Arithmetic extends AbstractBinaryExpression {
    private String operator;

    public Arithmetic(Expression expression1, Expression expression2, String operator) {
        super(expression1, expression2);
        this.operator = operator;
    }
}
