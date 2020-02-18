package statements_expressions;

import main.AbstractASTNode;

import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Expression, Statement {
    private List<Expression> expressions;
    private Variable variable;

    public FunctionInvocation(int line, String column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }
}
