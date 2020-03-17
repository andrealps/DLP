package ast;

import visitor.Visitor;

public class Input extends AbstractUnaryExpressionStatement{

    public Input(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

}
