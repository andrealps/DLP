package visitor;

import ast.*;

public class AbstractVisitor implements Visitor {
    @Override
    public Object visit(Program program, Object param) {
        return null;
    }

    @Override
    public Object visit(Definition definition, Object param) {
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        return null;
    }

    @Override
    public Object visit(Statement statement, Object param) {
        return null;
    }

    @Override
    public Object visit(Expression expression, Object param) {
        return null;
    }

    @Override
    public Object visit(Assigment assigment, Object param) {
        return null;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        return null;
    }

    @Override
    public Object visit(Input input, Object param) {
        return null;
    }

    @Override
    public Object visit(Print print, Object param) {
        return null;
    }

    @Override
    public Object visit(While whileP, Object param) {
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        return null;
    }

    @Override
    public Object visit(Return returnP, Object param) {
        return null;
    }

    @Override
    public Object visit(Logical logical, Object param) {
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        return null;
    }

    @Override
    public Object visit(FunctionInvocation functionInvocation, Object param) {
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        return null;
    }

    @Override
    public Object visit(Negation negation, Object param) {
        return null;
    }

    @Override
    public Object visit(RecordAccess recordAccess, Object param) {
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
    public Object visit(Type type, Object param) {
        return null;
    }

    @Override
    public Object visit(Record record, Object param) {
        return null;
    }

    @Override
    public Object visit(RecordField recordField, Object param) {
        return null;
    }

    @Override
    public Object visit(Array array, Object param) {
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
        return null;
    }
}
