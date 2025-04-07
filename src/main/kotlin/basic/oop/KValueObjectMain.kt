package basic.oop

fun main() {
    val valueObject = KValueObject()

    valueObject.add()
    valueObject.add()
    valueObject.add()

    println("최종 숫자=${valueObject.value}")
}
