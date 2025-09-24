package ch06;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 data = new Data2();
        data.x = 10;

        System.out.println("main() : x = " + data.x);

        change(data);

        System.out.println("After change(data)");
        System.out.println("main() : x = " + data.x);
    }

    static void change(Data2 data) {
        data.x = 1000;

        System.out.println("change() : x = " + data.x);
    }
}

class Data2 {
    int x;
}
