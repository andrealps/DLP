package ast;

public class VarDefinition extends AbstractDefinition {
    private int offset;
    private int scope;

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    public int getOffset() {
        return offset;
    }

    protected void setOffset(int offset) {
        this.offset = offset;
    }

    public int getScope() {
        return scope;
    }

    protected void setScope(int scope) {
        this.scope = scope;
    }
}
