package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제2: 홀수 짝수
 * 1) 정수 1개를 입력받고, 정수가 홀수인지 짝수인지 판별
 */
public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자 " + number + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + number + "는 홀수입니다.");
        }
    }
}
