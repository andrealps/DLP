package ast;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression {
    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

}
