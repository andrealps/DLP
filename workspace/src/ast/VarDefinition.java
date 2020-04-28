package ast;

import visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement{
    private int offset;
    private int scope;

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    @Override
    public Object accept(Visitor v, Object p){
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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getInfo(){
        return getType().toString() + " " + getName() + " (offset " + getOffset() + ")";
    }
}
