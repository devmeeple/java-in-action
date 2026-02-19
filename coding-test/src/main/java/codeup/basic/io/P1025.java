package codeup.basic.io;

import java.util.Scanner;

public class P1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        int place = 10000;

        for (int i = 0; i < number.length(); i++) {
//            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int digit = number.charAt(i) - '0';
            System.out.println("[" + (digit * place) + "]");
            place /= 10;
        }

        scanner.close();
    }
}
