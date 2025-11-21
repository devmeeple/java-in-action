package ch05;

import java.util.Scanner;

public class GameHelper {

    public int getUserInput(String prompt) {
        System.out.printf(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
