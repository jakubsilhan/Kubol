package org.example;

import org.antlr.v4.runtime.ParserRuleContext;

public class CodeException extends RuntimeException {
    public CodeException(ParserRuleContext ctx, String message) {
        super("line " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + " " + message);
    }
}
