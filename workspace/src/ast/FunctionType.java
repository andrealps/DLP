package ast;

import java.util.List;

public class FunctionType extends AbstractType {
    private List<VarDefinition> varDefinitions;
    private Type returnType;

    public FunctionType(int line, int column, List<VarDefinition> varDefinitions, Type returnType) {
        super(line, column);
        this.varDefinitions = varDefinitions;
        this.returnType = returnType;
    }

    public Type getReturnType() {
        return returnType;
    }
}
