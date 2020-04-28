package ast;

import errorhandler.ErrorType;
import visitor.Visitor;

public class Array extends AbstractType {
    private int size;
    private Type type;

    public Array(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public int getSizeOf() {
        return size;
    }

    public Type getType() {
        return type;
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public Type squareBrackets(Type type) {
        if (type instanceof ErrorType)
            return type;
        else if (type instanceof IntType)
            return this.type;
        else
            squareBrackets(type);
        return null;
    }

    @Override
    public int numberOfBytes() {
        return size * type.numberOfBytes();
    }

    @Override
    public String toString(){
        String info = getClass().getSimpleName();
        info += "[of:" + type.toString();
        info += ", size:" + size + "]";

        return info;
    }

}
