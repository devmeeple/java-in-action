package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplyTwoNumbersTest {

    @DisplayName("두 정수의 곱을 구한다.")
    @CsvSource({
            "3, 4, 12",
            "27, 19, 513",
    })
    @ParameterizedTest
    void multiply(int num1, int num2, int expected) {
        MultiplyTwoNumbers solver = new MultiplyTwoNumbers();

        int result = solver.solution(num1, num2);

        assertThat(result).isEqualTo(expected);
    }
}
