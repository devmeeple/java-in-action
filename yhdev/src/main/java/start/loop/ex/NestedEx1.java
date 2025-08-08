package start.loop.ex;

/**
 * 문제4: 구구단 출력
 * 1) 중첩 for문을 사용하여 구구단 완성
 */
public class NestedEx1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
