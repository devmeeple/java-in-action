package basic.oop

class KValueObject(var value: Int = 0) {
    fun add() {
        value++
        println("숫자 증가 value=${value}")
    }
}