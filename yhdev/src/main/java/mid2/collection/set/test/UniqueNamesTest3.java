package mid2.collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 문제3: 중복 제거와 데이터 순서 유지
 */
public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
