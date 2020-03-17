package visitor;

import ast.*;
import errorhandler.ErrorType;

public class AbstractVisitor implements Visitor {
    @Override
    public Object visit(Program program, Object param) {
        for (Definition def: program.getDefinitions())
            def.accept(this, param);
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        funcDefinition.getType().accept(this, funcDefinition);
        for(Statement s: funcDefinition.getStatements())
            s.accept(this, param);
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        varDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Assigment assigment, Object param) {
        assigment.getExpression1().accept(this, param);
        assigment.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        arithmetic.getExpression1().accept(this, param);
        arithmetic.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Input input, Object param) {
        input.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Print print, Object param) {
        print.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Object visit(While whileP, Object param) {
        whileP.getExpression().accept(this, param);
        for (Statement s: whileP.getStatements())
            s.accept(this, param);
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        ifElse.getExpression().accept(this, param);
        for (Statement s: ifElse.getIfStatements())
            s.accept(this, param);
        for (Statement s: ifElse.getElseStatements())
            s.accept(this, param);
        return null;
    }

    @Override
    public Object visit(Return returnP, Object param) {
        returnP.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Logical logical, Object param) {
        logical.getExpression1().accept(this, param);
        logical.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        comparison.getExpression1().accept(this, param);
        comparison.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        arrayAccess.getExpression1().accept(this, param);
        arrayAccess.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public Object visit(FunctionInvocation functionInvocation, Object param) {
       functionInvocation.getVariable().accept(this, param);
       for (Expression e: functionInvocation.getExpressions())
           e.accept(this, param);
       return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        cast.getExpression().accept(this, param);
        cast.getType().accept(this, param);
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Negation negation, Object param) {
        negation.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Object visit(RecordAccess recordAccess, Object param) {
        recordAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object param) {
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        return null;
    }

    @Override
    public Object visit(Record record, Object param) {
        for (RecordField r: record.getRecordFields())
            r.accept(this, param);
        return null;
    }

    @Override
    public Object visit(RecordField recordField, Object param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Array array, Object param) {
        array.getType().accept(this, param);
        return null;
    }

    @Override
    public Object visit(IntType intType, Object param) {
        return null;
    }

    @Override
    public Object visit(DoubleType doubleType, Object param) {
        return null;
    }

    @Override
    public Object visit(CharType charType, Object param) {
        return null;
    }

    @Override
    public Object visit(VoidType voidType, Object param) {
        return null;
    }

    @Override
    public Object visit(FunctionType functionType, Object param) {
        functionType.getReturnType().accept(this, param);
        for (Definition d: functionType.getVarDefinitions())
            d.accept(this, param);
        return null;
    }

    @Override
    public Object visit(ErrorType errorType, Object param) {
        return null;
    }
}
