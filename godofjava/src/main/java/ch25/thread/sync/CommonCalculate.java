package ch25.thread.sync;

public class CommonCalculate {
    private int amount;
    Object lock = new Object();

    public CommonCalculate() {
        this.amount = 0;
    }

    public void plus(int value) {
        synchronized (lock) {
            this.amount += value;
        }
    }

    public void minus(int value) {
        synchronized (lock) {
            this.amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
