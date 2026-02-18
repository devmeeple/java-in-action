package codeup.basic.io;

import java.util.Scanner;

public class P1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();
        String[] parts = time.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        System.out.printf("%d:%d", hour, minute);

        scanner.close();
    }
}
