package basic.oop.ex

class KRectangle(
    val width: Int,
    val height: Int,
) {
    fun calculateArea() = width * height

    fun calculatePerimeter() = (width + height) * 2

    fun isSquare() = width == height
}