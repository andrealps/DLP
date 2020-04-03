package codegenerator;

import ast.*;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor {
    // GLOBALES
    private int bytesGlobal = 0;
    // LOCALES
    private int bytesLocal = 0;

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        varDefinition.getType().accept(this, param);
        // Variables GLOBALES
        if (varDefinition.getScope() == 0) {
            varDefinition.setOffset(bytesGlobal);
            bytesGlobal += varDefinition.getType().getSize();
        }
        // Variables LOCALES, lo damos por hecho
        else {
            // Las guardamos con signo negativo para que luego sea más fácil utilizarlas
            bytesLocal -= varDefinition.getType().getSize();
            varDefinition.setOffset(bytesLocal);
        }
        return null;
    }

    @Override
    public Object visit(FunctionType functionType, Object param) {
        functionType.getReturnType().accept(this, param);
        int bytesParam = 0;
        for (int i = functionType.getVarDefinitions().size() - 1; i >= 0; i--) {
            // Calcular offset de los parámetros, no visitarlos
            functionType.getVarDefinitions().get(i).setOffset(4 + bytesParam);
            bytesParam += functionType.getVarDefinitions().get(i).getType().getSize();
        }
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        bytesLocal = 0;
        funcDefinition.getType().accept(this, funcDefinition);
        for (Statement s : funcDefinition.getStatements())
            s.accept(this, param);
        return null;
    }

    @Override
    public Object visit(Record record, Object param) {
        int bytesField = 0;
        for (RecordField r: record.getRecordFields()) {
            r.accept(this, param);
            r.setOffset(bytesField);
            bytesField += r.getType().getSize();
        }
        return null;
    }
}
