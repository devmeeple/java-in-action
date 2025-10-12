package ch07;

public class ArrayInitialize {
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        System.out.println(array.getMonth(3));
    }

    public String getMonth(int monthInt) {
        return month[monthInt + 1];
    }
}
