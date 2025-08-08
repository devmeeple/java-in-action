package mid2.collection.set.test;

import java.util.HashSet;
import java.util.Set;

/**
 * 문제1: 중복 제거
 * 1) 중복 값을 제거하고 값을 출력(순서는 상관없음)
 */
public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();

        for (Integer s : inputArr) {
            set.add(s);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
