package ast;

public class Input extends AbstractUnaryExpressionStatement{

    public Input(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
