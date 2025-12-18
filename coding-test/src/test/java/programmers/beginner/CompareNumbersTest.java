package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompareNumbersTest {

    @DisplayName("두 수가 같다면 1을 반환한다.")
    @Test
    void compareEqual() {
        CompareNumbers solve = new CompareNumbers();
        int num1 = 11;
        int num2 = 11;

        int result = solve.solution(num1, num2);

        assertThat(result).isEqualTo(1);
    }

    @DisplayName("두 수가 같지 않다면 -1을 반환한다.")
    @Test
    void compareUnequal() {
        CompareNumbers solve = new CompareNumbers();
        int num1 = 2;
        int num2 = 3;

        int result = solve.solution(num1, num2);

        assertThat(result).isEqualTo(-1);
    }
}
