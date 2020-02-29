package ast;

public class DoubleLiteral extends AbstractASTNode {
    private double value;

    public DoubleLiteral(double value) {
        super(0, 0);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
