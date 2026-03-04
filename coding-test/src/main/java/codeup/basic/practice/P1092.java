package codeup.basic.practice;

import java.util.Scanner;

public class P1092 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        int day = 1;
        while (day % a != 0 || day % b != 0 || day % c != 0) {
            day++;
        }
        System.out.println(day);

        scanner.close();
    }
}
