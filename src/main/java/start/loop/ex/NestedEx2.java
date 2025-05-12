package start.loop.ex;

/**
 * 문제2: 피라미드 출력
 * rows를 추가하지 않는 피라미드
 */
public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
