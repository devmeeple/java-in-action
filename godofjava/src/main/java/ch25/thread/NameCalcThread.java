package ch25.thread;

public class NameCalcThread extends Thread {
    private int calcNumber;

    public NameCalcThread(String name, int calcNumber) {
        super(name);
        this.calcNumber = calcNumber;
    }

    @Override
    public void run() {
        calcNumber++;
    }
}
