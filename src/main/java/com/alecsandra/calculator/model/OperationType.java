package com.alecsandra.calculator.model;

public enum OperationType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String operator;

    OperationType(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}

