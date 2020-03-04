package ast;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static ErrorHandler errorHandler;
    private List<ErrorType> errors = new ArrayList<ErrorType>();

    private ErrorHandler(){

    }

    public static ErrorHandler getInstance(){
        if (errorHandler == null){
            errorHandler = new ErrorHandler();
        }
        return errorHandler;
    }

    public boolean hasErrors(){
        !errors.isEmpty() ? return true: return false;
    }

    public void showErrors(PrintStream printStream){

    }


}
