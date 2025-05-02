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

        int result = dan * 1;
        System.out.printf("%d * 1 = %d\n", dan, result);

        result = dan * 2;
        System.out.printf("%d * 2 = %d\n", dan, result);

        result = dan * 3;
        System.out.printf("%d * 3 = %d\n", dan, result);

        result = dan * 4;
        System.out.printf("%d * 4 = %d\n", dan, result);

        result = dan * 5;
        System.out.printf("%d * 5 = %d\n", dan, result);

        result = dan * 6;
        System.out.printf("%d * 6 = %d\n", dan, result);

        result = dan * 7;
        System.out.printf("%d * 7 = %d\n", dan, result);

        result = dan * 8;
        System.out.printf("%d * 8 = %d\n", dan, result);

        result = dan * 9;
        System.out.printf("%d * 9 = %d\n", dan, result);

    }
}
