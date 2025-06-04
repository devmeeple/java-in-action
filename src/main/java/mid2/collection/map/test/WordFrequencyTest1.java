package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * // TODO: 2025-06-04
 * 문제3: 같은 단어가 나타난 수
 * 1) 각 단어가 나타난 수를 출력
 */
public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;

            map.put(word, count);
        }

        System.out.println(map);
    }
}
