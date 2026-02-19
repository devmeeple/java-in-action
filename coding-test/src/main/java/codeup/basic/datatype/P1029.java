package codeup.basic.datatype;

import java.util.Scanner;

public class P1029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = scanner.nextDouble();
        System.out.printf("%.11f", result);

        scanner.close();
    }
}
