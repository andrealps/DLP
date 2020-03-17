package ast;

import visitor.Visitor;

public class Cast extends AbstractExpression{
    private Type type;
    private Expression expression;

    public Cast(int line, int column, Type type, Expression expression) {
        super(line, column);
        this.type = type;
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
