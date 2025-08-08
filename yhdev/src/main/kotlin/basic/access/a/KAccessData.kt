package basic.access.a

class KAccessData {
    var publicField:Int = 0
    private var privateField:Int = 0

    fun publicMethod() {
        println("publicMethod 호출 ${publicField}")
    }

    private fun privateMethod() {
        println("privateMethod 호출: ${privateField}")
    }

    fun innerAccess() {
        println("내부 호출")

        publicField = 100
        privateField = 300

        publicMethod()
        privateMethod()
    }

}