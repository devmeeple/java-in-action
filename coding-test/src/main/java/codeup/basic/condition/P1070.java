package codeup.basic.condition;

import java.util.Scanner;

public class P1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        // TODO: 기본 switch문을 사용할 때는 에러처리가 왜 필요없을까? 2026-03-01
        // TODO: 적절한 에러 타입 IllegalArgumentException, IllegalStateException 2026-03-01
        String season = switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "fall";
            default -> throw new IllegalArgumentException("Invalid value: " + month);
        };
        System.out.println(season);

        scanner.close();
    }
}
