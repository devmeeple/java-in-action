package playground.calculator;

public class GugudanCalculator {
    public static String[][] calculate(int dan) {
        String[][] result = new String[dan - 1][dan];

        for (int i = 2; i <= dan; i++) {
            for (int j = 1; j <= dan; j++) {
                result[i - 2][j - 1] = i + " X " + j + " = " + (i * j);
            }
        }

        return result;
    }
}
