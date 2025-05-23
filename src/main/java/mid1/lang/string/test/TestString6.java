package mid1.lang.string.test;

/**
 * // TODO: 2025-05-23
 * 문제6: 검색 count
 * 1) key로 주어지는 문자를 찾고 찾은 문자의 수 출력
 * - indexOf()
 */
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
