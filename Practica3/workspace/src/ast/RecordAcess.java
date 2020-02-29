package ast;

public class RecordAcess extends AbstractBinaryExpression {

    public RecordAcess(int line, int column, Expression expression1, Expression expression2) {
        super(line, column, expression1, expression2);
    }
}
