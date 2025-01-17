grammar Pmm;	

@header{
    import ast.*;
    import errorhandler.*;
}

/** GRAMATICA **/

program returns [Program ast]:
    {List<Definition> defs = new ArrayList<Definition>();}
    (vardef {defs.addAll($vardef.ast);} | funcdef {defs.add($funcdef.ast);})* main EOF {defs.add($main.ast);}
    {$ast = new Program(0, 0, defs);}
	;

main returns [FuncDefinition ast]:
   pri='def' nombre='main'  '(' ')'  ':' '{' cuerpoFunc '}'
   {$ast = new FuncDefinition($pri.getLine(), $pri.getCharPositionInLine()+1,
        new FunctionType($nombre.getLine(), $nombre.getCharPositionInLine()+1, new ArrayList<VarDefinition>(), VoidType.getInstance())
        , "main", $cuerpoFunc.ast);}
     ;

vardef returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    idm=ids ':' type ';'
     { for (String id: $ids.ast){
           VarDefinition var = new VarDefinition($idm.start.getLine(), $idm.start.getCharPositionInLine()+1, $type.ast, id);
           if ($ast.contains(var)){
                new ErrorType($idm.start.getLine(), $idm.start.getCharPositionInLine()+1,
                    "Error, la variable " + var.getName() + " ya está definida");
           }
           else {
                $ast.add(var);
           }
       }
     }

    | list=listVariable
    {   for (VarDefinition variable: $listVariable.ast){
            if ($ast.contains(variable)){
                new ErrorType($list.start.getLine(), $list.start.getCharPositionInLine()+1,
                    "Error, la variable " + variable.getName() + " ya está definida");
            }
            else {
                $ast.add(variable);
            }
        }
    }
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

    | pri='struct' '{' fields=vardef '}'
    {List<RecordField> recordFields = new ArrayList<RecordField>();
      for (VarDefinition variable: $fields.ast){
          RecordField record = new RecordField($fields.start.getLine(), $fields.start.getCharPositionInLine()+1, variable.getName(), variable.getType());
          if (recordFields.contains(record)){
              new ErrorType($fields.start.getLine(), $fields.start.getCharPositionInLine()+1,
                                 "Error, la variable " + variable.getName() + " ya está definida");
          }
          else{
              recordFields.add(record);
          }
       }
      $ast = new Record($pri.getLine(), $pri.getCharPositionInLine()+1, recordFields);
    }
    ;

funcdef returns [FuncDefinition ast]:
    {Type returnType = VoidType.getInstance();}
    pri='def' ID  par=params  ':' (primitiveType {returnType = $primitiveType.ast;})? '{' cuerpoFunc '}'
    {$ast = new FuncDefinition($pri.getLine(), $pri.getCharPositionInLine()+1,
         new FunctionType($par.start.getLine(), $par.start.getCharPositionInLine()+1, $par.ast, returnType)
         , $ID.text, $cuerpoFunc.ast);}
    ;


listVariable returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    (ID ':' type ';' {$ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $type.ast, $ID.text));})+
    ;

params returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    '('')'
    |'(' id1=param {$ast.add($id1.ast);}  (',' idm=param {$ast.add($idm.ast);})* ')'
    ;


param returns [VarDefinition ast]:
    ID ':' primitiveType {$ast = new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $primitiveType.ast, $ID.text);}
    ;

