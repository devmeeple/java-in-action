package mid1.lang.string.test;

/**
 * // TODO: 2025-05-23
 * 문제11: reverse()
 * 1) 문자열을 반대로 뒤집기
 * - StringBuilder.reverse()
 */
public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
