package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제9: 입력한 숫자의 합계와 평균
 * 1) 여러 숫자를 입력 받고, 숫자들의 합계와 평균을 계산
 * 2) -1을 입력하면 입력 종료
 * - sum: 합계
 * - average: 평균
 */
public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
