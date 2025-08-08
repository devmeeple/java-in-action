package mid1.lang.string.test;

/**
 * 문제2: length()
 * 1) length()를 사용하여 arr 배열에 들어있는 모든 문자열 길이 합을 계산
 */
public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;

        for (String s : arr) {
            System.out.println(s + ":" + s.length());
            sum += s.length();
        }
        System.out.println("sum = " + sum);
    }
}
