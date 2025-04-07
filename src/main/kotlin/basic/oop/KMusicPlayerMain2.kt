package basic.oop

fun main() {
    val data = KMusicPlayerData()

    data.isOn = true
    println("음악 플레이어를 시작합니다")

    data.volume++
    println("음악 플레이어 볼륨: ${data.volume}")

    data.volume++
    println("음악 플레이어 볼륨: ${data.volume}")

    data.volume--
    println("음악 플레이어 볼륨: ${data.volume}")

    println("음악 플레이어 상태 확인")
    if (data.isOn) {
        println("음악 플레이어 ON, 볼륨: ${data.volume}")
    } else {
        println("음악 플레이어 OFF")
    }

    data.isOn = false
    println("음악 플레이어를 종료합니다")
}