package codeup.basic.io;

import java.util.Scanner;

public class P1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float result = scanner.nextFloat();
        System.out.printf("%.2f", result);

        scanner.close();
    }
}
