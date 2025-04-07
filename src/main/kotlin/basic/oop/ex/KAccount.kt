package basic.oop.ex

/**
 * 문제2 - 객체 지향 계좌
 *
 * @property balance 잔액
 */
class KAccount(
    var balance: Int = 0,
){

    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("잔액 부족")
        }
    }
}