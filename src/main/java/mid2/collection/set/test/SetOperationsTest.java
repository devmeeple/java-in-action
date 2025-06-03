package mid2.collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 문제4: 합집합, 교집합, 차집합
 * 1) 합집합: 두 집합의 합
 * 2) 교집합: 두 집합의 공통 값
 * 3) 차집합: 집합1에서 집합2와 같은 값을 뺀 나머지
 */
public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }
}
