package ast;

import errorhandler.ErrorType;
import visitor.Visitor;

public class IntType extends AbstractType{
    private static IntType intType = new IntType();

    private IntType() {
        super(0, 0);
    }

    public static IntType getInstance(){
        if (intType == null)
            intType = new IntType();
        return intType;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof ErrorType || type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public Type arithmetic() {
        return this;
    }

    @Override
    public Type comparison(Type type) {
        if (type instanceof IntType)
            return IntType.getInstance();
        return null;
    }

    @Override
    public Type logic(Type type) {
        if (type instanceof ErrorType || type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public Type logic() {
        return this;
    }

    @Override
    public Type promotesTo(Type type) {
        if (type instanceof ErrorType || type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public Type canBeCastTo(Type type) {
        if (type instanceof ErrorType || type instanceof IntType || type instanceof DoubleType || type instanceof CharType)
            return type;
        return null;
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }
}
