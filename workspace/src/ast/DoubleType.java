package ast;

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
}
