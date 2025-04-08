package basic.construct

class KMemberConstruct(
    val name: String,
    val age: Int,
    val grade: Int,
) {
    constructor(name: String, age: Int) : this(name, age, 50)

    init {
        println("생성자 호출 name= ${name}, age= ${age}, grade= ${grade}")
    }
}