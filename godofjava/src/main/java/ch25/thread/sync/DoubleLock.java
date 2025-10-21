package ch25.thread.sync;

public class DoubleLock {
    private int amount;
    private int interest;
    private Object interestLock = new Object();
    private Object amountLock = new Object();

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }
    }
}
