package ast;

import visitor.Visitor;

import java.util.List;

public class While extends AbstractUnaryExpressionStatement {
    private List<Statement> statements;

    public While(int line, int column, Expression expression, List<Statement> statements) {
        super(line, column, expression);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
