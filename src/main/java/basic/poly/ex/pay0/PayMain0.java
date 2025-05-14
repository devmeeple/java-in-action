package basic.poly.ex.pay0;

/**
 * 문제2: 결제 시스템 개발
 * 1) 새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드 리팩터링
 * - OCP 원칙 준수
 * - PayMain0의 코드는 변경할 수 없다
 */
public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
