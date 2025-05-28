package mid1.lang.wrapper.test;

/**
 * 문제4: 오토 박싱, 오토 언박싱
 * 1) String -> Integer 변환
 * 2) Integer -> int 변환
 * 3) int -> Integer 변환
 */
public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
