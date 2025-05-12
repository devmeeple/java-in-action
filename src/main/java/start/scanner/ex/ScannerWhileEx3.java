package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제4: 입력한 숫자의 합계와 평균
 * 1) 사용자로부터 여러 개의 숫자를 입력받기, -1을 입력하면 입력 종료
 * 2) 숫자들의 합계와 평균을 출력(평균은 소수점 아래까지 계산)
 * sum, average
 */
public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }

            sum += num;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
