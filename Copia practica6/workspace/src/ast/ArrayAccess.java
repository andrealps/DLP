package ast;

public class ArrayAccess extends AbstractBinaryExpression{

    public ArrayAccess(int line, int column, Expression expression1, Expression expression2) {
        super(line, column, expression1, expression2);
    }
}
