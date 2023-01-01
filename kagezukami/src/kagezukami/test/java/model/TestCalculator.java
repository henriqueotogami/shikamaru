package kagezukami.test.java.model;


import kagemane.main.java.model.external.Calculator;
import kagemane.main.java.model.internal.ArithmeticOperations;

import java.lang.reflect.Field;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,3,4));

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        System.out.println(arithmeticOperations.sum(3,3,3));

        try {
            final Field fieldId = Calculator.class.getDeclaredField("Id");
            fieldId.setAccessible(true);
            fieldId.set(calculator, "def");
            fieldId.setAccessible(false);
            System.out.println(calculator.getId());
        } catch ( final Exception exception) {
            exception.printStackTrace();
        }
    }
}
