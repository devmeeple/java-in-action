package basic.oop

fun main() {
    var volume = 0
    var isOn = false

    isOn = true
    println("음악 플레이어를 시작합니다")

    volume++
    println("음악 플레이어 볼륨: ${volume}")

    volume++
    println("음악 플레이어 볼륨: ${volume}")

    volume--
    println("음악 플레이어 볼륨: ${volume}")

    println("음악 플레이어 상태 확인")
    if (isOn) {
        println("음악 플레이어 ON, 볼륨: ${volume}")
    } else {
        println("음악 플레이어 OFF")
    }

    isOn = false
    println("음악 플레이어를 종료합니다")
}