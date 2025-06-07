package start.loop.ex;

/**
 * 문제2: 짝수 출력(while)
 * 1) 1부터 10까지 짝수 출력
 * - 변수 num 사용
 */
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;

        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
