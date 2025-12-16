package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DivisionQuotientTest {

    @DisplayName("두 정수를 나눈 몫을 구한다.")
    @CsvSource({
            "10, 5, 2",
            "7, 2, 3"
    })
    @ParameterizedTest
    void calculateQuotient(int num1, int num2, int expected) {
        DivisionQuotient solver = new DivisionQuotient();

        int result = solver.solution(num1, num2);

        assertThat(result).isEqualTo(expected);
    }
}
