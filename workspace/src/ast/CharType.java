package ast;

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

}
