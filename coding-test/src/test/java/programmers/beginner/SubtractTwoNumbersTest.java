package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SubtractTwoNumbersTest {

    @DisplayName("두 수의 차를 구한다.")
    @CsvSource({
            "2, 3, -1",
            "100, 2, 98"
    })
    @ParameterizedTest
    void subtract(int num1, int num2, int expected) {
        SubtractTwoNumbers solver = new SubtractTwoNumbers();

        int result = solver.solution(num1, num2);

        assertThat(result).isEqualTo(expected);
    }
}
