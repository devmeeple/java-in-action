package playground.calculator;

public class GugudanCalculatorApplication {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            int[] result = new int[9];

            for (int i = 0; i < result.length; i++) {
                result[i] = dan * (i + 1);
            }

            System.out.println("=== " + dan + "단 ===");
            for (int i = 0; i < result.length; i++) {
                System.out.println(dan + " X " + (i + 1) + " = " + result[i]);
            }
            System.out.println();
        }
    }
}
