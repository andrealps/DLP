package codegenerator;

import ast.*;

/**
 * Sentencias
 */
public class ExecuteCGVisitor extends AbstractCGVisitor {
    private CodeGenerator cG;
    private ValueCGVisitor valueCGVisitor;
    private AddressCGVisitor addressCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cG) {
        this.cG = cG;
        this.valueCGVisitor = new ValueCGVisitor(cG);
        this.addressCGVisitor = new AddressCGVisitor(cG, valueCGVisitor);
    }

    @Override
    public Object visit(Program program, Object param) {
        cG.println();

        for (Definition d : program.getDefinitions())
            if (d instanceof VarDefinition)
                d.accept(this, param);

        cG.println();
        cG.comment("Invocation to the main function");
        cG.call("main");
        cG.halt();
        cG.println();
        cG.println();

        for (Definition d : program.getDefinitions())
            if (d instanceof FuncDefinition) {
                d.accept(this, param);
            }

        return null;

        /*  execute[[Program: program -> definition*]]() =
        	for(Definition d: definition*)
        		if (d instanceof VarDefinition)
        			execute[[d]]()

        	<call main>
        	<halt>

        	for(Definition d: definition*)
        		if (!(d instanceof FuncDefinition))
        			execute[[d]]()
        */
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        cG.commentVariable(varDefinition);
        return null;

        /* execute[[VarDefinition: statement -> ID ':' primitiveType]]() =
         ' * primitiveType.getClass() ID (offset)
        */
    }

    @Override
    public Object visit(Assigment assigment, Object param) {
        cG.println();
        cG.commentLine("Assigment");
        assigment.getExpression1().accept(addressCGVisitor, param);
        assigment.getExpression2().accept(valueCGVisitor, param);
        cG.store(assigment.getExpression1().getType());
        return null;

        /* execute[[Assigment: statement -> lex1=expr '=' ex2=expr ';']]() =
         address[[left]]
         value[[right]]
         <store> left.type.suffix()
        */
    }

    @Override
    public Object visit(Input input, Object param) {
        cG.println();
        cG.commentLine("Input");
        input.getExpression().accept(addressCGVisitor, param);
        cG.in(input.getExpression().getType());
        cG.store(input.getExpression().getType());
        return null;

        /* execute[[Input: statement -> expression]]() =
         address[[expression]]
         <in> expression.type.suffix()
         <store> expression.type.suffix()
         */
    }

    @Override
    public Object visit(Print print, Object param) {
        cG.println();
        cG.commentLine("Write");
        print.getExpression().accept(valueCGVisitor, param);
        cG.out(print.getExpression().getType());
        return null;

        /* execute[[Print: statement -> expression]]() =
         value[[expression]]
         <out> expression.type.suffix()
         */
    }

    @Override
    public Object visit(Return returnP, Object param) {
        returnP.getExpression().accept(valueCGVisitor, param);

        FuncDefinition funcDefinition = (FuncDefinition) param;
        FunctionType functionType = (FunctionType) funcDefinition.getType();

        int tamRetorno = returnP.getExpression().getType().numberOfBytes();
        int tamLocales = funcDefinition.getBytesLocal();
        int tamParam = functionType.getBytesParam();
        cG.ret(tamRetorno, tamLocales, tamParam);
        return null;

        /* execute[[Return: statement -> expression]]() =
         value[[expression]]
         tamRetorno = expression.getType().numberOfBytes()
         locales = funcDef.getBytesLocal()
         parametros = funcDef.getBytesParam()
         <ret> (tamRetorno, locales, parametros)
        */
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        cG.printName(funcDefinition.getName());

        FunctionType functionType = (FunctionType) funcDefinition.getType();

        cG.commentLine("Parameters");
        for (VarDefinition d : functionType.getVarDefinitions()) {
            d.accept(this, param);
        }

        cG.commentLine("Local variables");

        boolean localesVisitadas = false;
        for (Statement st : funcDefinition.getStatements()) {
            if (st instanceof VarDefinition == false && !localesVisitadas){
                localesVisitadas = true;
                cG.enter(funcDefinition.getBytesLocal());
            }
            st.accept(this, funcDefinition);    // para return
        }

        if (functionType.getReturnType().equals(VoidType.getInstance()))
            cG.ret(0, funcDefinition.getBytesLocal(), functionType.getBytesParam());

        return null;

        /* execute[[FuncDefinition: statement -> pri='def' nombre='main'  '(' ')'  ':' '{' cuerpoFunc '}']]() =
         funcDefinition.getName() <:>

         ' * Parámetros
         FunctionType functionType = (FunctionType) funcDefinition.getType();
         for (VarDefinition d: functionType.getVarDefinitions())
            execute[[d]]()

         ' * Variables locales
         for (VarDefinition d: functionType.getVarDefinitions())
             execute[[d]]()

         <enter> funcDefinition.getBytesLocal()
         for(Statement st: funcDefinition.getStatements())
            execute[[st]]
         if (funcDefinition.getType().returnType.getClass() == VoidType.getClass())
             <ret> (0, functionType.getBytesLocal(), functionType.getBytesParam())
         */
    }

    // Object visit (While whileP, Object param);
    // Object visit (IfElse ifElse, Object param);
    // Object visit (FunctionInvocation functionInvocation, Object param);
}
