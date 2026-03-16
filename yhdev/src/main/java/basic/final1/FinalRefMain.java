package basic.final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // Cannot assign a value to final variable 'data'

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
