package ast;

public class CharType extends AbstractType {
    private static CharType charType = new CharType();

    private CharType() {
        super(0, 0);
    }

    public static CharType getInstance(){
        if (charType == null)
            charType = new CharType();
        return charType;
    }
}
