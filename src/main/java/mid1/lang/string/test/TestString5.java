package mid1.lang.string.test;

/**
 * // TODO: 2025-05-23
 * 문제5: indexOf(), substring() 조합
 * 1) 파일명과 확장자 분리
 */
public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
