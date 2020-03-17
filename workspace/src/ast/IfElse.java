package ast;

import visitor.Visitor;

import java.util.List;

public class IfElse extends AbstractUnaryExpressionStatement {
    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    public IfElse(int line, int column, Expression expression, List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column, expression);
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }

}
