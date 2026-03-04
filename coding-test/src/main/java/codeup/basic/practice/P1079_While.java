package codeup.basic.practice;

import java.util.Scanner;

public class P1079_While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            char character = scanner.next().charAt(0);
            System.out.println(character);
            if (character == 'q') {
                break;
            }
        }

        scanner.close();
    }
}
