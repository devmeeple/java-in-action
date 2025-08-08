package basic.access.ex;

/**
 * // TODO: 2025-05-13 다시 풀어보기
 * 문제: 쇼핑 카트
 * 1) Item, ShoppingCart 클래스 선언
 * 2) 접근 제어자를 사용하여 데이터 캡슐화
 *  - 다른 패키지에서도 사용할 수 있어야함
 * 3) 장바구니는 상품을 최대 10개까지 담을 수 있음
 *  - 10개 초과 등록시: '장바구니가 가득 찼습니다.' 출력
 */
public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
