package com.alecsandra.calculator.exception;

public class InvalidOperation extends Exception {
    private static String OPERATION = "#operation#";
    private static String MESSAGE = "Invalid operation : " + OPERATION ;

    public InvalidOperation(String operation) {
        super(MESSAGE.replaceAll(OPERATION, operation));
    }
}
