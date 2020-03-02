grammar Pmm;	

@header{
    import ast.*;
}

/** GRAMATICA **/

program returns [Program ast]:
    {List<Definition> defs = new ArrayList<Definition>();}
    definitions {defs.addAll($definitions.ast);}
    {$ast = new Program(0, 0, defs);}
	;

definitions returns [List<Definition> ast]:
    (vardef {$ast.addAll($vardef.ast);} | funcdef {$ast.add($funcdef.ast);})*
    ;

vardef returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    ids ':' primitiveType ';'
     { for (String id: $ids.ast)
           $ast.add(new VarDefinition(id.getLine(), id.getCharPositionInLine()+1, $primitiveType.ast, id));
     }

    | ID ':' type ';'  {$ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $type.ast, $ID.text));}
    ;

primitiveType returns [Type ast]:
     'int' {$ast = IntType.getInstance();}
     |'char' {$ast = CharType.getInstance();}
     |'double' {$ast = DoubleType.getInstance();}
    ;

type returns [Type ast]:
    primitiveType
    {$ast = $primitiveType.ast;}

    |pri='[' INT_CONSTANT ']' type
    {$ast = new Array($pri.getLine(), $pri.getCharPositionInLine()+1,
            LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast);
    }

    | 'struct' '{' listVariable '}'
    {List<RecordField> recordFields = new ArrayList<RecordField>();
      for (VarDefinition variable: $listVariable.ast)
          recordFields.add(new RecordField(variable.getName(), variable.getType()));
      $ast = new Record($ID.getLine(), $ID.getCharPositionInLine()+1, recordFields);
    }
    ;

funcdef returns [FuncDefinition ast]:
    'def' ID  '(' par=params? ')' ':' tipo=primitiveType? '{' cuerpoFunc '}'
    {}
    ;

params returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    id1=param {$ast.add($id1.ast)}  (',' idm=param {$ast.add($idm.ast)})*
    ;

listVariable returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    (param ';' {$ast.add($param.ast)})+
    ;

param returns [VarDefinition ast]:
    ID ':' primitiveType {$ast = new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $primitiveType, $ID.text)}
    ;

ids returns [List<String> ast = new ArrayList<String>()]:
    id1=ID {$ast.add($id1.text)} (',' idm=ID {$ast.add($idm.text)})*
    ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]:
    function_invocation ';'
    {$ast.add($function_invocation.ast);}

    | ret='return' expr ';'
    {$ast.add(new Return($ret.getLine(), $ret.getCharPositionInLine()+1, $expr.ast));}

    | whi='while' expr ':' cuerpoIter
    {$ast.add(new While($whi.getLine(), $whi.getCharPositionInLine()+1, $expr.ast, $cuerpoIter.ast));}

    | if='if' expr ':' ifC=cuerpoIter 'else' elseC=cuerpoIter
    {$ast.add(new IfElse($if.getLine(), $if.getCharPositionInLine()+1, $expr.ast, $ifC.ast, $elseC.ast));}

    | p='print' expressions ';'
    {for (Expression exp: $expressions.ast)
         $ast.add(new Print($p.getLine(), $p.getCharPositionInLine()+1, exp));
    }

    | p='input' expressions';'
    {for (Expression exp: $expressions.ast)
         $ast.add(new Input($p.getLine(), $p.getCharPositionInLine()+1, exp));
    }

    | ex1=expr '=' ex2=expr ';'
    {$ast.add(new Assigment($ex1.getLine(), $ex1.getCharPositionInLine()+1, $ex1.ast, $ex2.ast));}
    ;

cuerpoIter returns [List<Statement> ast = new ArrayList<Statement>()]:
    statement
    {$ast.add($statement.ast);}

    |'{'statements'}'
    {$ast.add($statements.ast);}
    ;

cuerpoFunc returns [List<Statement> ast = new ArrayList<Statement>()]:
    (vardef {$ast.add($vardef.ast);})* (statements {$ast.add($statements.ast);})*
    ;

statements returns [List<Statement> ast = new ArrayList<Statement>()]:
    (statement {$ast.add($statement.ast);})*
    ;

expr returns [Expresssion ast]:
    INT_CONSTANT
    {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1,
        LexerHelper.lexemeToInt($INT_CONSTANT.text));
    }

    | REAL_CONSTANT
    {$ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1,
        LexerHelper.lexemeToReal($REAL_CONSTANT.text));
    }

    | CHAR_CONSTANT
    {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1,
        LexerHelper.lexemeToChar($CHAR_CONSTANT.text));
    }

    | ID
    {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}

    | '(' expr ')'
    {$ast = $expr.ast;}

    | ex1=expr '[' ex2=expr ']'
    {$ast = new ArrayAcess($ex1.getLine(), $ex2.getCharPositionInLine()+1, $ex1.ast, $ex2.ast);}

    | expr '.' ID
    {$ast = new RecordAcess($expr.getLine(), $expr.getCharPositionInLine()+1, $expr.ast, $ID.text);}

    | pri='(' primitiveType ')' expr
    {$ast = new Cast($pri.getLine(), $pri.getCharPositionInLine()+1, $primitiveType.ast, $expr.ast);}

    | pri='-' expr
    {$ast = new UnaryMinus($pri.getLine(), $pri.getCharPositionInLine()+1, $expr.ast);}

    | pri='!' expr
    {$ast = new Negation($pri.getLine(), $pri.getCharPositionInLine()+1, $primitiveType.ast, $expr.ast);}

    | exp1=expr op=('*'|'/'|'%') exp2=expr
    {$ast = new Arithmetic($exp1.getLine(), $exp1.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | exp1=expr op=('+'|'-') exp2=expr
    {$ast = new Arithmetic($exp1.getLine(), $exp1.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | exp1=expr op=('>'|'>='|'<'|'<='|'!='|'==') exp2=expr
    {$ast = new Comparison($exp1.getLine(), $exp1.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | exp1=expr ('&&'|'||') exp2=expr
    {$ast = new Logical($exp1.getLine(), $exp1.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | function_invocation
    {$ast = $function_invocation.ast;}
    ;

function_invocation returns [FunctionInvocation ast] :
    ID '(' expressions? ')'
    {List<Expression> expresiones = new ArrayList<Expressions>();
     expresiones.addAll($expressions.ast);
     $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, expresiones,
            new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text));}
    ;

expressions returns [List<Expression> ast = new ArrayList<Expression>()]:
    ex1=expr {$ast.add($ex1.ast)} (',' exm=expr {$ast.add($exm.ast);})*
    ;


/** LÉXICO **/

WHITESPACE : [ \t\n\r]+ -> skip;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

INT_CONSTANT: '0' | [1-9] [0-9]*;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT+) (('e'|'E') ('+'|'-')? [0-9]+)?;


CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;


ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;





