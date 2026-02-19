package codeup.basic.datatype;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P1028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int result = scanner.nextInt();
            System.out.println(result);
        } catch (InputMismatchException e) {
            long result = scanner.nextLong();
            System.out.println(result);
        }

        scanner.close();
    }
}
