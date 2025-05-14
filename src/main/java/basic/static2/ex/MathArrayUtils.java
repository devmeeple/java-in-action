package basic.static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {}

    public static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (value < result) {
                result = value;
            }
        }
        return result;
    }

    public static int max(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (value > result) {
                result = value;
            }
        }
        return result;
    }
}
