package semantic;

import ast.*;
import errorhandler.ErrorType;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor {
    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        intLiteral.setLValue(false);
        intLiteral.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object param) {
        doubleLiteral.setLValue(false);
        doubleLiteral.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        charLiteral.setLValue(false);
        charLiteral.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        variable.setLValue(true);
        variable.setType(variable.getDefinition().getType());
        return null;
    }


    @Override
    public Object visit(RecordAccess r, Object param) {
        r.setLValue(true);
        r.getExpression().accept(this, param);

        r.setType(r.getExpression().getType().dot(r.getName()));
        if (r.getType() == null)
            r.setType(new ErrorType(r.getExpression().getLine(), r.getExpression().getColumn(), "No es posible el acceso al campo en la linea "
                    + r.getExpression().getLine() + ", columna " + r.getExpression().getColumn()));
        return null;
    }

    @Override
    public Object visit(Negation n, Object param) {
        n.setLValue(false);
        n.getExpression().accept(this, param);

        n.setType(n.getExpression().getType().logic());
        if (n.getType() == null)
            n.setType(new ErrorType(n.getExpression().getLine(), n.getExpression().getColumn(), "Se esperaba un tipo aritmetico en la linea "
                    + n.getExpression().getLine() + ", columna " + n.getExpression().getColumn()));
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        unaryMinus.setLValue(false);
        unaryMinus.getExpression().accept(this, param);
        if (unaryMinus.getExpression().getType().arithmetic() == null)
            unaryMinus.getExpression().setType(new ErrorType(unaryMinus.getExpression().getLine(), unaryMinus.getExpression().getColumn(),
                    "Se esperaba un tipo aritmetico en la linea " + unaryMinus.getExpression().getLine()
                            + ", columna " + unaryMinus.getExpression().getColumn()));
        return null;
    }

    @Override
    public Object visit(Cast c, Object param) {
        c.setLValue(false);
        c.getExpression().accept(this, param);
        c.getType().accept(this, param);

        c.setType(c.getExpression().getType().canBeCastTo(c.getType()));
        if (c.getType() == null)
            c.setType(new ErrorType(c.getExpression().getLine(), c.getExpression().getColumn(), "Cast invalido en la linea "
                    + c.getExpression().getLine() + ", columna " + c.getExpression().getColumn()));
        return null;
    }

    @Override
    public Object visit(ArrayAccess aC, Object param) {
        aC.setLValue(true);
        aC.getExpression1().accept(this, param);
        aC.getExpression2().accept(this, param);

        aC.setType(aC.getExpression1().getType().squareBrackets(aC.getExpression2().getType()));
        if (aC.getType() == null)
            aC.setType(new ErrorType(aC.getExpression2().getLine(), aC.getExpression2().getColumn(), "No es posible el acceso a array en la linea "
                    + aC.getExpression2().getLine() + ", columna " + aC.getExpression2().getColumn()));

        return null;
    }

    @Override
    public Object visit(Comparison c, Object param) {
        c.setLValue(false);
        c.getExpression1().accept(this, param);
        c.getExpression2().accept(this, param);

        c.setType(c.getExpression1().getType().comparison(c.getExpression2().getType()));
        if (c.getType() == null)
            c.setType(new ErrorType(c.getExpression1().getLine(), c.getExpression1().getColumn(), "Tipos no comparables en la linea "
                    + c.getExpression1().getLine() + ", columna " + c.getExpression1().getColumn()));
        return null;
    }

    @Override
    public Object visit(Logical l, Object param) {
        l.setLValue(false);
        l.getExpression1().accept(this, param);
        l.getExpression2().accept(this, param);

        l.setType(l.getExpression1().getType().logic(l.getExpression2().getType()));
        if (l.getType() == null)
            l.setType(new ErrorType(l.getExpression1().getLine(), l.getExpression1().getColumn(), "Tipos no logicos en la linea "
                    + l.getExpression1().getLine() + ", columna " + l.getExpression1().getColumn()));
        return null;
    }

    @Override
    public Object visit(Assigment a, Object param) {
        a.getExpression1().accept(this, param);
        a.getExpression2().accept(this, param);
        if (!a.getExpression1().getLValue())
            new ErrorType(a.getLine(), a.getColumn(),
                    "Se esperaba un LValue en la linea " + a.getLine() + ", columna " + a.getColumn());

        a.setType(a.getExpression1().getType().promotesTo(a.getExpression2().getType()));
        if (a.getType() == null)
            a.setType(new ErrorType(a.getExpression1().getLine(), a.getExpression1().getColumn(), "Tipos no compatibles en la linea "
                    + a.getExpression1().getLine() + ", columna " + a.getExpression1().getColumn()));
        return null;
    }

    @Override
    public Object visit(Arithmetic a, Object param) {
        a.getExpression1().accept(this, param);
        a.getExpression2().accept(this, param);
        a.setLValue(false);

        a.setType(a.getExpression1().getType().arithmetic(a.getExpression2().getType()));
        if (a.getType() == null)
            a.setType(new ErrorType(a.getExpression1().getLine(), a.getExpression1().getColumn(), "Tipos incompatibles en la línea "
                    + a.getExpression1().getLine() + ", columna " + a.getExpression1().getColumn()));
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

    @Override
    public Object visit(While whileP, Object param) {
        whileP.getExpression().accept(this, param);
        if (!whileP.getExpression().getType().isLogical())
            whileP.getExpression().setType(new ErrorType(whileP.getExpression().getLine(), whileP.getExpression().getColumn(),
                    "Se esperaba un tipo logico en la linea " + whileP.getExpression().getLine()
                            + ", columna " + whileP.getExpression().getColumn()));
        for (Statement s : whileP.getStatements())
            s.accept(this, param);
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        ifElse.getExpression().accept(this, param);
        if (!ifElse.getExpression().getType().isLogical())
            ifElse.getExpression().setType(new ErrorType(ifElse.getExpression().getLine(), ifElse.getExpression().getColumn(),
                    "Se esperaba un tipo logico en la linea " + ifElse.getExpression().getLine()
                            + ", columna " + ifElse.getExpression().getColumn()));
        for (Statement s : ifElse.getIfStatements())
            s.accept(this, param);
        for (Statement s : ifElse.getElseStatements())
            s.accept(this, param);
        return null;
    }

    @Override
    public Object visit(FunctionInvocation fI, Object param) {
        fI.getVariable().accept(this, param);
        for (Expression e : fI.getExpressions())
            e.accept(this, param);

        fI.setType(fI.getVariable().getType().parenthesis(fI.getExpressions()));
        if (fI.getType() == null)
            fI.setType(new ErrorType(fI.getLine(), fI.getColumn(), "Invocacion a funcion erronea en la linea "
                    + fI.getLine() + ", columna " + fI.getColumn()));
        return null;
    }

    @Override
    public Object visit(FuncDefinition fD, Object param) {
        fD.getType().accept(this, fD);
        for (Statement s : fD.getStatements())
            s.accept(this, fD);
        return null;
    }

    @Override
    public Object visit(Return returnP, Object param) {
        returnP.getExpression().accept(this, param);
        FuncDefinition function = (FuncDefinition) param;
        returnP.getExpression().setType(function.getType().checkReturnType(returnP.getExpression().getType()));
        if (returnP.getExpression().getType() == null)
            returnP.getExpression().setType(new ErrorType(returnP.getLine(), returnP.getColumn(),
                    "Tipo del return incompatible con el de la funcion en la linea "
                    + returnP.getLine() + ", columna " + returnP.getColumn()));
        return null;
    }

}
