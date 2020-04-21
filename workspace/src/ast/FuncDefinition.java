package ast;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition {
    private int scope;
    private List<Statement> statements = new ArrayList<Statement>();

    private int bytesLocal;

    public FuncDefinition(int line, int column, Type type, String name, List<Statement> statements) {
        super(line, column, type, name);
        this.statements = statements;

        this.bytesLocal = 0;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getBytesLocal() {
        return bytesLocal;
    }

    public void setBytesLocal(int bytesLocal) {
        this.bytesLocal = -bytesLocal;
    }
}
