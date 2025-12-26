package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FractionCalculatorTest {

    @DisplayName("분수를 더하고 기약 분수로 나타냈을 때 분자와 분모를 반환한다.")
    @CsvSource({
            "1, 2, 3, 4, 5, 4",
            "9, 2, 1, 3, 29, 6"
    })
    @ParameterizedTest(name = "분자1={0}, 분모1={1}, 분자2={2}, 분모2={3}, result=[{4}, {5}]")
    void solution(int numer1, int denom1, int numer2, int denom2, int expectedNumer, int expectedDenom) {
        FractionCalculator solve = new FractionCalculator();

        int[] result = solve.solution(numer1, denom1, numer2, denom2);

        assertThat(result).containsExactly(expectedNumer, expectedDenom);
    }
}
