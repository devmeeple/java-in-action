package mid1.enumeration.test.ex1;

/**
 * 문제2: 인증 등급 열거형 조회하기
 */
public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade authGrade : values) {
            System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescription());
        }
    }
}
