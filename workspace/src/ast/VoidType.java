package ast;

import visitor.Visitor;

public class VoidType extends AbstractType {
    private static VoidType voidType = new VoidType();
    private VoidType() {
        super(0, 0);
    }

    public static VoidType getInstance(){
        if (voidType == null)
            voidType = new VoidType();
        return voidType;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }
}
