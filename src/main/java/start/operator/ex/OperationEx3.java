package start.operator.ex;

/**
 * 문제3: 합격 범위
 * 1) int 타입 변수 score 선언
 * 2) score가 80점 이상, 100점 이하면 true, 아니면 false 출력
 */
public class OperationEx3 {
    public static void main(String[] args) {
        int score = 80;
        boolean result = score >= 80 && score <= 100;

        System.out.println("result = " + result);
    }
}
