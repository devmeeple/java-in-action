package start.array.ex;

import java.util.Scanner;

/**
 * 문제: 합계와 평균
 * 1) 사용자에게 정수 5개 입력받기
 * 2) 정수의 합과 평균 계산
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            sum += number;
        }

        average = (double) sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
