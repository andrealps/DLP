package statements_expressions;

import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {
    private List<Expression> expressions;
    private Variable variable;

    public FunctionInvocation(int line, String column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }
}
