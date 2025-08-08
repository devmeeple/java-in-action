package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제4: 구구단 출력
 * 1) 정수 n을 입력받고, 입력받은 정수 구구단 n단을 출력
 */
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "단의 구구단: ");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
