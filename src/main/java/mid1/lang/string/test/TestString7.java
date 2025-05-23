package mid1.lang.string.test;

/**
 * 문제7: 공백 제거
 * 1) 문자의 양쪽 공백 제거
 */
public class TestString7 {
    public static void main(String[] args) {
        String original = "   Hello Java   ";

        String trimmed = original.trim();
        System.out.println(trimmed);
    }
}
