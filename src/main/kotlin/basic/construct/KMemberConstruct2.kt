package basic.construct

class KMemberConstruct2(
    val name: String,
    val age: Int,
    val grade: Int = 50,
) {

    init {
        println("생성자 호출 name= ${name}, age= ${age}, grade= ${grade}")
    }
}