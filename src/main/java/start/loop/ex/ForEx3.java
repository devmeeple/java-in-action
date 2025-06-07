package start.loop.ex;

/**
 * 문제3: 누적 합 계산(for)
 * 1) 1부터 max까지 합을 계산하고 출력
 * - sum: 누적 합
 * - i: 카운트
 */
public class ForEx3 {
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
