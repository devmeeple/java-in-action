package start.operator.ex;

/**
 * 문제2: double과 평균
 * 1) double 타입 변수 var1, var2, var3을 선언하고 1.5, 2.5, 3.5로 초기화
 * 2) 합과 평균을 출력
 */
public class OperationEx2 {
    public static void main(String[] args) {
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum = var1 + var2 + var3;
        double average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
