package ch06;

public class MyMathEx2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200.0, 100.0));

        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 200L;
        myMath2.b = 100L;

        System.out.println(myMath2.add());
        System.out.println(myMath2.subtract());
        System.out.println(myMath2.multiply());
        System.out.println(myMath2.divide());
    }
}

class MyMath2 {
    long a, b;

    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}

