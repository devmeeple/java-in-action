package basic.access.ex

class KItem(
    val name: String,
    val price: Int,
    val quantity: Int
) {
    fun getTotalPrice() = price * quantity
}