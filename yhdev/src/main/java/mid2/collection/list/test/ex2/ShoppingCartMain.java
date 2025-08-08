package mid2.collection.list.test.ex2;

/**
 * 문제4: 리스트를 사용한 쇼핑 카트
 * 1) ShoppingCart 클래스 선언
 * - 내부에 리스트를 사용
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
