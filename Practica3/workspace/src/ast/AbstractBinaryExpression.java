package ast;

public class AbstractBinaryExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public AbstractBinaryExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
