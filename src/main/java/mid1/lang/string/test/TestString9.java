package mid1.lang.string.test;

/**
 * 문제9: split()
 * 1) split()를 사용하여 이메일의 ID 부부과 도메인을 분리
 */
public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@exmaple.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("ID: " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}
