package codeup.basic.io;

import java.util.Arrays;
import java.util.Scanner;

public class P1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        int[] time = Arrays.stream(text.split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int hour = time[0];
        int minute = time[1];
        int second = time[2];

        System.out.println(minute);

        scanner.close();
    }
}
