package codeup.basic.io;

import java.util.Scanner;

public class P1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String[] parts = input.split(":");

        int minute = Integer.parseInt(parts[1]);
        System.out.println(minute);

        scanner.close();
    }
}
