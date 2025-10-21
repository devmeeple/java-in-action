package ch25.ex;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread timer = new TimerThread();

        timer.start();
    }
}
