package ast;

import java.util.List;

public class Return extends AbstractUnaryExpressionStatement {
    public Return(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
