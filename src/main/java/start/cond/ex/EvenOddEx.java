package start.cond.ex;

/**
 * 문제7: 홀수 짝수 찾기
 * 1) int x가 짝수라면 "짝수", 홀수라면 "홀수"를 출력하는 프로그램
 * - 삼항 연산자 사용
 */
public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
