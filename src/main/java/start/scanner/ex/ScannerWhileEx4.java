package start.scanner.ex;

import java.util.Scanner;

/**
 * // TODO: 2025-05-12 이전에 입력된 개행문자 제거
 * 문제4: 상품 구매
 * 1) 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받기
 * 2) 3가지 옵션(정수)을 제공, 이 외의 옵션을 선택하면 "올바른 옵션을 선택해주세요." 출력
 *  - 1: 상품 입력
 *  - 2: 결제
 *  - 3: 프로그램 종료
 * 3) 상품 입력
 *  - 상품명, 가격, 수량을 입력받고 총 가격을 계산
 * 4) 결제
 *  - 총 가격 출력
 *  - 가격을 0으로 초기화
 * 5) 프로그램 종료
 *  - "프로그램을 종료합니다." 출력 후 종료
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
                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 입력해주세요.");
            }
        }
    }
}
