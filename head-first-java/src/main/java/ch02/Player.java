package ch02;

public class Player {
    int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("추측한 숫자: " + number);
    }
}
