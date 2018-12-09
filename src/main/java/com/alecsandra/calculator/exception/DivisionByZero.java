package com.alecsandra.calculator.exception;

public class DivisionByZero extends Exception {
    public static final String MESSAGE = "Division by 0!";

    public DivisionByZero() {
        super(MESSAGE);
    }
}
