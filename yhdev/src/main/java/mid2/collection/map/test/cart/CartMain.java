package mid2.collection.map.test.cart;

/**
 * // TODO: 2025-06-04
 * 문제7: 장바구니
 * 1) Product, Cart 선언
 * - Cart: Map을 통해 상품을 장바구니에 보관(Key: Product, Value: 수량)
 * 2) add(): 장바구니 추가
 * - 장바구니에 상품과 수량 담기, 상품의 이름과 가격이 같으면 같은 상품
 * - 장바구니에 이름과 가격이 같은 상품을 추가하면 기존에 담긴 상품에 수량만 추가
 * - 장바구니에 이름과 가격이 다른 상품을 추가하면 새로운 상품이 추가
 * 3) minus(): 장바구니 제거
 * - 장바구니에 담긴 상품의 수량 감소, 만약 수량이 0보다 작으면 상품이 장바구니에서 제거
 */
public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
    }
}
