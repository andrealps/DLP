package ast;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition {
    private List<Statement> statements = new ArrayList<Statement>();

    public FuncDefinition(int line, int column, Type type, String name, List<Statement> statements) {
        super(line, column, type, name);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
