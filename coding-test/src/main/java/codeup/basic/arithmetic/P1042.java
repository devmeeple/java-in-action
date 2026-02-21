package codeup.basic.arithmetic;

import java.util.Scanner;

public class P1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a / b;
        System.out.println(result);

        scanner.close();
    }
}
