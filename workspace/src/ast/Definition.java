package ast;

import visitor.Visitor;

public interface Definition extends ASTNode {
    Type getType();
    String getName();
    int getScope();
    void setScope(int scope);
}
