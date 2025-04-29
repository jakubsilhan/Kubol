package org.example.visitors;

import org.example.parser.KubolParser;
import org.example.parser.KubolParserBaseVisitor;

import java.util.HashMap;

public class CalcVisitor extends KubolParserBaseVisitor<Integer> {
    private final HashMap<String, Integer> memory;

    public CalcVisitor(HashMap<String, Integer> memory) {
        this.memory = memory;
    }

    @Override
    public Integer visitEquation(KubolParser.EquationContext ctx) {
        if (ctx.equation() != null) {
            int left = visit(ctx.calcMember(0));
            int right = visit(ctx.equation());
            String operator = ctx.calcOperator().getText();
            return applyOperator(left, right, operator);

        } else if (ctx.calcMember().size() == 2) {
            int left = visit(ctx.calcMember(0));
            int right = visit(ctx.calcMember(1));
            String operator = ctx.calcOperator().getText();
            return applyOperator(left, right, operator);

        } else if (ctx.calcMember().size() == 1){
            return visit(ctx.calcMember(0));
        } else {
            return 0;
        }
    }

    @Override
    public Integer visitCalcMember(KubolParser.CalcMemberContext ctx) {
        if(ctx.value() != null){
            return Integer.parseInt(ctx.value().getText());
        } else if (ctx.variable() != null){
            String varName = ctx.variable().getText();
            return memory.getOrDefault(varName, 0);
        }
        return 0;
    }

    // Utils
    public int applyOperator(int left, int right, String operator){
        return switch (operator) {
            case "ADD" -> left + right;
            case "MULTIPLY" -> left * right;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }

}
