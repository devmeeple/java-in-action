package basic.ref.ex;

import java.util.Scanner;

/**
 * // TODO: 2025-05-13 Scanner 버퍼 비우기
 * 문제: 상품 주문 시스템 개발 - 사용자 입력
 * 1) 주문 수량 입력받기
 *  - 입력할 주문의 개수를 입력하세요: n
*  2) 가격, 수량, 상품명 입력받기
 *  - 상품 순서를 알 수 있게 'n번째 주문 정보를 입력하세요.' 메시지 출력
 * 3) 입력이 끝나면 등록한 상품과 총 결제 금액 출력
 */
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[orderCount];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int result = 0;
        for (ProductOrder order : orders) {
            result += order.price * order.quantity;
        }
        return result;
    }
}
