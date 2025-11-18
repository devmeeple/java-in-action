package ch02;

public class EpisodeTestDrive {

    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;

        episode.play();
        episode.skipIntro();
    }
}

class Episode {
    int seriesNumber;
    int episodeNumber;

    void play() {
        System.out.println("Playing episode " + episodeNumber);
    }

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
