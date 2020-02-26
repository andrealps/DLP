package ast;

public class VarDefinition extends AbstractDefinition {
    private int offset;

    public VarDefinition(Type type, String name, int offset) {
        super(type, name);
        this.offset = offset;
    }
}
