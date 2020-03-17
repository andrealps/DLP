package ast;

import visitor.Visitor;

public interface ASTNode {
    int getLine();
    int getColumn();

    Object accept(Visitor v, Object p);
}
