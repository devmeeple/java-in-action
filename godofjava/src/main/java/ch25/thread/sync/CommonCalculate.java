package ch25.thread.sync;

public class CommonCalculate {
    private int amount;

    public CommonCalculate() {
        this.amount = 0;
    }

    public synchronized void plus(int value) {
        this.amount += value;
    }

    public synchronized void minus(int value) {
        this.amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
