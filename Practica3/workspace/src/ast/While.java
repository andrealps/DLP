package ast;

import java.util.List;

public class While extends AbstractUnaryExpressionStatement {
    private List<Statement> statements;

    public While(int line, String column, Expression expression, List<Statement> statements) {
        super(line, column, expression);
        this.statements = statements;
    }
}
