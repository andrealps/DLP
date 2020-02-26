package ast;

import java.util.List;

public class ProcedureInvocation extends AbstractUnaryExpressionStatement {
    private List<Statement> statements;
    private Variable variable;

    public ProcedureInvocation(int line, String column, Expression expression, List<Statement> statements, Variable variable) {
        super(line, column, expression);
        this.statements = statements;
        this.variable = variable;
    }
}
