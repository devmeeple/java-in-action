package codeup.basic.arithmetic;

import java.util.Scanner;

public class P1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        double quotientDouble = (double) a / b;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
        System.out.printf("%.2f", quotientDouble);

        scanner.close();
    }
}
