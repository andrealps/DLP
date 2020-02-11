package statements_expressions;

import main.AbstractASTNode;

public class AbstractStatement extends AbstractASTNode implements Statement{
    public AbstractStatement(int line, String column) {
        super(line, column);
    }
}
