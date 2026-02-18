package codeup.basic.io;

import java.util.Scanner;

public class P1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.next();
        String[] numberParts = inputNumber.split("\\.");

        System.out.println(numberParts[0]);
        System.out.println(numberParts[1]);

        scanner.close();
    }
}
