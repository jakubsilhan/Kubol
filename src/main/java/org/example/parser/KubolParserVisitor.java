package org.example.parser;// Generated from C:/Users/kubix/source/repos/PRK/Language_Kubol/src/main/antlr4/KubolParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KubolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KubolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KubolParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(KubolParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KubolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(KubolParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(KubolParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#calcOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcOperator(KubolParser.CalcOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#calcMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcMember(KubolParser.CalcMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(KubolParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(KubolParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(KubolParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#cycleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleStatement(KubolParser.CycleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#cycleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleCondition(KubolParser.CycleConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(KubolParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(KubolParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubolParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(KubolParser.ValueContext ctx);
}