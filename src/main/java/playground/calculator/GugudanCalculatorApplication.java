package playground.calculator;

public class GugudanCalculatorApplication {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = GugudanCalculator.calculate(i);
            GugudanCalculator.print(result);
        }
    }
}
