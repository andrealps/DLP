grammar Pmm;	

@header{
    import ast.*;
}

/** GRAMATICA **/

program returns [Program ast]:
    (vardef|funcdef)*
	;

vardef returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    ids ':' primitiveType ';'
     { for (String id: $ids.ast)
           $ast.add(new VarDefinition(id.getLine(), id.getCharPositionInLine()+1, $primitiveType.ast, id));
     }

    | ID ':' type ';'  {$ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $type.ast, $ID.text))}
    ;

primitiveType returns [Type ast]:
     'int' {$ast = IntType.getInstance();}
     |'char' {$ast = CharType.getInstance();}
     |'double' {$ast = DoubleType.getInstance();}
    ;

type returns [Type ast]:
    primitiveType   {$ast = $primitiveType.ast;}
    |pri='[' INT_CONSTANT ']' type
    {$ast = new Array($pri.getLine(), $pri.getCharPositionInLine()+1,
            LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast);
    }

    | 'struct' '{' listVariable '}'
    { List<RecordField> recordFields = new ArrayList<RecordField>();
      for (VarDefinition variable: $listVariable.ast)
          recordFields.add(new RecordField(variable.getName(), variable.getType()));
      $ast = new Record($ID.getLine(), $ID.getCharPositionInLine()+1, recordFields);
    }
    ;

funcdef returns [FuncDefinition ast]:
    'def' ID  '(' params? ')' ':' primitiveType? '{' vardef* statement* '}'
    ;

params returns [List<String> ast = new ArrayList<String()]:
    id1=param {$ast.add($id1.ast)}  (',' idm=param {$ast.add($idm.ast)})*
    ;

listVariable returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    (param ';' {$ast.add($param.ast)})+
    ;

param returns [VarDefinition ast]:
    ID ':' primitiveType {$ast = new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, primitiveType, $ID.text)}
    ;


ids returns [List<String> ast = new ArrayList<String>()]:
    id1=ID {$ast.add($id1.text)} (',' idm=ID {$ast.add($idm.text)})*
    ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]:
    function_invocation ';'
    | 'return' expr ';'
    | 'while' expr ':' '{' statement* '}'
    | 'if' expr ':' (statement|'{'statement*'}') 'else' (statement|'{'statement*'}')
    | p='print' expressions ';'  {for(Expression exp: $expressions.ast)
                                  $ast.add(new Print($p.getLine(), $p.getCharPositionInLine()+1, exp);}
    | 'input' expressions';'     {for(Expression exp: $expressions.ast)
                                  $ast.add(new Input($p.getLine(), $p.getCharPositionInLine()+1, exp);}
    | expr '=' expr ';'
    ;

expr returns [Expresssion ast]:
    INT_CONSTANT  {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1,
                    LexerHelper.lexemeToInt($INT_CONSTANT.text));}
    | REAL_CONSTANT {$ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1,
                                        LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
    | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1,
                                                            LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
    | ID    {$ast = new Variable($ID.text);}
    | '(' expr ')'  {$ast = $expr.ast;}
    | expr '[' expr ']'  {$ast = new ArrayAcess();}
    | expr '.' ID    {$ast = new ArrayAcess($ID.text, $expr.ast);}
    | '(' primitiveType ')' expr    {$ast = new Cast($primitiveType.ast, $expr.ast);}
    | '-' expr  {$ast = new UnaryMinus($expr.ast);}
    | '!' expr  {$ast = new Cast($primitiveType.ast, $expr.ast);}
    | op1=expr ('*'|'/'|'%') op2=expr   {$ast = $op1.ast}
    | exp1=expr ('+'|'-') exp2=expr   {$ast = new Arithmetic($exp1.ast, $exp2.ast);}
    | exp1=expr ('>'|'>='|'<'|'<='|'!='|'==') exp2=expr   {$ast = new Comparison($exp1.ast, $exp2.ast);}
    | exp1=expr ('&&'|'||') exp2=expr {$ast = new Logical($exp1.ast, $exp2.ast);}
    | function_invocation   {$ast = $function_invocation}
    ;

expressions: expr (',' expr)*;

function_invocation returns [FunctionInvocation ast] :
    ID '(' (expr (',' expr)*)? ')'
    ;


/** LÉXICO **/

WHITESPACE : [ \t\n\r]+ -> skip;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

INT_CONSTANT: '0' | [1-9] [0-9]*;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT+) (('e'|'E') ('+'|'-')? [0-9]+)?;


CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;


ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;





