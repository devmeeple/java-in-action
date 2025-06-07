package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제8: 상품 가격 계산
 * 1) 상품의 가격(price)과 수량(quantity)을 입력받고, 총 비용을 출력
 * 2) -1을 입력하면 입력 종료
 * - 출력: 총 비용: [곱한 결과]
 */
public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            int totalCost = price * quantity;
            System.out.println("총 비용: " + totalCost);
        }
    }
}
