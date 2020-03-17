package ast;

import visitor.Visitor;

public class Comparison extends AbstractBinaryExpression {
    private String operator;

    public Comparison(int line, int column, Expression expression1, Expression expression2, String operator) {
        super(line, column, expression1, expression2);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
