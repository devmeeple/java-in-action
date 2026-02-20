package ch02.asis;

import java.util.Arrays;

public class StringCalculator {

    public static int add(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        String[] tokens = text.split("[,:]");

        return Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
