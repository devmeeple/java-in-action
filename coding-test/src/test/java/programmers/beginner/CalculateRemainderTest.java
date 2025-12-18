package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculateRemainderTest {

    @DisplayName("정수를 나눈 나머지를 반환한다.")
    @CsvSource({
            "3, 2, 1",
            "10, 5, 0"
    })
    @ParameterizedTest
    void solution(int num1, int num2, int expected) {
        CalculateRemainder solve = new CalculateRemainder();
        int result = solve.solution(num1, num2);

        assertThat(result).isEqualTo(expected);
    }
}
