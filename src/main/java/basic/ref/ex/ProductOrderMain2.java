package basic.ref.ex;

/**
 * 문제1: 상품 주문 시스템 개발(리팩터링)
 * 1) 상품 주문 정보를 배열로 관리
 * 2) 정보 출력과 최종 결제 금액 출력
 * 3) 메서드 선언
 * - createOrder: 객체 생성
 * - printOrders: 상품 정보 출력
 * - getTotalAmount: 최종 결제 금액 계산
 */
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

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
            result += order.quantity * order.price;
        }
        return result;
    }
}
