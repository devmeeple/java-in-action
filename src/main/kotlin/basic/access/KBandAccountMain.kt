package basic.access

fun main() {
    val account = KBankAccount()
    account.deposit(10000)
    account.withdraw(3000)
    // setter를 열어두고 사용하지 않음
    println("balance = ${account.balance}")
}