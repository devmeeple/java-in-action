package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제: 구구단 출력
 * 사용자로부터 하나의 정수를 입력받고, 입력받은 정수의 구구단을 출력
 * n
 */
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "단의 구구단:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
