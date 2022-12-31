package main.java.model.internal;

import java.util.Arrays;

public class ArithmeticOperations {

    public double sum(final double... numbers) {
        final double initialValue = 0.0;
        return Arrays.stream(numbers).reduce(initialValue, (totalValue, actualValue) -> (totalValue + actualValue));
    }
}
