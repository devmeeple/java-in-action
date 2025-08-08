package start.scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 0;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }

        System.out.println("main m = " + m);
    }
}
