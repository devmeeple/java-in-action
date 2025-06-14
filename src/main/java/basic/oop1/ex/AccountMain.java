package basic.oop1.ex;

/**
 * 문제2: 객체 지향 계좌
 * 1) Account 클래스 선언
 * - balance: 잔액
 * - deposit(int amount): 입금
 * - withdraw(int amount): 출금
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
