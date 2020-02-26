package ast;

import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> definitions;

    public Program(int line, String column) {
        super(line, column);
    }
}
