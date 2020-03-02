package ast;

import java.util.List;

public class FunctionType extends AbstractType {
    private List<VarDefinition> varDefinitions;
    private Type field;

    public FunctionType(int line, int column, List<VarDefinition> varDefinitions, Type field) {
        super(line, column);
        this.varDefinitions = varDefinitions;
        this.field = field;
    }

    public Type getField() {
        return field;
    }
}
