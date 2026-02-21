package codeup.basic.arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class P1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        int[] numbers = Arrays.stream(value.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int a = numbers[0];
        int b = numbers[1];

        int result = a / b;
        System.out.println(result);

        scanner.close();
    }
}
