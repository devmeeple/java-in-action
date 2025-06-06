package basic.class1.ex;

/**
 * 문제: 상품 주문 시스템 개발
 * 1) 상품 주문 정보를 담는 ProductOrder 클래스 선언
 *  - 상품명
 *  - 가격
 *  - 주문 수량
 * 2) 상품의 주문 정보를 배열로 관리
 * 3) 최종 결제 금액을 추가하여 정보 출력
 *
 * 출력
 *  - 상품명: [상품명], 가격: [가격], 수량: [수량]
 *  - 총 결제 금액: [총 결제 금액]
 */
public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3= new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);
    }
}
