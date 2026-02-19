package codeup.basic.io;

import java.util.Arrays;
import java.util.Scanner;

public class P1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int[] results = Arrays.stream(input.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("[" + (results[0] * 10000) + "]");
        System.out.println("[" + (results[1] * 1000) + "]");
        System.out.println("[" + (results[2] * 100) + "]");
        System.out.println("[" + (results[3] * 10) + "]");
        System.out.println("[" + (results[4]) + "]");

        scanner.close();
    }
}
