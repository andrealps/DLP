package statements_expressions;

public class Print extends AbstractUnaryExpressionStatement {
    public Print(int line, String column, Expression expression) {
        super(line, column, expression);
    }
}
