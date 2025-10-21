package ch25.thread;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();

        sample.checkThreadProperty();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

//        getId() 메서드는 오버라이딩을 방지하여 스레드 ID의 고유성과 불변성을 강제 보장하기 위해 deprecated 처리되었다.
//        System.out.println("thread1 id = " + thread1.getId());
//        System.out.println("thread1 id = " + thread2.getId());
        
        System.out.println("thread1 id = " + thread1.threadId());
        System.out.println("thread2 id = " + thread2.threadId());

        System.out.println("thread1 name = " + thread1.getName());
        System.out.println("thread2 name = " + thread2.getName());

        System.out.println("thread1 priority = " + thread1.getPriority());

        daemonThread.setDaemon(true);

        System.out.println("thread1 isDaemon = " + thread1.isDaemon());
        System.out.println("daemonThread isDaemon = " + daemonThread.isDaemon());
    }
}
