package codegenerator;

import ast.*;

/**
 * Expresiones
 */
public class ValueCGVisitor extends AbstractCGVisitor {
    private CodeGenerator cG;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cG) {
        this.cG = cG;
    }

    public void setAddressVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        variable.accept(addressCGVisitor, param);
        cG.load(variable.getType());
        return null;

        /* value[[Variable: expression -> ID]]() =
        	address[[expression]]
        	<load> expression.type.suffix()
        */
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        cG.push(intLiteral.getValue());
        return null;

        /* value[[IntLiteral: expression -> INT_CONSTANT]]() =
        	<push> expression.getType().suffix()
        */
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object param) {
        cG.push(doubleLiteral.getValue());
        return null;

        /* value[[DoubleLiteral: expression -> REAL_CONSTANT]]() =
        	<push> expression.getType().suffix()
         */
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        cG.push(charLiteral.getValue());
        return null;

        /* value[[CharLiteral: expression -> CHAR_CONSTANT]]() =
        	<push> expression.getType().suffix()
        */
    }

    @Override
    public Object visit(Logical logical, Object param) {
        logical.getExpression1().accept(this, param);
        logical.getExpression2().accept(this, param);

        cG.logical(logical.getOperator());
        return null;

        /* value[[Logical: expression -> exp1=expr op=('&&'|'||') exp2=expr]]() =
         valor[[exp1]]
         valor[[exp2]]
         switch (op)
             case '&&': <and>
             case '||': <or>
         */
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object param) {
        arrayAccess.accept(addressCGVisitor, param);
        cG.load(arrayAccess.getType());
        return null;

        /* value[[ArrayAccess: expression -> exp1=expr '[' exp2=expr ']' ]]() =
         address[[expression]]
         <load> expr1.type.suffix()
        */
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        comparison.getExpression1().accept(this, param);
        comparison.getExpression2().accept(this, param);

        cG.comparison(comparison.getOperator(), comparison.getExpression2().getType());
        return null;

        /* value[[Comparison: expression -> exp1=expr op=('>'|'>='|'<'|'<='|'!='|'==') exp2=expr]]() =
         valor[[exp1]]
         valor[[exp2]]
         switch (op)
             case '>': <gt> + exp1.type.suffix()
             case '>=': <ge> + exp1.type.suffix()
             case '<': <lt> + exp1.type.suffix()
             case '<=': <le> + exp1.type.suffix()
             case '!=': <ne> + exp1.type.suffix()
             case '==': <eq> + exp1.type.suffix()
         */
    }

    @Override
    public Object visit(Cast cast, Object param) {
        cast.getExpression().accept(this, param);
        cG.cast(cast.getExpression().getType(), cast.getType());
        return null;

        /* value[[ArrayAccess: expression -> '(' primitiveType ')' expr]]() =
         value[[expr]]
         expr.getType().suffix() <2> primitiveType.suffix()
        */
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        cG.push(-1);
        unaryMinus.getExpression().accept(this, param);
        cG.mul(unaryMinus.getType());
        return null;

        /* value[[UnaryMinus: expression -> '-' expr]]() =
         <pushi -1>
         value[[expr]]
         <mul> expr.getType().suffix()
         */
    }

    @Override
    public Object visit(Negation negation, Object param) {
        negation.getExpression().accept(this, param);
        cG.not();
        return null;

        /* value[[Negation: expression -> '!' expr]]() =
         valor[[exp]]
         <not>
         */
    }

    @Override
    public Object visit(RecordAccess recordAccess, Object param) {
        recordAccess.accept(addressCGVisitor, param);
        cG.load(recordAccess.getType());
        return null;

        /* value[[RecordAccess: expression -> ex1=expr '.' ID]]() =
        	address[[expression]]
        	<load> expr.type.suffix()
        */
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        arithmetic.getExpression1().accept(this, param);
        arithmetic.getExpression2().accept(this, param);
        cG.arithmetic(arithmetic.getOperator(), arithmetic.getExpression1().getType());
        return null;

        /* execute[[Arithmetic: statement -> exp1=expr op=('*'|'/'|'%') exp2=expr]]() =
         value[[left]]
         value[[right]]
         if (operator == "+")
            <add> left.getType().suffix()
         if (operator == "-")
            <sub> left.getType().suffix()
         if (operator == "*")
            <mul> left.getType().suffix()
         if (operator == "/")
            <div> left.getType().suffix()
         */
    }

    // Object visit (FunctionInvocation functionInvocation, Object param);
}
