package ast;

import visitor.Visitor;

public class Print extends AbstractUnaryExpressionStatement {
    public Print(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
