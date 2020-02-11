package type;

public class CharType implements Type {
    private static CharType charType = new CharType();
    private CharType() {
    }

    public static CharType getInstance(){
        return charType;
    }
}
