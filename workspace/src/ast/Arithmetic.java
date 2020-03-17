package ast;

import visitor.Visitor;

public class Arithmetic extends AbstractBinaryExpression implements Statement{
    private String operator;

    public Arithmetic(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2);
        this.operator = operator;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
