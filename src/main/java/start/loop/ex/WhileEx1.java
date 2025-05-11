package start.loop.ex;

/**
 * 문제: 자연수 출력 - while
 * 10개의 자연수 출력, count 변수 사용
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
