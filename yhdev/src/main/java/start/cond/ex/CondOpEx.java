package start.cond.ex;

/**
 * 문제6: 더 큰 숫자 찾기
 * 1) int a = 10, b = 20일 때 삼항 연산자를 사용하여 더 큰숫자를 출력
 */
public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
