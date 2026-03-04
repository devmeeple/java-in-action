package codeup.basic.practice;

import java.util.Scanner;

public class P1086 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long w =  scanner.nextLong();
        long h = scanner.nextLong();
        long b = scanner.nextLong();

        double mb = (w * h * b) / (double) (8 * 1024 * 1024);
        System.out.printf("%.2f MB", mb);

        scanner.close();
    }
}
