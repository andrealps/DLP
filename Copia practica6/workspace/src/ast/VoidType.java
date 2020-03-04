package ast;

public class VoidType extends AbstractType {
    private static VoidType voidType = new VoidType();
    private VoidType() {
        super(0, 0);
    }

    public static VoidType getInstance(){
        if (voidType == null)
            voidType = new VoidType();
        return voidType;
    }
}
