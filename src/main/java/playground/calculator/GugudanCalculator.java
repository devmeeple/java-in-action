package playground.calculator;

public class GugudanCalculator {
    public static String[][] calculate(int danLimit, int mulLimit) {
        String[][] result = new String[danLimit - 1][mulLimit];

        for (int i = 2; i <= danLimit; i++) {
            for (int j = 1; j <= mulLimit; j++) {
                result[i - 2][j - 1] = i + " X " + j + " = " + (i * j);
            }
        }

        return result;
    }
}
