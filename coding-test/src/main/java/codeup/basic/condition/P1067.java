package codeup.basic.condition;

import java.util.Scanner;

public class P1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // TODO: 0은 양과 음 어디에도 해당하지 않는다. 입력조건에 0은 입력되지 않는다고 명시했다. 2026-03-01
        if (number > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }

        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scanner.close();
    }
}
