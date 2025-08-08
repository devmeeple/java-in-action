package basic.ref.ex

fun main() {
    val orders = listOf(
        KProductOrderMain2.createOrder("두부", 2000, 2),
        KProductOrderMain2.createOrder("김치", 5000, 1),
        KProductOrderMain2.createOrder("콜라", 1500, 2),
    )

    KProductOrderMain2.printOrders(orders)

    val totalAmount = KProductOrderMain2.getTotalAmount(orders)
    println("총 결제 금액: $totalAmount")
}

class KProductOrderMain2 {
    companion object {
        fun createOrder(productName: String, price: Int, quantity: Int): KProductOrder {
            return KProductOrder(productName, price, quantity)
        }

        fun printOrders(orders: List<KProductOrder>) {
            for (order in orders) {
                println("상품명: ${order.productName}, 가격: ${order.price}, 수량 ${order.quantity}")
            }
        }

        fun getTotalAmount(orders: List<KProductOrder>): Int {
            var totalAmount = 0
            for (order in orders) {
                totalAmount += order.price * order.quantity
            }
            return totalAmount
        }
    }
}