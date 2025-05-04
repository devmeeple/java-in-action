package playground.calculator;

import java.util.Scanner;

public class GugudanCalculatorApplication {
    public static void main(String[] args) {
        System.out.println("[구구단 프로그램] \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Q. 몇 단을 출력할까요?");
        System.out.print("A. 입력: ");
        final int dan = scanner.nextInt();
        scanner.close();

        if (dan < 2 || dan > 9) {
            System.out.println("2이상, 9이하의 숫자만 입력할 수 있습니다.");
        } else {
            System.out.println();
            System.out.printf("<%d단 출력>\n", dan);

            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n", dan, i, dan * i);
            }
        }
    }
}
