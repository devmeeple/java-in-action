package basic.oop

fun main() {
    val player = KMusicPlayer()

    player.on()

    player.volumeUp()
    player.volumeUp()

    player.volumeDown()

    player.showStatus()

    player.off()
}
