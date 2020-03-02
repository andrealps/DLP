grammar Pmm;	

/** GRAMATICA **/

program: (vardef|funcdef)*;

vardef: ID (',' ID)* ':' primitiveType ';'
        | ID ':' 'struct' '{' (param ';') + '}' ';'
        | ID ':' ('[' INT_CONSTANT ']' )+ primitiveType ';';

primitiveType: ('int'|'double'|'char');

funcdef: 'def' ID '(' params? ')' ':' primitiveType? '{' vardef* statement* '}' ;

params: param (',' param)*;

param: ID ':' primitiveType;

statement: function_invocation ';'
        |'return' expresion ';'
        |'while' expresion ':' '{' statement* '}'
        |'if' expresion ':' (statement | '{' statement* '}') ('else' (statement |'{' statement* '}'))?
        |'print' expresion (','expresion)* ';'
        |'input' expresion (','expresion)* ';'
        |expresion '=' expresion ';'
;

expresion:  REAL_CONSTANT
            |INT_CONSTANT
            |CHAR_CONSTANT
            | ID
            |'(' expresion ')'
            |expresion '[' expresion ']'
            |expresion '.' ID
            |'(' primitiveType ')' expresion
            |'-' expresion
            |'!' expresion
            |expresion ('*'|'/'|'%') expresion
            |expresion ('+'|'-') expresion
            |expresion ('>'|'>='|'<'|'<='|'!='|'==') expresion
            |expresion ('&&'|'||') expresion
            |function_invocation
;

function_invocation: ID '(' (expresion (',' expresion)* )? ')';

/** LÉXICO **/

WHITESPACE : [ \t\n\r]+ -> skip;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

INT_CONSTANT: '0' | [1-9] [0-9]*;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT+) (('e'|'E') ('+'|'-')? [0-9]+)?;


CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;


ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;





