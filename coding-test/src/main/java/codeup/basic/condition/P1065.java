package codeup.basic.condition;

import java.util.Scanner;

public class P1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // TODO: 메서드, 배열을 사용하면 좋지 않을까? 2026-03-01
        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (b % 2 == 0) {
            System.out.println(b);
        }
        if (c % 2 == 0) {
            System.out.println(c);
        }

        scanner.close();
    }
}
