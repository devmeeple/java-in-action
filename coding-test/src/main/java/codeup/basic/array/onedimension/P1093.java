package codeup.basic.array.onedimension;

import java.util.Scanner;

public class P1093 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[23];

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            counts[number - 1]++;
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }

        scanner.close();
    }
}
