package basic.access.ex

class KMaxCounter(val max: Int) {
    var count: Int = 0

    fun increment() {
        if (count >= max) {
            println("최대값을 초과할 수 없습니다")
        } else {
            count++
        }
    }
}