package start.method.ex;

/**
 * 문제: 반복 출력 리팩터링
 * times: 횟 수
 */
public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
