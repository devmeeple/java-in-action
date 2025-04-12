package basic.access.ex

class KShoppingCart {
    val items = mutableListOf<KItem>()
    var MAX_ITEMS = 10

    fun addItem(item: KItem) {
        if (items.size >= MAX_ITEMS) {
            println("장바구니가 가득 찼습니다.")
        } else {
            items.add(item)
        }
    }

    fun displayItems() {
        println("장바구니 상품 출력")
        for (order in items) {
            println("상품명:${order.name}, 합계:${order.getTotalPrice()}")
        }
        println("전체 가격 합:${calculateTotalPrice()}")
    }

    private fun calculateTotalPrice(): Int {
        var totalPrice = 0
        for (item in items) {
            totalPrice += item.getTotalPrice()
        }
        return totalPrice
    }
}