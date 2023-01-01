package kagemane.main.java.model.external;

//import kagebunshin.main.java.model.external.Logger;
import kagemane.main.java.model.internal.ArithmeticOperations;

public class Calculator {

    private String Id = "abc";

    private ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    public double sum(final double... numbers) {
//        Logger.info("Adding........");
        return arithmeticOperations.sum(numbers);
    }

    public String getId() { return Id; }
}
