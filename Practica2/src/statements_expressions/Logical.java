package statements_expressions;

public class Logical extends AbstractBinaryExpression{
    private String operator;

    public Logical(Expression expression1, Expression expression2, String operator) {
        super(expression1, expression2);
        this.operator = operator;
    }
}
