package ast;

import visitor.Visitor;

public class Return extends AbstractUnaryExpressionStatement {
    public Return(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
