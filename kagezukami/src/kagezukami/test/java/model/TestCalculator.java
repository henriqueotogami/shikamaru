package kagezukami.test.java.model;

import jutsu.main.java.model.TemplateCalculator;

import java.util.ServiceLoader;

public class TestCalculator {

    public static void main(String[] args) {

        TemplateCalculator calculator = ServiceLoader.load(TemplateCalculator.class).findFirst().get();
        System.out.println(calculator.sum(2,3,4));


//        try {
//            final Field fieldId = Calculator.class.getDeclaredField("Id");
//            fieldId.setAccessible(true);
//            fieldId.set(calculator, "def");
//            fieldId.setAccessible(false);
//            System.out.println(calculator.getId());
//        } catch ( final Exception exception) {
//            exception.printStackTrace();
//        }
    }
}
