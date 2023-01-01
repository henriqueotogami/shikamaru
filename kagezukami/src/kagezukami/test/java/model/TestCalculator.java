package kagezukami.test.java.model;


import kagemane.main.java.model.external.Calculator;
import kagemane.main.java.model.internal.ArithmeticOperations;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,3,4));

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        System.out.println(arithmeticOperations.sum(3,3,3));
    }
}
