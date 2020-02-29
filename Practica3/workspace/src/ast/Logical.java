package ast;

public class Logical extends AbstractBinaryExpression{
    private String operator;

    public Logical(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
