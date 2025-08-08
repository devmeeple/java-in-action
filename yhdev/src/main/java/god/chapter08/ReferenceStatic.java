package god.chapter08;

public class ReferenceStatic {
    String name = "Tae";

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("ReferenceStatic.staticMethod");
    }

    public static void staticMethodCallVariable() {
        // System.out.println(name); // non-static variable name cannot be referenced from a static context
    }
}
