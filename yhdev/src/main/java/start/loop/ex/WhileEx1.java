package start.loop.ex;

/**
 * 문제1: 자연수 출력(while)
 * 1) 1부터 10까지 자연수 출력
 * - 변수 count 사용
 */
public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }
}
