package ast;

public class RecordField {
    private String name;
    private Type type;

    public RecordField(String name, Type type) {
        this.name = name;
        this.type = type;
    }
}
