package statements_expressions;

public class Assigment extends AbstractBinaryExpression implements Statement{
    public Assigment(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }
}
