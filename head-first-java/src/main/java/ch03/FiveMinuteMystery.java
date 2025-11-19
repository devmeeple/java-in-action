package ch03;

public class FiveMinuteMystery {

    void solution1() {
        int x = 0;
        Concat[] concats = new Concat[10];

        while (x < 10) {
            concats[x] = new Concat();
            x = x + 1;
        }
    }

    void solution2() {
        int x = 0;
        Concat concatRef;
        while (x < 10) {
            concatRef = new Concat();
            x = x + 1;
        }
    }
}

class Concat {
}
