package codeup.basic.arithmetic;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        double average = (double) (num1 + num2 + num3) / 3;

        System.out.println(sum);
        System.out.printf("%.1f", average);

        scanner.close();
    }
}
