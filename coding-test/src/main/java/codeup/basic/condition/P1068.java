package codeup.basic.condition;

import java.util.Scanner;

public class P1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        // TODO: switch문으로 개선, 단일 if문으로 작성하면 안되는 이유 2026-03-01
        String grade = "";
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 70 && score <= 89) {
            grade = "B";
        } else if (score >= 40 && score <= 69) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println(grade);

        scanner.close();
    }
}
