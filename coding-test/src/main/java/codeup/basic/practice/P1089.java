package codeup.basic.practice;

import java.util.Scanner;

public class P1089 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = a;

        for (int i = 1; i < n; i++) {
            sum += d;
        }
        System.out.println(sum);

        scanner.close();
    }
}
