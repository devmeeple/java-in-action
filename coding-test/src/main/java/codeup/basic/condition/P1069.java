package codeup.basic.condition;

import java.util.Scanner;

public class P1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        // TODO: 문자열이 아닌 문자로 받을 때, default 문의 break은 생략 가능하다 2026-03-01
        // TODO: Switch Statements
        String message = switch (grade) {
            case "A" -> "best!!!";
            case "B" -> "good!!";
            case "C" -> "run!";
            case "D" -> "slowly~";
            default -> "what?";
        };

        System.out.println(message);

        scanner.close();
    }
}
