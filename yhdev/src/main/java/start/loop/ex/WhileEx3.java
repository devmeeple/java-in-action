package start.loop.ex;

/**
 * 문제3: 누적 합 계산(while)
 * 1) 1부터 max까지 합을 계산하고 출력
 * - sum: 누적 합
 * - i: 카운트
 */
public class WhileEx3 {
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
