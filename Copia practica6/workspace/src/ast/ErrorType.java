package ast;

public class ErrorType extends AbstractType {
    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    public ErrorType errorType(int line, int column, String message){
        return new ErrorType(line, column, message);
    }

    @Override
    public String toString(){
       return message;
    }
}
