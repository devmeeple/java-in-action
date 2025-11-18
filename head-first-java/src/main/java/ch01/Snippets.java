package ch01;

public class Snippets {

    void statements() {
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.printf("x is " + x);
        double d = Math.random();
    }

    void looping(int x) {
        while (x > 12) {
            x = x - 1;
        }

        for (int i = 0; i < 10; i = i +1) {
            System.out.printf("i is now " + i);
        }
    }

    void conditions(int x, String name) {
        if (x == 10) {
            System.out.printf("x must be 10");
        } else {
            System.out.printf("x isn't 10");
        }
        if ((x < 3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.printf("this line runs no matter what");
    }

    void booleanTests() {
        int x = 4;
        while (x > 3) {
            x = x - 1;
        }
        int z = 27;
        while (z == 17) {
        }
    }
}
