package codeup.basic.logical;

import java.util.Scanner;

public class P1056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result = number1 ^ number2;
        System.out.println(result);

        scanner.close();
    }
}
