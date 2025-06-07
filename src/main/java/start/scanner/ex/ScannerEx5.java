package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제6: 사이 숫자
 * 1) 정수 2개를 입력받고, 두 정수 사이의 모든 정수를 출력
 * - num1: 첫 번째 숫자
 * - num2: 두 번째 숫자
 * - num1이 num2보다 크다면, 두 숫자를 교환
 */
public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
