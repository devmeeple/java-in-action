package codeup.basic.bitshift;

import java.util.Scanner;

public class P1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int shift = scanner.nextInt();
        int result = base << shift;

        System.out.println(result);

        scanner.close();
    }
}
