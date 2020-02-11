package type;

public class Void implements Type {
    private static Void voidType = new Void();
    private Void() {
    }

    public static Void getInstance(){
        return voidType;
    }
}
