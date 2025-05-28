package mid1.lang.wrapper.test;

/**
 * 문제3: 박싱, 언박싱
 * 1) String str -> Integer 변환
 * 2) Integer를 int로 변환
 * 3) int를 Integer로 변환
 */
public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
