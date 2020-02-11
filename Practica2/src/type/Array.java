package type;

import java.util.List;

public class Array implements Type{
    private List<Type> elements;

    public Array(List<Type> elements) {
        this.elements = elements;
    }
}
