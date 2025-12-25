package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.*;

class ArraySimilarityTest {

    @DisplayName("일치하는 요소 개수를 반환한다.")
    @MethodSource("provideTestCases")
    @ParameterizedTest(name = "s1={0}, s2={1}, result={2}")
    void solution(String[] s1, String[] s2, int expected) {
        ArraySimilarity solve = new ArraySimilarity();

        int result = solve.solution(s1, s2);

        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                arguments(
                        new String[]{"a", "b", "c"},
                        new String[]{"com", "b", "d", "p", "c"},
                        2
                ),
                arguments(
                        new String[]{"n", "omg"},
                        new String[]{"m", "dot"},
                        0
                )
        );
    }
}
