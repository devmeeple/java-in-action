package codeup.basic.practice;

import java.util.Scanner;

public class P1079_DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character;
        do {
            character = scanner.next().charAt(0);
            System.out.println(character);
        } while (character != 'q');

        scanner.close();
    }
}
