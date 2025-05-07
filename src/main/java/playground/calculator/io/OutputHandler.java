package playground.calculator.io;

public class OutputHandler {
    public static void print(String[][] gugudan) {
        for (String[] row : gugudan) {
            for (String line : row) {
                System.out.println(line);
            }
            System.out.println();
        }
    }
}
