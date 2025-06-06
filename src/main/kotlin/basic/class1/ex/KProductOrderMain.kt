package basic.class1.ex

fun main() {
    val orders = listOf(
        KProductOrder("두부", 2000, 2),
        KProductOrder("김치", 5000, 1),
        KProductOrder("콜라", 1500, 2)
    )

    var totalAmount = 0
    for (order in orders) {
        println("상품명: ${order.productName}, 가격: ${order.price}, 수량: ${order.quantity}")
        totalAmount += order.price * order.quantity
    }
    println("총 결제 금액: $totalAmount")
}