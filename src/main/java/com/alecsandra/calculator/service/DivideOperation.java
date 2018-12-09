package com.alecsandra.calculator.service;

import com.alecsandra.calculator.exception.DivisionByZero;
import com.alecsandra.calculator.model.OperationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DivideOperation implements Operation {
    private static final Logger logger = LoggerFactory.getLogger(DivideOperation.class);

    @Override
    public OperationType getType() {
        return OperationType.DIVIDE;
    }

    @Override
    public int execute(int firstNumber, int secondNumber) throws DivisionByZero {
        if (secondNumber == 0) throw new DivisionByZero();
        int result = firstNumber / secondNumber;
        logger.info(String.format("%d %s %d = %d", firstNumber, getType().getOperator(), secondNumber, result));
        return result;
    }
}
