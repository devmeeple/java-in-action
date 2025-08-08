package basic.access

class KBankAccount(var balance: Int = 0) {
    fun deposit(amount: Int) {
        if (isAmountValid(amount)) {
            balance += amount
        } else {
            println("유효하지 않은 금액입니다.")
        }
    }

    fun withdraw(amount: Int) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount
        } else {
            println("유효하지 않은 금액이거나 잔액이 부족합니다.")
        }
    }

    private fun isAmountValid(amount: Int): Boolean {
        return amount > 0
    }
}