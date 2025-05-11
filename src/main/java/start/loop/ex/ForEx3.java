package start.loop.ex;

/**
 * 문제: 누적 합 계산 - for
 * 1부터 max까지 합, sum, i 변수 사용
 */
public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;

        int max = 100;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
