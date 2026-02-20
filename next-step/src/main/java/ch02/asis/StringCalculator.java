package ch02.asis;

import java.util.Arrays;

public class StringCalculator {

    public static void main(String[] args) {
        String text = "1,2:3";
        int sum = 0;

        if (text.isBlank()) {
            System.out.println(sum);
            return;
        }

        String[] tokens = text.split("[,:]");

        sum = Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);
    }
}
