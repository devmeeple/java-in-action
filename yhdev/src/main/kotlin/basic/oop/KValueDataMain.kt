package basic.oop

import basic.oop.KValueDataMain.Companion.add

fun main() {
    val valueData = KValueData()

    add(valueData)
    add(valueData)
    add(valueData)

    println("최종 숫자=${valueData.value}")

}

class KValueDataMain {
    companion object {
        fun add(valueData: KValueData) {
            valueData.value++
            println("숫자 증가 value= ${valueData.value}")
        }
    }
}