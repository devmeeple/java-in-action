package codeup.basic.io;

import java.util.Scanner;

public class P1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();

        System.out.printf("%.6f", x);
        scanner.close();
    }
}
