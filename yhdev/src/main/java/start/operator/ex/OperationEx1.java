package start.operator.ex;

/**
 * 문제1: int와 평균
 * 1) 변수 num1, num2, num3를 선언 후 10, 20, 30으로 초기화
 * 2) sum: 세 변수의 합
 * 3) average: 세 변수의 평균
 * 4) 변수 sum, average의 값 출력
 */
public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
