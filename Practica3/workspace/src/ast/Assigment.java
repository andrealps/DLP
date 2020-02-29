package ast;

public class Assigment extends AbstractBinaryExpression{
    public Assigment(int line, int column, Expression expression1, Expression expression2) {
        super(line, column, expression1, expression2);
    }
}
