grammar Pmm;	

/** GRAMATICA **/

program: ;

expresion: '(' expresion ')'
            |expresion '[' expresion ']'
            |expresion '.' expresion
            |'(' tipo ')' expresion
            |'-' expresion
            |'!' expresion
            |('*'|'/'|'%') expresion
            |expresion ('+'|'-') expresion
            |expresion ('>'|'>='|'<'|'<='|'!='|'==') expresion
            |expresion ('&&'|'||') expresion
            |expresion '=' expresion
            |ID
            |REAL_CONSTANT
            |INT_CONSTANT
            |CHAR_CONSTANT;

cast: '(' tipo ')';

tipo: ('int'|'double'|'char');

function_invocation: expresion |statement;

statement: ;

if_else: 'if' expresion ;

/**
def_variable: ID (',' ID)* ':' ('int'|'double'|'char');

def_funcion: 'def' ID '(' ()* ')' ':' '{' ;
**/


/**
También se puede poner:
expressions: expressions expressions | ;
 **/

/** LÉXICO **/

WHITESPACE : [ \t\n\r]+ -> skip;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

INT_CONSTANT: '0' | [1-9] [0-9]*;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT+) (('e'|'E') ('+'|'-')? [0-9]+)?;


CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;


ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;





