package ast;

public class IntLiteral extends AbstractExpression {
    private int value;

    public IntLiteral(int value) {
        super(0, 0);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
