package mid1.lang.string.test;

/**
 * 문제4: substring()
 * 1) hello와 .txt를 분리
 */
public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";

        String filename = str.substring(0, 5);
        String extName = str.substring(5, 9);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
