package ch25.ex;

import java.util.Date;

public class TimerThread extends Thread {
    @Override
    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        try {
            int count = 0;
            while (count < 10) {
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime) + " " + currentTime);
                Thread.sleep(1000);
                count++;
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
