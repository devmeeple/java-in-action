package asis.cond;

/**
 * 회원 등급에 따라 쿠폰 발급
 * <p>
 * 1등급: 쿠폰 1000
 * 2등급: 쿠폰 2000
 * 3등급: 쿠폰 3000
 * 해당하지 않음: 쿠폰 500
 */
public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
