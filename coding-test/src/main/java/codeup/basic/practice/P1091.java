package codeup.basic.practice;

import java.util.Scanner;

public class P1091 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long m = scanner.nextLong();
        long d = scanner.nextLong();
        long n = scanner.nextLong();

        long result = a;

        for (int i = 1; i < n; i++) {
            result = (result * m) + d;
        }
        System.out.println(result);

        scanner.close();
    }
}
