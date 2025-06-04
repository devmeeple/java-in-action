package start.variable.ex;

/**
 * 문제3: long, boolean 데이터 타입
 * 1) long 타입의 변수를 선언, 10_000_000_000으로 초기화 후 출력
 * 2) boolean 타입의 변수를 선언, true로 초기화 후 출력
 */
public class VarEx3 {
    public static void main(String[] args) {
        long longVar = 10_000_000_000L;
        System.out.println(longVar);

        boolean boolVar = true;
        System.out.println(boolVar);
    }
}
