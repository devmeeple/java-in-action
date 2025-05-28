package mid1.enumeration.test.ex1;

/**
 * 문제1: 인증 등급 만들기
 * 1) 손님, 로그인 회원, 관리자 3가지의 등급을 구현
 * - 레벨과 설명을 포함
 * - get 메서드로 조회
 */
public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
