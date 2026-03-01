package codeup.basic.condition;

import java.util.Scanner;

public class P1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String evaluate = scanner.next();
        String evaluationContent = "";

        // TODO: 문자열이 아닌 문자로 받을 때, default 문의 break은 생략 가능하다 2026-03-01
        switch (evaluate) {
            case "A":
                evaluationContent = "best!!!";
                break;
            case "B":
                evaluationContent = "good!!";
                break;
            case "C":
                evaluationContent = "run!";
                break;
            case "D":
                evaluationContent = "slowly~";
                break;
            default:
                evaluationContent = "what?";
                break;
        }
        System.out.println(evaluationContent);

        scanner.close();
    }
}
