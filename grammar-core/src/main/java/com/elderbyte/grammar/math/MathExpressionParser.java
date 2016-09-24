package com.elderbyte.grammar.math;

import com.elderbyte.grammar.ExpressionParser;
import com.elderbyte.grammar.dom.expressions.Arity;
import com.elderbyte.grammar.dom.expressions.Operator;
import com.elderbyte.grammar.scanner.OperatorSet;
import com.elderbyte.grammar.scanner.Token;
import com.elderbyte.grammar.scanner.TokenType;

import java.util.ArrayList;
import java.util.List;

/**
 * A basic math expression parser
 */
public class MathExpressionParser extends ExpressionParser {

    public MathExpressionParser(){
        super(new OperatorSet(
                new Operator("+", 2, true, Arity.Binary),
                new Operator("-", 2, true, Arity.Binary),
                new Operator("*", 3, true, Arity.Binary),
                new Operator("/", 3, true, Arity.Binary),
                new Operator("^", 4, false, Arity.Binary),
                new Operator("%", 4, false, Arity.Binary)
                ),
                new Token(TokenType.Whitespace, " "),
                new Token(TokenType.Whitespace, "\t"),
                new Token(TokenType.Parentheses_Open, "("),
                new Token(TokenType.Parentheses_Closed, ")")
        );
    }
}
