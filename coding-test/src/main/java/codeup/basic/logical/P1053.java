package codeup.basic.logical;

import java.util.Scanner;

public class P1053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = number == 0 ? 1 : 0;

        System.out.println(result);

        scanner.close();
    }
}
