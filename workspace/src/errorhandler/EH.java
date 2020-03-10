package errorhandler;

import ast.AbstractASTNode;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class EH extends AbstractASTNode {
    private static EH errorHandler;
    private List<ErrorType> errors = new ArrayList<ErrorType>();

    public EH() {
        super(0, 0);
    }

    public static EH getEH(){
        if (errorHandler == null){
            errorHandler = new EH();
        }
        return errorHandler;
    }

    public boolean hasErrors(){
        return !errors.isEmpty() ? true: false;
    }

    public void showErrors(PrintStream printStream){
        for (ErrorType error: errors){
            printStream.println(error.toString());
        }
    }

    public void addError(ErrorType error){
        errors.add(error);
    }
}
