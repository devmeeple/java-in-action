package codeup.basic.outputconversion;

import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int decimal = Integer.parseInt(input, 16);

        System.out.printf("%o", decimal);

        scanner.close();
    }
}
