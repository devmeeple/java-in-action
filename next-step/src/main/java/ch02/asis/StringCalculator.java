package ch02.asis;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        String delimiter = "[,:]";
        String numbers = text;

        if (text.startsWith("//")) {
            int newlineIndex = text.indexOf("\n");
            delimiter = Pattern.quote(text.substring(2, newlineIndex));
            numbers = text.substring(newlineIndex + 1);
        }

        String[] tokens = numbers.split(delimiter);

        return Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
