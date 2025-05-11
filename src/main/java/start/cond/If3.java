package start.cond;

/**
 * 7세 이하: 미취학
 * 8세 이상 13세 이하: 초등학생
 * 14세 이상 16세 이하: 중학생
 * 17세 이상 19세 이하: 고등학생
 * 20세 이상: 성인
 *
 * 1. 불필요한 조건 검사, 모든 조건을 검사 중이다.
 * 2. 조건을 중복 검증하고 있다.
 */
public class If3 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }

    }
}
