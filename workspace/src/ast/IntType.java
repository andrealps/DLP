package ast;

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
}
