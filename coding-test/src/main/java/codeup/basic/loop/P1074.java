package codeup.basic.loop;

import java.util.Scanner;

public class P1074 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        for (int current = startNumber; current >= 1; current--) {
            System.out.println(current);
        }

        scanner.close();
    }
}
