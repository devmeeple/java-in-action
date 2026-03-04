package codeup.basic.practice;

import java.util.Scanner;

public class P1078_While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int number = scanner.nextInt();

        while (number >= i) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

        scanner.close();
    }
}
