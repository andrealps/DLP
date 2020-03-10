package errorhandler;

import ast.AbstractType;

public class ErrorType extends AbstractType {
    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        errorType();
    }

    public void errorType(){
        EH.getEH().addError(this);
    }

    @Override
    public String toString(){
       return message;
    }
}
