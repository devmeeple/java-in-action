package ch02.asis;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        String delimiter = "[,:]";
        String numbersPart = text;

        if (text.startsWith("//")) {
            int newlineIndex = text.indexOf("\n");
            delimiter = Pattern.quote(text.substring(2, newlineIndex));
            numbersPart = text.substring(newlineIndex + 1);
        }

        String[] tokens = numbersPart.split(delimiter);

        int[] numbers = Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .toArray();

        validateNegative(numbers);

        return Arrays.stream(numbers).sum();
    }

    private static void validateNegative(int[] numbers) {
        List<Integer> negatives = Arrays.stream(numbers)
                .filter(n -> n < 0)
                .boxed()
                .toList();

        if (negatives.isEmpty()) {
            return;
        }

        throw new IllegalArgumentException("음수는 허용하지 않습니다: " + negatives);
    }
}
