package mid1.lang.wrapper.test;

/**
 * // TODO: 2025-05-27
 * 문제2: parseDouble()
 * 1) 배열에 입력된 모든 숫자의 합
 */
public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String s : array) {
            double i = Double.parseDouble(s);
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
