package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PrintAgeTest {

    @DisplayName("출생 연도를 반환한다.")
    @CsvSource({
            "40, 1983",
            "23, 2000"
    })
    @ParameterizedTest
    void printAge(int age, int expected) {
        PrintAge solve = new PrintAge();

        int result = solve.solution(age);

        assertThat(result).isEqualTo(expected);
    }
}
