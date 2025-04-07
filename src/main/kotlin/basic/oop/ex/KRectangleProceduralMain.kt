package basic.oop.ex

fun main() {
    val rectangle = KRectangle(5, 8)

    val area = rectangle.calculateArea()
    println("넓이: $area")

    val perimeter = rectangle.calculatePerimeter()
    println("둘레: $perimeter")

    val isSquare = rectangle.isSquare()
    println("정사각형 여부: $isSquare")
}
