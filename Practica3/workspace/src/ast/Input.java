package ast;

public class Input extends AbstractUnaryExpressionStatement{

    public Input(int line, String column, Expression expression) {
        super(line, column, expression);
    }
}