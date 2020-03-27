package ast;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type type) {
        return null;
    }

    @Override
    public Type arithmetic() {
        return null;
    }

    @Override
    public Type comparison(Type type) {
        return null;
    }

    @Override
    public Type logic(Type type) {
        return null;
    }

    @Override
    public Type logic() {
        return null;
    }

    @Override
    public Type promotesTo(Type type) {
        return null;
    }

    @Override
    public Type canBeCastTo(Type type) {
        return null;
    }

    @Override
    public Type squareBrackets(Type type) {
        return null;
    }

    @Override
    public Type dot(String fieldName) {
        return null;
    }

    @Override
    public Type parenthesis(List<Expression> expressions) {
        return null;
    }

    @Override
    public Type checkReturnType(Type type) {
        return null;
    }
}
