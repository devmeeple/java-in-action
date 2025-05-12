package start.method.ex;

/**
 * 문제: 입출금 리팩터링
 * 1) 입금과 출금을 메서드로 만들어서 리팩터링
 */
public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdrawAmount(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdrawAmount(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
