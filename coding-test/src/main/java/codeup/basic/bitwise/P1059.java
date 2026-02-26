package codeup.basic.bitwise;

import java.util.Scanner;

public class P1059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = ~number;

        System.out.println(result);

        scanner.close();
    }
}
