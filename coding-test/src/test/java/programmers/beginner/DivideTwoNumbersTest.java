package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DivideTwoNumbersTest {

    @DisplayName("두 수를 나눈 뒤, 몫의 1000을 곱한 정수 부분을 반환한다.")
    @CsvSource({
            "3, 2, 1500",
            "7, 3, 2333",
            "1, 16, 62"
    })
    @ParameterizedTest
    void divideAndMultiplyThousand(int num1, int num2, int expected) {
        DivideTwoNumbers solve = new DivideTwoNumbers();

        double result = solve.solution(num1, num2);

        assertThat(result).isEqualTo(expected);
    }
}
