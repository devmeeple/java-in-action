package basic.access.ex

fun main() {
    val counter = KMaxCounter(3)
    counter.increment()
    counter.increment()
    counter.increment()
    counter.increment()
    val count = counter.count
    println(count)
}