package com.alecsandra.calculator.service;

import com.alecsandra.calculator.exception.DivisionByZero;
import com.alecsandra.calculator.model.OperationType;

public interface Operation {
    OperationType getType();
    int execute(int firstNumber, int secondNumber) throws DivisionByZero;
}
