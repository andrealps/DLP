package visitor;

import ast.*;
import errorhandler.*;

public interface Visitor {
    Object visit (Program program, Object param);
    Object visit (FuncDefinition funcDefinition, Object param);
    Object visit (VarDefinition varDefinition, Object param);
    Object visit (Assigment assigment, Object param);
    Object visit (Arithmetic arithmetic, Object param);
    Object visit (Input input, Object param);
    Object visit (Print print, Object param);
    Object visit (While whileP, Object param);
    Object visit (IfElse ifElse, Object param);
    Object visit (Return returnP, Object param);
    Object visit (Logical logical, Object param);
    Object visit (Comparison comparison, Object param);
    Object visit (ArrayAccess arrayAccess, Object param);
    Object visit (FunctionInvocation functionInvocation, Object param);
    Object visit (Variable variable, Object param);
    Object visit (Cast cast, Object param);
    Object visit (UnaryMinus unaryMinus, Object param);
    Object visit (Negation negation, Object param);
    Object visit (RecordAccess recordAccess, Object param);
    Object visit (DoubleLiteral doubleLiteral, Object param);
    Object visit (IntLiteral intLiteral, Object param);
    Object visit (CharLiteral charLiteral, Object param);
    Object visit (Record record, Object param);
    Object visit (RecordField recordField, Object param);
    Object visit (Array array, Object param);
    Object visit (IntType intType, Object param);
    Object visit (DoubleType doubleType, Object param);
    Object visit (CharType charType, Object param);
    Object visit (VoidType voidType, Object param);
    Object visit (FunctionType functionType, Object param);
    Object visit (ErrorType errorType, Object param);

}
