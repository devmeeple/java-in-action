package playground.calculator;

import playground.calculator.io.ConsoleInputHandler;
import playground.calculator.io.InputParser;
import playground.calculator.io.OutputHandler;

public class GugudanCalculatorApplication {
    public static void main(String[] args) {
        String input = ConsoleInputHandler.readLine();
        int[] range = InputParser.parseRange(input);

        int danLimit = range[0];
        int mulLimit = range[1];

        String[][] result = GugudanCalculator.calculate(danLimit, mulLimit);

        OutputHandler.print(result);
    }
}
