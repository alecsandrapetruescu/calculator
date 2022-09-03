package com.alecsandra.calculator;

import com.alecsandra.calculator.exception.InvalidNumberOfArguments;
import com.alecsandra.calculator.exception.InvalidOperation;
import com.alecsandra.calculator.service.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private List<Operation> operations;

    private Map<String, Operation> operationMap;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length < 3) throw new InvalidNumberOfArguments(args.length);
        int firstNumber = getNumber(args[0]);
        String operation = args[1];
        int secondNumber = getNumber(args[2]);

        boolean isValidOperation = operationMap.containsKey(operation);
        if (!isValidOperation) throw new InvalidOperation(operation);

        Operation op = operationMap.get(operation);
        op.execute(firstNumber, secondNumber);
    }

    @PostConstruct
    private void buildOperationMap() {
        operationMap = operations.stream().collect(Collectors.toMap(k -> k.getType().getOperator(), v -> v));
    }

    private int getNumber(String number) {
        int convertNumber;
        try {
            convertNumber = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            convertNumber = 0;
        }
        return convertNumber;
    }
}
