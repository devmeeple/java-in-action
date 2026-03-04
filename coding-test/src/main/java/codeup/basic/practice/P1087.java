package codeup.basic.practice;

import java.util.Scanner;

public class P1087 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (sum < number) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        scanner.close();
    }
}
