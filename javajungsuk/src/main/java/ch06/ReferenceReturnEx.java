package ch06;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data3 data = new Data3();
        data.x = 10;

        Data3 data2 = new Data3();

        System.out.println("data.x = " + data.x);
        System.out.println("data2.x = " + data2.x);
    }

    static Data3 copy(Data3 data) {
        Data3 tmp = new Data3();
        tmp.x = data.x;

        return tmp;
    }
}

class Data3 {
    int x;
}
