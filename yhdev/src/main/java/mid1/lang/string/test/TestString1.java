package mid1.lang.string.test;

/**
 * 문제1: startsWith()
 * 1) startsWith()를 사용하여 url이 https://로 시작되는지 검증
 */
public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        String prefix = "https://";

        boolean result = url.startsWith(prefix);
        System.out.println(result);
    }
}
