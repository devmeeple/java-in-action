package codeup.basic.loop;

import java.util.Scanner;

public class P1072 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            System.out.println(number);
        }

        scanner.close();
    }
}
