package playground.calculator.io;

import java.util.Scanner;

public class ConsoleInputHandler {
    public static int[] getInputRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 구구단 범위를 입력하세요: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] tokens = input.split(",");
        if (tokens.length != 2) {
            throw new IllegalArgumentException("입력 형식이 잘못되었습니다. 예: 8,7");
        }

        int danLimit = Integer.parseInt(tokens[0].trim());
        int mulLimit = Integer.parseInt(tokens[1].trim());

        return new int[] { danLimit, mulLimit};
    }
}
