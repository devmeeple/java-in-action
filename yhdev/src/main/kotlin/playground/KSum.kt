package playground

fun main() {
    println("두 수를 입력하세요.")
    val (firstNumber, secondNumber) = readln().split(" ").map { it.toInt() }
    println("두 수의 합은 ${firstNumber + secondNumber}입니다")
}