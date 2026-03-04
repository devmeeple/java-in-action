package codeup.basic.practice;

import java.util.Scanner;

public class P1090 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long r = scanner.nextLong();
        long n = scanner.nextLong();
        long reulst = a;

        for (int i = 1; i < n; i++) {
            reulst *= r;
        }
        System.out.println(reulst);

        scanner.close();
    }
}
