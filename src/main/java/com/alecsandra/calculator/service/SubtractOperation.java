package com.alecsandra.calculator.service;

import com.alecsandra.calculator.model.OperationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SubtractOperation implements Operation {
    private static final Logger logger = LoggerFactory.getLogger(SubtractOperation.class);

    @Override
    public OperationType getType() {
        return OperationType.SUBTRACT;
    }

    @Override
    public int execute(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        logger.info(String.format("%d %s %d = %d", firstNumber, getType().getOperator(), secondNumber, result));
        return result;
    }
}
