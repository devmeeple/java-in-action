package playground;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        String[] parts = scanner.nextLine().split(" ");
        scanner.close();

        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);

        System.out.println("두 수의 합은 " + (sum) + "입니다");
    }
}
