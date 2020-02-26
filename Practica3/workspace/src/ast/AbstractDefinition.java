package ast;

public class AbstractDefinition implements Definition {
    private Type type;
    private String name;

    public AbstractDefinition(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
