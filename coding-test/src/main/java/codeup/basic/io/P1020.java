package codeup.basic.io;

import java.util.Scanner;

public class P1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rrn = scanner.next();
        System.out.println(rrn.replace("-", ""));

        scanner.close();
    }
}
