package asis.cond;

/**
 * 회원 등급에 따라 쿠폰 발급
 * <p>
 * 1등급: 쿠폰 1000
 * 2등급: 쿠폰 2000
 * 3등급: 쿠폰 3000
 * 해당하지 않음: 쿠폰 500
 */
public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
