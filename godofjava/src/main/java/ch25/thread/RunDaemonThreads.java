package ch25.thread;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();

        sample.runCommonThread();
    }

    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();

        thread.setDaemon(true);
        thread.start();
    }
}
