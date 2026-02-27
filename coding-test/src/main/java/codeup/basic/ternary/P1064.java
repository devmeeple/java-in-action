package codeup.basic.ternary;

import java.util.Scanner;

public class P1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int result = number1;

        if (number2 < result) {
            result = number2;
        }
        if (number3 < result) {
            result = number3;
        }

        System.out.println(result);
        scanner.close();
    }
}
