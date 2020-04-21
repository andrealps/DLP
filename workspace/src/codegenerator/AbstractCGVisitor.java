package codegenerator;

import ast.*;
import errorhandler.ErrorType;
import visitor.Visitor;

public class AbstractCGVisitor implements Visitor {
    @Override
    public Object visit(Program program, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Assigment assigment, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Input input, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Print print, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(While whileP, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(IfElse ifElse, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Return returnP, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Logical logical, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(FunctionInvocation functionInvocation, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Variable variable, Object param) {
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Negation negation, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(RecordAccess recordAccess, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Record record, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(RecordField recordField, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(Array array, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(IntType intType, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(DoubleType doubleType, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(CharType charType, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(VoidType voidType, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(FunctionType functionType, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }

    @Override
    public Object visit(ErrorType errorType, Object param) {
        throw new IllegalArgumentException("Error, no puede llamarse al método de AbstractCGVisitor");
    }
}
