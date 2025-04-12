package basic.access.ex

fun main() {
    val cart = KShoppingCart()

    val item1 = KItem("마늘", 2000, 2)
    val item2 = KItem("상추", 3000, 4)

    cart.addItem(item1)
    cart.addItem(item2)

    cart.displayItems()
}