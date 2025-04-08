package basic.construct.ex

fun main() {
    val book1 = KBook()
    book1.displayInfo()

    val book2 = KBook("Hello Java", "Seo")
    book2.displayInfo()

    val book3 = KBook("JPA 프로그래밍", "kim", 700)
    book3.displayInfo()
}