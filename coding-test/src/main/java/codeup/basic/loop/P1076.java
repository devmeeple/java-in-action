package codeup.basic.loop;

import java.util.Scanner;

public class P1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char endCharacter = scanner.next().charAt(0);
        for (char current = 'a'; current <= endCharacter; current++) {
            System.out.print(current + " ");
        }

        scanner.close();
    }
}
