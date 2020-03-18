// Generated from D:/UNIVERSIDAD/Tercer curso/DLP/Laboratorio/DLP/workspace/src/parser\Pmm.g4 by ANTLR 4.8
package parser;

    import ast.*;
    import errorhandler.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(PmmParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PmmParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PmmParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListVariable(PmmParser.ListVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PmmParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PmmParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(PmmParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#cuerpoIter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoIter(PmmParser.CuerpoIterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#cuerpoFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoFunc(PmmParser.CuerpoFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PmmParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PmmParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invocation(PmmParser.Function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PmmParser.ExpressionsContext ctx);
}