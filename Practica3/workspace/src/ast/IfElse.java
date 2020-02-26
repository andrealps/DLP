package ast;

import java.util.List;

public class IfElse extends AbstractUnaryExpressionStatement {
    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    public IfElse(int line, String column, Expression expression, List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column, expression);
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }
}
