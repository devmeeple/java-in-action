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
}
