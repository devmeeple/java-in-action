package start.scanner.ex;

import java.util.Scanner;

/**
 * 문제10: 상품 구매
 * 1) 상품 정보(상품명, 가격, 수량)을 입력받고, 총 가격을 출력
 * 2) 3가지 옵션 제공, 이 외의 옵션을 선택하면 "올바른 옵션을 선택해주세요." 출력
 * - 1: 상품 입력
 * - 2: 결제
 * - 3: 프로그램 종료
 * 3) 상품 입력: 상품명, 가격, 수량을 입력받고 총 가격을 출력
 * 4) 결제:총 가격을 출력하고 0으로 초기화
 * 5) 종료: "프로그램을 종료합니다." 출력
 */
public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + (price * quantity));
            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
