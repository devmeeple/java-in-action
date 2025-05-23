package mid1.lang.string.test;

/**
 * 문제3: indexOf()
 * 1) 문자열(.txt)이 언제부터 시작되는지 위치 출력
 */
public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }
}
