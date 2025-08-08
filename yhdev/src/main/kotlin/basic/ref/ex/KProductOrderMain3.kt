package basic.ref.ex

import basic.ref.ex.KProductOrderMain3.Companion.createOrder
import basic.ref.ex.KProductOrderMain3.Companion.getTotalAmount
import basic.ref.ex.KProductOrderMain3.Companion.printOrders

fun main() {
    print("입력할 주문의 개수를 입력하세요: ")
    val n = readln().toInt()

    val orders = mutableListOf<KProductOrder>()

    for (i in 0 until n) {
        println("${i + 1}번째 주문 정보를 입력하세요.")
        print("상품명: ")
        val productName = readln()

        print("가격: ")
        val price = readln().toInt()

        print("수량: ")
        val quantity = readln().toInt()

        orders += createOrder(productName, price, quantity)
    }

    printOrders(orders)

    val totalAmount = getTotalAmount(orders)
    println("총 결제 금액: $totalAmount")
}

class KProductOrderMain3 {
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