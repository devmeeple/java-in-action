package god.chapter08;

public class StaticBlock {
    static int data = 1;

    static {
        System.out.println("*** First static block ***");
        data = 3;
    }

    static {
        System.out.println("*** Second static block ***");
        data = 5;
    }

    public StaticBlock() {
        System.out.println("StaticBlock.Constructor");
    }

    public static int getData() {
        return data;
    }
}
