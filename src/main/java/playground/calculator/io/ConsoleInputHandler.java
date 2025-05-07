package playground.calculator.io;

import java.util.Scanner;

public class ConsoleInputHandler {
    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 구구단 범위를 입력하세요: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
