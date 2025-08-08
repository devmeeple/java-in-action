package start.loop.ex;

/**
 * 문제2: 짝수 출력(for)
 * 1) 1부터 10까지 짝수 출력
 * - 변수 num 사용
 */
public class ForEx2 {
    public static void main(String[] args) {
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
