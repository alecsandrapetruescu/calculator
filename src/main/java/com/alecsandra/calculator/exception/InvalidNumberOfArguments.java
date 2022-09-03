package com.alecsandra.calculator.exception;

public class InvalidNumberOfArguments extends Exception {
    private static final String NR_OF_ARGUMENTS = "#numberOfArguments#";
    private static String message = "Invalid number of arguments : " + NR_OF_ARGUMENTS + ", minimum 3 arguments";
    public InvalidNumberOfArguments(int numberOfArguments) {
        super(message.replaceAll(NR_OF_ARGUMENTS, String.valueOf(numberOfArguments)));
    }
}
