package codeup.basic.loop;

import java.util.Scanner;

public class P1074 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for (; number != 0; number--) {
            System.out.println(number);
        }

        scanner.close();
    }
}
