package codeup.basic.practice;

import java.util.Scanner;

public class P1084 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        System.out.println(r * g * b);

        scanner.close();
    }
}
