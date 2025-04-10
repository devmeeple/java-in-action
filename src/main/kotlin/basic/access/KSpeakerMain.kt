package basic.access

fun main() {
    val speaker = KSpeaker(90)
    speaker.volumeUp()

    speaker.volumeUp()
    speaker.showVolume()

    speaker.volumeUp()
    speaker.showVolume()

    println("volume 필드 직접 접근 수정")
    speaker.volume = 200
    speaker.showVolume()
}