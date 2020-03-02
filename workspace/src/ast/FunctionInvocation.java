package ast;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private List<Expression> expressions;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getVariable() {
        return variable;
    }
}
