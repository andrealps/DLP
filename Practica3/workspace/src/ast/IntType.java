package ast;

public class IntType extends AbstractType{
    private static IntType intType = new IntType();

    private IntType() {
        super(0, 0);
    }

    public static IntType getInstance(){
        if (intType == null)
            intType = new IntType();
        return intType;
    }
}
