package start.scanner.ex;

/**
 * 문제2: 변수 값 교환
 * 1) 변수 a에는 10이 들어있고, b에는 20이 들어있다
 * 2) 변수의 값을 교환
 * temp
 */
public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;

        System.out.println("값 교환 전 a = " + a);
        System.out.println("값 교환 전 b = " + b);

        a = b;
        b = temp;

        System.out.println("값 교환 후 a = " + a);
        System.out.println("값 교환 후 b = " + b);
    }
}
