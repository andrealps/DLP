package visitor;

import ast.*;
import errorhandler.ErrorType;

public class VisitorLValue extends AbstractVisitor {
    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        intLiteral.setLValue(false);
        return null;
    }
    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object param) {
        doubleLiteral.setLValue(false);
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        charLiteral.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        variable.setLValue(true);
        return null;
    }


    @Override
    public Object visit(RecordAccess recordAccess, Object param) {
        recordAccess.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Negation negation, Object param) {
        negation.setLValue(false);
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        unaryMinus.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        cast.setLValue(false);
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        arrayAccess.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        comparison.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Logical logical, Object param) {
        logical.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Assigment a, Object param) {
        a.getExpression1().accept(this, param);
        a.getExpression2().accept(this, param);
        if (!a.getExpression1().getLValue())
            new ErrorType(a.getLine(), a.getColumn(),
                    "Se esperaba un LValue en la linea " + a.getLine() + ", columna " + a.getColumn());
        return null;
    }

    @Override
    public Object visit(Arithmetic a, Object param) {
        a.setLValue(false);
        a.getExpression1().accept(this, param);
        a.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Input i, Object param) {
        i.getExpression().accept(this, param);
        if (!i.getExpression().getLValue())
            new ErrorType(i.getLine(), i.getColumn(),
                    "Se esperaba un LValue en la linea " + i.getLine() + ", columna " + i.getColumn());
        return null;
    }
}
