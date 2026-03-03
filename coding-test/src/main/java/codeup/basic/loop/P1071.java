package codeup.basic.loop;

import java.util.Scanner;

public class P1071 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n != 0) {
            System.out.println(n);
            n = scanner.nextInt();
        }

        scanner.close();
    }
}
