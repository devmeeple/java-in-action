package basic.access

class KSpeaker(var volume: Int) {
    fun volumeUp() {
        if (volume >= 100) {
            println("음량을 증가할 수 없습니다. 최대 음량입니다.")
        } else {
            volume += 10
            println("음량을 10 증가합니다.")
        }
    }

    fun volumeDown() {
        volume -= 10
        println("volumeDown 호출")
    }

    fun showVolume() {
        println("현재 음량: ${volume}")
    }
}