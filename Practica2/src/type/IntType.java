package type;

public class IntType implements Type{
    private static IntType intType = new IntType();
    private IntType() {
    }

    public static IntType getInstance(){
        return intType;
    }
}
