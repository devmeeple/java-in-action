package codeup.basic.arithmetic;

import java.util.Scanner;

public class P1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();
        char character = value.charAt(0);

        System.out.println((char)(character + 1));

        scanner.close();
    }
}
