package mid1.enumeration.test.ex1;

import java.util.Scanner;

/**
 * // TODO: 2025-05-28 테스트 코드 추가
 * 문제3: 인증 등급 열거형 활용하기
 * 1) 인증 등급을 입력 받아 AuthGrade 열거형으로 변환
 * 2) 인증 등급에 따라 접근할 수 있는 화면이 다름
 * - GUEST: 메인 화면
 * - ADMIN: 모든 화면
 */
public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }

    }
}
