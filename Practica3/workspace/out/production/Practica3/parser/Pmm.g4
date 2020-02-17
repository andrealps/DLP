grammar Pmm;	

program: CHAR_CONSTANT
       ;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT*) (('e'|'E') ('+'|'-')? [0-9]+)?;

ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;

CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;

INT_CONSTANT: '0' | [1-9] [0-9]*;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

WHITESPACE : [ \t\n\r]+ -> skip;

