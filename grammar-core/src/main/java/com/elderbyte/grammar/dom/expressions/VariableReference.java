package com.elderbyte.grammar.dom.expressions;

/**
 * Represents a reference to a variable
 *
 */
public class VariableReference extends ExpressionNode {

    private final String name;

    public VariableReference(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VarRef(" + name + ")";
    }
}
