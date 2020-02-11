package type;

public class DoubleType implements Type {
    private static DoubleType doubleType = new DoubleType();
    private DoubleType() {
    }

    public static DoubleType getInstance(){
        return doubleType;
    }
}
