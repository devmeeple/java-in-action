package codeup.basic.logical;

import java.util.Scanner;

public class P1054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextInt() == 1;
        boolean b = scanner.nextInt() == 1;

        int result = a && b ? 1 : 0;
        System.out.println(result);

        scanner.close();
    }
}
