package basic.oop.ex

fun main() {
    val account = KAccount()

    account.deposit(10000)
    account.withdraw(9000)
    account.withdraw(2000)

    println("잔고: ${account.balance}")
}