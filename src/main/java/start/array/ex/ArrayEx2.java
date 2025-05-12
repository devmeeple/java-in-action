package start.array.ex;

import java.util.Scanner;

/**
 * // TODO: 2025.05.12 출력형식 조건문 사용
 * 문제: 배열의 입력과 출력
 * 1) 사용자에게 정수 5개 입력받기
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
