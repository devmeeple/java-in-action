package start.scanner.ex;

/**
 * 문제5: 변수 값 교환
 * 1) 변수 a와 b의 값을 교환
 * - a: 10
 * - b: 20
 */
public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
