package ch20.lang;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();

        sample.integerMinMaxCheckBinary();
    }

    public void integerMinMaxCheckBinary() {
        System.out.println("Integer BINARY min = " + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer BINARY max = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer HEX min = " + Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer HEX max = " + Integer.toHexString(Integer.MAX_VALUE));
    }

    public void numberMinMaxCheck() {
        System.out.println("Byte min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE);
        System.out.println("Integer min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE);
        System.out.println("Long min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
        System.out.println("Float min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE);
        System.out.println("Double min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE);
        System.out.println("Character min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE);
    }
}
