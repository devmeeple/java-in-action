package codeup.basic.loop;

import java.util.Scanner;

public class P1077 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endNumber = scanner.nextInt();
        for (int i = 0; i <= endNumber; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
