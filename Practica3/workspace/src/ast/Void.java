package ast;

public class Void extends AbstractType {
    private static Void voidType = new Void();
    private Void() {
        super(0, 0);
    }

    public static Void getInstance(){
        if (voidType == null)
            voidType = new Void();
        return voidType;
    }
}
