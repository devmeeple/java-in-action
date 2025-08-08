package basic.construct.ex

class KBook(
    val title: String = "",
    val author: String ="",
    val page: Int = 0
) {
    fun displayInfo() {
        println("제목: $title, 저자: $author, 페이지: $page")
    }
}