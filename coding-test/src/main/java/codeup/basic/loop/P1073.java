package codeup.basic.loop;

import java.util.Scanner;

public class P1073 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        while (number != 0) {
            System.out.println(number);
            number = scanner.nextInt();
        }

        scanner.close();
    }
}
