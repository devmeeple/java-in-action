package basic.construct

class KMemberConstruct(
    val name: String,
    val age: Int,
    val grade: Int,
) {
    init {
        println("생성자 호출 name= ${name}, age= ${age}, grade= ${grade}")
    }
}