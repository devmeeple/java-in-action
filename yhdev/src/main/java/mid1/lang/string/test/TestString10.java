package mid1.lang.string.test;

/**
 * // TODO: 2025-05-23
 * 문제10: split(), join()
 * 1) split()를 사용하여 fruits를 분리하고, join()를 사용하여 분리한 문자를 하나로 합치기
 */
public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}
