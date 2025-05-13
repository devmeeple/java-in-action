package basic.oop1.ex;

/**
 * 문제2: 객체 지향 계좌
 * 1) 계좌 클래스 선언
 *  - 잔액
 *  - 입금 메서드
 *  - 출금 메서드
 * 2) AccountMain 클래스 선언
 *  - 계좌에 10000원 입금
 *  - 계좌에서 9000원 출금
 *  - 계좌에서 2000원 출금 시도 -> '잔액 부족' 출력
 *  - 잔고 출력: 잔고: 1000
 */
public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);

        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);
    }
}
