package mid1.lang.string.test;

/**
 * 문제8: replace()
 * 1) replace()를 사용하여 `java`를 `jvm`으로 변경
 */
public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        String result = input.replace("java", "jvm");
        System.out.println(result);
    }
}
