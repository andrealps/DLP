package ast;

import visitor.Visitor;

public class RecordAccess extends AbstractExpression {
    private Expression expression;
    private String name;

    public RecordAccess(int line, int column, Expression expression, String name) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
