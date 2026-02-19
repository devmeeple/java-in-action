package codeup.basic.io;

import java.util.Arrays;
import java.util.Scanner;

public class P1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDate = scanner.next();
        int[] results = Arrays.stream(inputDate.split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();

        int year = results[0];
        int month = results[1];
        int day = results[2];

        System.out.printf("%02d-%02d-%04d", day, month, year);

        scanner.close();
    }
}
