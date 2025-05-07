package playground.calculator.io;

import java.util.Scanner;

public class ConsoleInputHandler {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 구구단을 입력하세요: ");
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }
}
