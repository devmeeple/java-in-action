package basic.oop

import basic.oop.KMusicPlayerMain3.Companion.off
import basic.oop.KMusicPlayerMain3.Companion.on
import basic.oop.KMusicPlayerMain3.Companion.showStatus
import basic.oop.KMusicPlayerMain3.Companion.volumeDown
import basic.oop.KMusicPlayerMain3.Companion.volumeUp

fun main() {
    val data = KMusicPlayerData()

    on(data)

    volumeUp(data)
    volumeUp(data)

    volumeDown(data)

    showStatus(data)

    off(data)
}

class KMusicPlayerMain3 {
    companion object {
        fun on(data: KMusicPlayerData) {
            data.isOn = true
            println("음악 플레이어를 시작합니다")
        }

        fun off(data: KMusicPlayerData) {
            data.isOn = false
            println("음악 플레이어를 종료합니다")
        }

        fun volumeUp(data: KMusicPlayerData) {
            data.volume++
            println("음악 플레이어 볼륨: ${data.volume}")
        }

        fun volumeDown(data: KMusicPlayerData) {
            data.volume--
            println("음악 플레이어 볼륨: ${data.volume}")
        }

        fun showStatus(data: KMusicPlayerData) {
            println("음악 플레이어 상태 확인")
            if (data.isOn) {
                println("음악 플레이어 ON, 볼륨: ${data.volume}")
            } else {
                println("음악 플레이어 OFF")
            }
        }
    }
}