package programmers.beginner;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraySimilarity {

    public int solution(String[] s1, String[] s2) {
        Set<String> comparisonSet = Arrays.stream(s2).collect(Collectors.toSet());

        return (int) Arrays.stream(s1)
                .filter(comparisonSet::contains)
                .count();
    }
}
