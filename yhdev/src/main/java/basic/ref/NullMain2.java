package basic.ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // Exception in thread "main" java.lang.NullPointerException: Cannot assign field "value" because "data" is null
        System.out.println("data = " + data.value);
    }
}
