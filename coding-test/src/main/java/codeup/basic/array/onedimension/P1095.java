package codeup.basic.array.onedimension;

import java.util.Scanner;

public class P1095 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]  = scanner.nextInt();
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        scanner.close();
    }
}
