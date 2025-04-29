package org.example.visitors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.example.CodeException;
import org.example.ThrowingErrorListener;
import org.example.parser.KubolLexer;
import org.example.parser.KubolParser;
import org.example.parser.KubolParserBaseVisitor;
import java.util.HashMap;

public class MyVisitor extends KubolParserBaseVisitor<Object> {

    private final HashMap<String, Integer> memory;
    private final CalcVisitor calc;

    public MyVisitor() {
        this.memory = new HashMap<>();
        this.calc = new CalcVisitor(memory);
    }

    public void interpret(String input){
        var lexer = new KubolLexer(CharStreams.fromString(input));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        var tokens = new CommonTokenStream(lexer);
        var parser = new KubolParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        var tree = parser.script();
        this.visit(tree);
    }

    @Override
    public Object visitScript(KubolParser.ScriptContext ctx) {
        for (var statement : ctx.statement()) {
            this.visit(statement);
        }
        return null;
    }

    @Override
    public Object visitStatement(KubolParser.StatementContext ctx) {
        if(ctx.assignment() != null) return visit(ctx.assignment());
        if(ctx.conditionalStatement() != null) return visit(ctx.conditionalStatement());
        if(ctx.cycleStatement() != null) return visit(ctx.cycleStatement());
        if(ctx.printStatement() != null) return visit(ctx.printStatement());
        return null;
    }

    @Override
    public Object visitAssignment(KubolParser.AssignmentContext ctx) {
        Integer value = calc.visit(ctx.equation());
        saveVariable(ctx.variable(), value);

        return null;
    }

    @Override
    public Object visitConditionalStatement(KubolParser.ConditionalStatementContext ctx) {
        if((boolean) visit(ctx.condition())){
            for (var statement : ctx.statement()) {
                visit(statement);
            }
        }
        return null;
    }

    @Override
    public Object visitCycleStatement(KubolParser.CycleStatementContext ctx) {
        // Variable initialization
        var cycleCond = ctx.cycleCondition();
        var var1 = cycleCond.variable(0);
        var var2 = cycleCond.variable(1);
        var var3 = cycleCond.variable(2);
        var val1 = Integer.parseInt(cycleCond.value(0).getText());
        var val2 = Integer.parseInt(cycleCond.value(1).getText());
        var val3 = Integer.parseInt(cycleCond.value(2).getText());
        var iterOp = cycleCond.calcOperator().getText();

        saveVariable(var1, val1);
        // Syntax check
        if(!var1.getText().equals(var2.getText())) {
            throw new CodeException(var1, "Cycle condition must use the same variable in all parts.");
        }
        if(!var1.getText().equals(var3.getText())) {
            throw new CodeException(var2, "Cycle condition must use the same variable in all parts.");
        }

        // Loop execution
        while ((boolean) visit(cycleCond)) {
            for (var statement : ctx.statement()) {
                visit(statement);
            }

            // Variable incrementation
            int newIterVal = calc.applyOperator(getVariableValue(var2), val3, iterOp);
            saveVariable(var3, newIterVal);
        }

        return null;
    }

    @Override
    public Object visitPrintStatement(KubolParser.PrintStatementContext ctx) {
        if (ctx.equation() != null) {
            System.out.println(calc.visit(ctx.equation()));
        } else if (ctx.value() != null) {
            System.out.println(Integer.parseInt(ctx.value().getText()));
        } else if (ctx.variable() != null) {
            int value = getVariableValue(ctx.variable());
            System.out.println(value);
        } else {
            System.out.println();
        }
        return null;
    }

    @Override
    public Object visitCondition(KubolParser.ConditionContext ctx){
        int left = calc.visit(ctx.calcMember(0));
        int right = calc.visit(ctx.calcMember(1));

        return applyConditionOperator(left, right, ctx.comparisonOperator());
    }

    @Override
    public Object visitCycleCondition(KubolParser.CycleConditionContext ctx){
        int condVarVal = getVariableValue(ctx.variable(1));
        int condVal = Integer.parseInt(ctx.value(1).getText());

        return applyConditionOperator(condVarVal, condVal, ctx.comparisonOperator());
    }

    // Utils
    private boolean applyConditionOperator(int left, int right, ParserRuleContext ctx){
        return switch (ctx.getText()) {
            case "EQUAL" -> left == right;
            case "LESSER" -> left < right;
            case "GREATER" -> left > right;
            case "NONEQUAL" -> left != right;
            default -> throw new CodeException(ctx, "Unknown operator: " + ctx.getText());
        };
    }

    private void saveVariable(ParserRuleContext ctx, int value) {
        try {
            memory.put(ctx.getText(), value);
        } catch (Exception e) {
            throw new CodeException(ctx, e.getMessage());
        }
    }

    private int getVariableValue(ParserRuleContext ctx){
        try {
            return memory.get(ctx.getText()).intValue();
        } catch(Exception e){
            throw new CodeException(ctx, "Cannot find variable: " + ctx.getText());
        }
    }
}
