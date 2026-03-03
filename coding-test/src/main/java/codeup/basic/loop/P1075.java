package codeup.basic.loop;

import java.util.Scanner;

public class P1075 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int current = scanner.nextInt();
        while (current > 0) {
            current--;
            System.out.println(current);
        }

        scanner.close();
    }
}
