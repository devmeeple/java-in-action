package codeup.basic.condition;

import java.util.Scanner;

public class P1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a % 2 == 0 ? "even" : "odd");
        System.out.println(b % 2 == 0 ? "even" : "odd");
        System.out.println(c % 2 == 0 ? "even" : "odd");

        scanner.close();
    }
}
