package test.java.model;

import main.java.model.external.Calculator;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,3,4));

    }
}
