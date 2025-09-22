package ch06;

public class TvEx2 {
    public static void main(String[] args) {
        Tv2 tv1 = new Tv2();
        Tv2 tv2 = new Tv2();

        System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("tv2의 channel 값은 " + tv2.channel + "입니다.");

        tv1.channel = 7;
        System.out.println("tv1의 channel 값을 7로 변경하였습니다.");

        System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("tv2의 channel 값은 " + tv2.channel + "입니다.");
    }
}

class Tv2 {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
