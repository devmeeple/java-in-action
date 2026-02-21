package codeup.basic.arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class P1039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        long sum = Arrays.stream(value.split(" "))
                .mapToLong(Long::parseLong)
                .sum();
        System.out.println(sum);

        scanner.close();
    }
}
