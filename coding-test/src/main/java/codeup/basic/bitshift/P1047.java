package codeup.basic.bitshift;

import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = number << 1;

        System.out.println(result);

        scanner.close();
    }
}
