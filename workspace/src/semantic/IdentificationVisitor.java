package semantic;

import ast.*;
import errorhandler.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor {
    private SymbolTable table = new SymbolTable();

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        if (!table.insert(funcDefinition))
            new ErrorType(funcDefinition.getLine(), funcDefinition.getColumn(),
                    "Error, la variable " + funcDefinition.getName() + " ya esta definida");

        table.set();

        funcDefinition.getType().accept(this, funcDefinition);
        for(Statement s: funcDefinition.getStatements())
            s.accept(this, param);

        table.reset();
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        if (!table.insert(varDefinition))
            new ErrorType(varDefinition.getLine(), varDefinition.getColumn(),
                    "Error, la variable " + varDefinition.getName() + " ya esta definida");
        varDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        Definition def = table.find(variable.getName());
        if (def == null)
            new ErrorType(variable.getLine(), variable.getColumn(),
                    "Error, variable " + variable.getName() + " no definida");
        else
            variable.setDefinition(def);
        return null;
    }
}
