package start.array.ex;

import java.util.Scanner;

/**
 * 문제2: 가장 작은 수, 큰 수 찾기
 * 1) n개의 정수를 입력받아 배열에 저장하기
 * 2) 가장 작은 수와 가장 큰 수를 찾아 출력
 */
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
