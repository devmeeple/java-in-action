package codeup.basic.compare;

import java.util.Scanner;

public class P1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = b >= a ? 1 : 0;
        System.out.println(result);

        scanner.close();
    }
}
