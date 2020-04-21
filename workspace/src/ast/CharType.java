package ast;

import errorhandler.ErrorType;
import visitor.Visitor;

public class CharType extends AbstractType {
    private static CharType charType = new CharType();

    private CharType() {
        super(0, 0);
    }

    public static CharType getInstance(){
        if (charType == null)
            charType = new CharType();
        return charType;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof ErrorType || type instanceof CharType)
            return type;
        return null;
    }
    @Override
    public Type comparison(Type type) {
        if (type instanceof CharType)
            return IntType.getInstance();
        return null;
    }

    @Override
    public Type promotesTo(Type type) {
        if (type instanceof ErrorType || type instanceof CharType)
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
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }
}
