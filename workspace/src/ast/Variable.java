package ast;

import visitor.Visitor;

public class Variable extends AbstractExpression{
    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
