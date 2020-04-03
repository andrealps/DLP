package errorhandler;

import ast.AbstractType;
import visitor.Visitor;

public class ErrorType extends AbstractType {
    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        errorType();
    }

    public void errorType() {
        EH.getEH().addError(this);
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public int getSize() {
        // No se puede llegar aquí si no hay errores en la fase de análisis
        throw new IllegalStateException("Error, hay fallos en el análisis");
    }
}
