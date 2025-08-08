package basic.oop

class KMusicPlayer(
    var volume: Int = 0,
    var isOn: Boolean = false,
) {
    fun on() {
        isOn = true
        println("음악 플레이어를 시작합니다")
    }

    fun off() {
        isOn = false
        println("음악 플레이어를 종료합니다")
    }

    fun volumeUp() {
        volume++
        println("음악 플레이어 볼륨: $volume")
    }

    fun volumeDown() {
        volume--
        println("음악 플레이어 볼륨: $volume")
    }

    fun showStatus() {
        println("음악 플레이어 상태 확인")
        if (isOn) {
            println("음악 플레이어 ON, 볼륨: ${volume}")
        } else {
            println("음악 플레이어 OFF")
        }
    }
}