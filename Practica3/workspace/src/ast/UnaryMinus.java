package ast;

public class UnaryMinus implements Expression {
    private Expression expression;

    public UnaryMinus(Expression expression) {
        this.expression = expression;
    }
}
