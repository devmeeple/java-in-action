package codeup.basic.practice;

import java.util.Scanner;

public class P1082 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hex = Integer.parseInt(scanner.next(), 16);
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X%n", hex, i, hex * i);
        }

        scanner.close();
    }
}
