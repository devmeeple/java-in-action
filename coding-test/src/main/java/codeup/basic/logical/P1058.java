package codeup.basic.logical;

import java.util.Scanner;

public class P1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result = (number1 == 0 && number2 == 0) ? 1 : 0;
        System.out.println(result);

        scanner.close();
    }
}