ids returns [List<String> ast = new ArrayList<String>()]:
    id1=ID {$ast.add($id1.text);} (',' idm=ID {$ast.add($idm.text);})*
    ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]:
    function_invocation ';'
    {$ast.add($function_invocation.ast);}

    | ret='return' expr ';'
    {$ast.add(new Return($ret.getLine(), $ret.getCharPositionInLine()+1, $expr.ast));}

    | whi='while' expr ':' cuerpoIter
    {$ast.add(new While($whi.getLine(), $whi.getCharPositionInLine()+1, $expr.ast, $cuerpoIter.ast));}

    | {List<Statement> elseC = new ArrayList<Statement>();}
     ifp='if' expr ':' ifC=cuerpoIter ('else' cuerpoIter {elseC = $cuerpoIter.ast;})?
     {$ast.add(new IfElse($ifp.getLine(), $ifp.getCharPositionInLine()+1, $expr.ast, $ifC.ast, elseC));}

    | p='print' expressions ';'
    {for (Expression exp: $expressions.ast)
         $ast.add(new Print($p.getLine(), $p.getCharPositionInLine()+1, exp));
    }

    | p='input' expressions';'
    {for (Expression exp: $expressions.ast)
         $ast.add(new Input($p.getLine(), $p.getCharPositionInLine()+1, exp));
    }

    | ex1=expr '=' ex2=expr ';'
    {$ast.add(new Assigment($ex1.start.getLine(), $ex1.start.getCharPositionInLine()+1, $ex1.ast, $ex2.ast));}
    ;

cuerpoIter returns [List<Statement> ast = new ArrayList<Statement>()]:
    statement
    {$ast.addAll($statement.ast);}

    |'{' (statements {$ast.addAll($statements.ast);})*? '}'
    ;

cuerpoFunc returns [List<Statement> ast = new ArrayList<Statement>()]:
     (vardef {$ast.addAll($vardef.ast);})*  (statements {$ast.addAll($statements.ast);})*
    ;

statements returns [List<Statement> ast = new ArrayList<Statement>()]:
    (statement {$ast.addAll($statement.ast);})+
    ;

expr returns [Expression ast]:
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
    {$ast = new ArrayAccess($ex1.start.getLine(), $ex2.start.getCharPositionInLine()+1, $ex1.ast, $ex2.ast);}

    | ex1=expr '.' ID
    {$ast = new RecordAccess($ex1.start.getLine(), $ex1.start.getCharPositionInLine()+1, $ex1.ast, $ID.text);}

    | pri='(' primitiveType ')' expr
    {$ast = new Cast($pri.getLine(), $pri.getCharPositionInLine()+1, $primitiveType.ast, $expr.ast);}

    | pri='-' expr
    {$ast = new UnaryMinus($pri.getLine(), $pri.getCharPositionInLine()+1, $expr.ast);}

    | pri='!' expr
    {$ast = new Negation($pri.getLine(), $pri.getCharPositionInLine()+1, $expr.ast);}

    | exp1=expr op=('*'|'/'|'%') exp2=expr
    {$ast = new Arithmetic($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | exp1=expr op=('+'|'-') exp2=expr
    {$ast = new Arithmetic($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | exp1=expr op=('>'|'>='|'<'|'<='|'!='|'==') exp2=expr
    {$ast = new Comparison($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | exp1=expr op=('&&'|'||') exp2=expr
    {$ast = new Logical($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1, $exp1.ast, $exp2.ast, $op.text);}

    | function_invocation
    {$ast = $function_invocation.ast;}
    ;

function_invocation returns [FunctionInvocation ast] :
    {List<Expression> expresiones = new ArrayList<Expression>();}
    ID '(' (expressions {expresiones = $expressions.ast;})? ')'
    {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, expresiones,
            new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text));}
    ;

expressions returns [List<Expression> ast = new ArrayList<Expression>()]:
    ex1=expr {$ast.add($ex1.ast);} (',' exm=expr {$ast.add($exm.ast);})*
    ;


/** LÉXICO **/

WHITESPACE : [ \t\n\r]+ -> skip;

COMMENT: ('#' .*? ('\n'|EOF) | '"""' .*? '"""') -> skip;

INT_CONSTANT: '0' | [1-9] [0-9]*;

REAL_CONSTANT: INT_CONSTANT ('e'|'E') ('+'|'-')? [0-9]+
                | (INT_CONSTANT '.' INT_CONSTANT* | '.' INT_CONSTANT+) (('e'|'E') ('+'|'-')? [0-9]+)?;


CHAR_CONSTANT: '\'' (. | '\\' ('n' | 't' | [0-9]+) ) '\'' ;


ID: ('_' [a-zA-Z0-9_] | [a-zA-Z]) [a-zA-Z0-9_]*;