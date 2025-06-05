package start.cond;

/**
 * 조건 하나로 해석하기 때문에 의도에 맞게 동작하지 않는다.
 * 따라서 요구사항에 따라 조건문을 작성한다.
 */
public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
