package kagemane.main.java.model.external;

import kagemane.main.java.model.internal.ArithmeticOperations;

public class Calculator {

    private ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    public double sum(final double... numbers) {
        return arithmeticOperations.sum(numbers);
    }
}
