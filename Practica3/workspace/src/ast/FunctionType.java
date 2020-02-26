package ast;

public class FunctionType implements Type {
    private Type field;

    public FunctionType(Type field) {
        this.field = field;
    }
}
