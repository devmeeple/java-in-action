package mid1.lang.wrapper.test;

/**
 * 문제: parseInt()
 * 1) 문자로 입력된 두 수의 합
 */
public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;
        System.out.println("두 수의 합: " + sum);
    }
}
