package codeup.basic.io;

import java.util.Scanner;

public class P1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();
        System.out.printf("%d %d %d", result, result, result);

        scanner.close();
    }
}
