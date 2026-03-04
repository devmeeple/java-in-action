package codeup.basic.practice;

import java.util.Scanner;

public class P1083_Continue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
                continue;
            }
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
