package codeup.basic.outputconversion;

import java.util.Scanner;

public class P1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String result = Integer.toOctalString(input);

        System.out.println(result);

        scanner.close();
    }
}
