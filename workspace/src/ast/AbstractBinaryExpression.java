package ast;

public abstract class AbstractBinaryExpression extends AbstractExpression{
    private Expression expression1;
    private Expression expression2;

    public AbstractBinaryExpression(int line, int column, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }


}
