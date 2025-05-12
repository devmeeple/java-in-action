package start.array.ex;

import java.util.Scanner;

/**
 * 문제: 합계와 평균2
 * 1) 사용자에게 정수 n개 입력받기
 *  - n은 사용자게에 입력받는 값
 * 2) 정수의 합과 평균 계산
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average = 0;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
