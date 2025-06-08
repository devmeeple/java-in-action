package start.array.ex;

import java.util.Scanner;

/**
 * 문제2: 배열의 입력과 출력
 * 1) 5개의 정수를 입력받아 배열에 저장, 입력 순서대로 출력
 * - 출력: 1, 2, 3, 4, 5
 * - 마지막에 쉼표를 넣지 않음
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
