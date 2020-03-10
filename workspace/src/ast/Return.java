package ast;

public class Return extends AbstractUnaryExpressionStatement {
    public Return(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
