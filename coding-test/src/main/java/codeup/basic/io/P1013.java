package codeup.basic.io;

import java.util.Scanner;

public class P1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d", a, b);
        scanner.close();
    }
}
