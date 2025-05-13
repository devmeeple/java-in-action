package basic.ref.ex;

/**
 * 문제: 상품 주문 시스템 개발 - 리팩터링
 * 1) 상품 주문 정보를 담을 수 있는 클래스 선언
 *  - 상품명
 *  - 가격
 *  - 주문 수량
 * 2) 상품 주문 정보를 배열로 관리
 * 3) 최종 결제 금액을 추가하여 정보 출력
 * createOrder, printOrders, getTotalAmount
 */
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] orders = {order1, order2, order3};

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
