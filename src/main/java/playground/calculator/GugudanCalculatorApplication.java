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

        System.out.println();
        System.out.printf("<%d단 출력>\n", dan);

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }

        System.out.println("---------------------");
        int i = 1;
        while (i < 10) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
            i++;
        }

    }
}
