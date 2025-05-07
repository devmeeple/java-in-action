package playground.calculator;

import playground.calculator.io.ConsoleInputHandler;
import playground.calculator.io.OutputHandler;

public class GugudanCalculatorApplication {
    public static void main(String[] args) {
        int dan = ConsoleInputHandler.getInput();
        String[][] result = GugudanCalculator.calculate(dan);

        OutputHandler.print(result);
    }
}
