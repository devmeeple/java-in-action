package start.loop.ex;

/**
 * 문제: 누적 합 계산 - while
 * 1부터 max까지 합, sum, i 변수 사용
 */
public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        int max = 100;
        while (i <= max) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
