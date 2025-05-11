package start.loop.ex;

/**
 * 문제: 짝수 출력 - for
 * 10개의 짝수를 출력, num 변수 사용
 */
public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;

        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num += 2;
        }
    }
}
