package ast;

public class FunctionType extends AbstractType {
    private Type field;

    public FunctionType(int line, int column, Type field) {
        super(line, column);
        this.field = field;
    }

    public Type getField() {
        return field;
    }
}
