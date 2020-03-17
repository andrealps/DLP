package ast;

import visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement{
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

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
