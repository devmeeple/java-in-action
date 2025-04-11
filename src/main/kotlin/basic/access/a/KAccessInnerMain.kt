package basic.access.a

fun main() {
    val data = KAccessData()
    // public 호출 가능
    data.publicField = 1
    data.publicMethod()

    // private 호출 불가
    // data.privateField = 3
    // data.privateMethod()

    data.innerAccess()
}
