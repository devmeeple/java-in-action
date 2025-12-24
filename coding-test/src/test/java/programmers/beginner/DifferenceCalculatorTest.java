package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DifferenceCalculatorTest {

    @DisplayName("두 정수의 차를 계산한다.")
    @CsvSource({
            "2, 3, -1",
            "100, 2, 98"
    })
    @ParameterizedTest
    void solution(int num1, int num2, int expected) {
        DifferenceCalculator solve = new DifferenceCalculator();

        int result = solve.solution(num1, num2);

        assertThat(result).isEqualTo(expected);
    }
}
