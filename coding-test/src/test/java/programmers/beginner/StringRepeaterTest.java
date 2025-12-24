package programmers.beginner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringRepeaterTest {

    @DisplayName("주어진 정수 만큼 문자를 반복한다.")
    @Test
    void solution() {
        StringRepeater solve = new StringRepeater();
        String my_string = "hello";
        int n = 3;

        String result = solve.solution(my_string, n);

        assertThat(result).isEqualTo("hhheeellllllooo");
    }
}
