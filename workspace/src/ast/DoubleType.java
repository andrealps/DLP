package ast;

import errorhandler.ErrorType;
import visitor.Visitor;

public class DoubleType extends AbstractType {
    private static DoubleType doubleType = new DoubleType();
    private DoubleType() {
        super(0, 0);
    }

    public static DoubleType getInstance(){
        if (doubleType == null)
            doubleType = new DoubleType();
        return doubleType;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof ErrorType || type instanceof DoubleType)
            return type;
        return null;
    }

    @Override
    public Type arithmetic() {
        return this;
    }

    @Override
    public Type comparison(Type type) {
        if (type instanceof DoubleType)
            return IntType.getInstance();
        return null;
    }
    @Override
    public Type promotesTo(Type type) {
        if (type instanceof ErrorType || type instanceof DoubleType)
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
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}
