package ast;

import java.util.List;

public class Return extends AbstractUnaryExpressionStatement {
    public Return(int line, int column, Expression expression, List<Statement> statements) {
        super(line, column, expression);
    }
}
