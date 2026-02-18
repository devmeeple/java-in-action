package codeup.basic.io;

import java.util.Scanner;

public class P1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String[] characters = word.split("");

        for (String character : characters) {
            System.out.println("'" + character + "'");
        }

        scanner.close();
    }
}
