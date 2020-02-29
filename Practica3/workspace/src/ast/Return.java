package ast;

import java.util.List;

public class Return extends AbstractUnaryExpressionStatement {
    private List<Statement> statements;

    public Return(int line, int column, Expression expression, List<Statement> statements) {
        super(line, column, expression);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
