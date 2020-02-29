package ast;

public class CharLiteral extends AbstractExpression {
    private char value;

    public CharLiteral(char value) {
        super(0, 0);
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
