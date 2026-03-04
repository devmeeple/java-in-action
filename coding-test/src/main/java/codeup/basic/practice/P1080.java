package codeup.basic.practice;

import java.util.Scanner;

public class P1080 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            sum += i;
            if (sum >= number) {
                break;
            }
            i++;
        }
        System.out.println(i);

        scanner.close();
    }
}
