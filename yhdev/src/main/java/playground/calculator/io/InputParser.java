package playground.calculator.io;

public class InputParser {
    public static int[] parseRange(String input) {
        String[] tokens = input.split(",");

        validateTokenLength(tokens);

        int danLimit = Integer.parseInt(tokens[0].trim());
        int mulLimit = Integer.parseInt(tokens[1].trim());

        return new int[] {danLimit, mulLimit};
    }

    private static void validateTokenLength(String[] tokens) {
        if (tokens.length != 2) {
            throw new IllegalArgumentException("입력 형식이 잘못되었습니다. 예: 8,7");
        }
    }
}
