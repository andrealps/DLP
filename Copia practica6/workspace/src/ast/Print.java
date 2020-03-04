package ast;

public class Print extends AbstractUnaryExpressionStatement {
    public Print(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
