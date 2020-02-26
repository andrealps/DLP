grammar Pmm;	

@header{
    import ast.*;
}

/** GRAMATICA **/

program returns [Program ast]:
    (vardef|funcdef)+
	;

vardef:
    ID (',' ID)* ':' primitiveType ';'
    | ID ':' 'struct' '{' (param ';')+ '}'';'
    | ID ':' ('[' INT_CONSTANT ']')+ primitiveType ';'
    ;

primitiveType:
    ('int' | 'char' | 'double')
    ;

funcdef:
    'def' ID  '(' params? ')' ':' primitiveType? '{' vardef* statement* '}'
    ;

params:
    param (',' param)*
    ;

param:
    ID ':' primitiveType
    ;

statement:
    function_invocation ';'
    | 'return' expr ';'
    | 'while' expr ':' '{' statement* '}'
    | 'if' expr ':' (statement|'{'statement*'}') 'else' (statement|'{'statement*'}')
    | 'print' expr (',' expr)* ';'
    | 'input' expr (',' expr)* ';'
    | expr '=' expr ';'
    ;

expr returns [Expresssion ast]:
    INT_CONSTANT  {$ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    | REAL_CONSTANT {$ast = new DoubleLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
    | CHAR_CONSTANT {$ast = new CharLiteral((LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
    | ID    {$ast = new Variable($ID.text);}
    | '(' expr ')'  {$ast = $expr.ast;}
    | expr '[' expr ']'  {$ast = ;}
    | expr '.' ID    {$ast = ;}
    | '(' primitiveType ')' expr    {$ast = new Cast;}
    | '-' expr
    | '!' expr
    | expr ('*'|'/'|'%') expr
    | expr ('+'|'-') expr
    | expr ('>'|'>='|'<'|'<='|'!='|'==') expr
    | expr ('&&'|'||') expr
    | function_invocation
    ;

function_invocation
    : ID '(' (expr (',' expr)*)? ')'
    ;


/** LÉXICO **/

WHITESPACE : [ \t\n\r]+ -> skip;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

INT_CONSTANT: '0' | [1-9] [0-9]*;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT+) (('e'|'E') ('+'|'-')? [0-9]+)?;


CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;


ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;





