package start.cond;

/**
 * 온라인 쇼핑몰 할인 시스템
 *
 * 아이템 가격이 10000원 이상이면, 1000원 할인한다.
 * 나이가 10살 이하라면 1000원 할인한다.
 */
public class If5 {

    public static void main(String[] args) {
        int discount = 0;
        int price = 10000;
        int age = 10;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인!");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이, 1000원 할인!");
        }

        System.out.println("===========================");
        System.out.println("총 할인 금액 = " + discount + "원");
    }
}
