package codeup.basic.io;

import java.util.Scanner;

public class P1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDate = scanner.next();
        String[] dateParts = inputDate.split("\\.");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);

        scanner.close();
    }
}
