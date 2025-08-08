package mid2.collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 문제2: 중복 제거와 입력 순서 유지
 */
public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
