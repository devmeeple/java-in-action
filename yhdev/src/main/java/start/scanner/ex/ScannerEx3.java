package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제3: 음식점 주문
 * 1) 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity)을 입력받고, 주문한 음식의 총 가격(totalPrice)을 계산하고 출력
 * - 출력: [음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원입니다.
 */
public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력하세요: ");
        String foodName = scanner.nextLine();

        System.out.print("음식의 가격을 입력하세요: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식의 수량을 입력하세요: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
