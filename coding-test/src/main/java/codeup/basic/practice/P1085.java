package codeup.basic.practice;

import java.util.Scanner;

public class P1085 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long h =  scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long s = scanner.nextLong();

        double mb = (h * b * c * s) / (double) (8 * 1024 * 1024);
        System.out.printf("%.1f MB", mb);

        scanner.close();
    }
}
