package codegenerator;

import ast.*;
import errorhandler.ErrorType;
import visitor.Visitor;

/**
 * LValues
 */
public class AddressCGVisitor extends AbstractCGVisitor {
    private CodeGenerator cG;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cG, ValueCGVisitor valueCGVisitor) {
        this.cG = cG;
        this.valueCGVisitor = valueCGVisitor;
        valueCGVisitor.setAddressVisitor(this);
    }

    @Override
    public Object visit(Variable variable, Object param) {
        if (variable.getDefinition().getScope() == 0)
             cG.pusha(((VarDefinition)variable.getDefinition()).getOffset());
         else {
            cG.pushBP();
            cG.push(((VarDefinition)variable.getDefinition()).getOffset());
            cG.add(IntType.getInstance());
        }
        return null;

        /* address[[Variable: expression -> ID]]()
         if (variable.getDefinition().getScope() == 0)
             <pusha> variable.getDefinition().getOffset()
         else
             pushBP()
             <push> variable.getDefinition().getOffset()
             <addi>
         */
    }

    @Override
    public Object visit(ArrayAccess aC, Object param) {
        // a:[4]int -> a[3]
        aC.getExpression1().accept(this, param); // dir a
        aC.getExpression2().accept(valueCGVisitor, param);  // 3 (valor entre [])
        cG.push(aC.getType().numberOfBytes());  // tamaño tipo array (2)
        cG.mul(IntType.getInstance());  // 2 * 3 = 6
        cG.add(IntType.getInstance());  // dir a + 6

        return null;

        /* address[[ArrayAccess: expression -> exp1=expr '[' exp2=expr ']' ]]() =
         address[[exp1]]
         value[[exp2]]
         <pushi> ac.getType().numberOfBytes()
         <muli>
         <addi>
         */
    }

    @Override
    public Object visit(RecordAccess rA, Object param) {
        // a.b
        rA.getExpression().accept(this, param);
        int offsetField = rA.getExpression().getType().getOffsetByField(rA.getName());

        cG.push(offsetField);
        cG.add(IntType.getInstance());

        return null;

        /* address[[RecordAccess: expression -> ex1=expr '.' ID]]() =
         address[ex1]
         <pushi> ID.offset
         <addi>
         */
    }
}
