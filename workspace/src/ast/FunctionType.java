package ast;

import errorhandler.ErrorType;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private List<VarDefinition> varDefinitions;
    private Type returnType;

    public FunctionType(int line, int column, List<VarDefinition> varDefinitions, Type returnType) {
        super(line, column);
        this.varDefinitions = varDefinitions;
        this.returnType = returnType;
    }

    public List<VarDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public Type parenthesis(List<Expression> expressions) {
        if (varDefinitions.size() != expressions.size())
            return null;
        for (int i = 0; i < varDefinitions.size(); i++) {
            if (varDefinitions.get(i).getType().promotesTo(expressions.get(i).getType()) == null)
                return null;
        }
        return returnType;
    }

    @Override
    public Type checkReturnType(Type type) {
        if (type instanceof ErrorType || returnType.getClass().equals(type.getClass()))
            return type;
        return null;
    }

    @Override
    public int getSize() {
        return returnType.getSize();
    }
}
