package start.array.ex;

import java.util.Scanner;

/**
 * 문제3: 배열과 역순 출력
 * 1) 5개의 정수를 입력받아 배열에 저장, 입력받은 순서의 역순으로 출력
 * - 출력: 5, 4, 3, 2, 1
 * - 마지막에 쉼표를 넣지 않음
 */
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
