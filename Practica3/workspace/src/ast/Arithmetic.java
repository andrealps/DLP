package ast;

public class Arithmetic extends AbstractBinaryExpression {
    private String operator;

    public Arithmetic(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2);
        this.operator = operator;
    }
}
