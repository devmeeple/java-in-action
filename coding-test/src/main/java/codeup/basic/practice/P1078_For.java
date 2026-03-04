package codeup.basic.practice;

import java.util.Scanner;

public class P1078_For {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}
