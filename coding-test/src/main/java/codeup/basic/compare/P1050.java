package codeup.basic.compare;

import java.util.Scanner;

public class P1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a == b ? 1 : 0;
        System.out.println(result);

        scanner.close();
    }
}
