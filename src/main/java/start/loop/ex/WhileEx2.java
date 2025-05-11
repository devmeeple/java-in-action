package start.loop.ex;

/**
 * 문제: 짝수 출력 - while
 * 10개의 짝수를 출력, num 변수 사용
 */
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count < 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
