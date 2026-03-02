package codeup.basic.condition;

import java.util.Scanner;

public class P1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // TODO: 동일 구조의 반복, 메서드의 필요성을 느낌 혹은 삼항 연산자가 간결 2026-03-01
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scanner.close();
    }
}
