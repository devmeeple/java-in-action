package codeup.basic.practice;

import java.util.Scanner;

public class P1088 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endNumber = scanner.nextInt();
        for (int i = 1; i <= endNumber; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
