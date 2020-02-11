package statements_expressions;

import java.util.List;

public class Return extends AbstractUnaryExpressionStatement {
    private List<Statement> statements;

    public Return(int line, String column, Expression expression, List<Statement> statements) {
        super(line, column, expression);
        this.statements = statements;
    }
}
