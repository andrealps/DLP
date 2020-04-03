package ast;

import java.util.List;

public interface Type extends ASTNode{
    boolean isLogical();
    Type arithmetic(Type type);
    Type arithmetic();
    Type comparison(Type type);
    Type logic(Type type);
    Type logic();
    Type promotesTo(Type type);
    Type canBeCastTo(Type type);
    Type squareBrackets(Type type);
    Type dot(String fieldName);
    Type parenthesis(List<Expression> expressions);
    Type checkReturnType(Type type);
    int getSize();
}
