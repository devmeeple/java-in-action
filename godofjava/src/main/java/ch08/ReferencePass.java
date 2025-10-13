package ch08;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByValue();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";

        System.out.println("Before passByValue()");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        passByValue(a, b);
        System.out.println("After passByValue()");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("In passByValue()");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
