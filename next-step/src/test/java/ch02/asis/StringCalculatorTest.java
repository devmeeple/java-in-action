package ch02.asis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    @DisplayName("빈 문자열이면 0을 반환한다")
    @Test
    void empty_returns_zero() {
        String text = " ";

        int result = StringCalculator.add(text);

        assertEquals(0, result);
    }

    @DisplayName("null이면 0을 반환한다")
    @Test
    void null_returns_zero() {
        String text = null;

        int result = StringCalculator.add(text);

        assertEquals(0, result);
    }

    @DisplayName("쉼표 구분자를 지원한다")
    @Test
    void comma_delimiter() {
        String text = "1,2";

        int result = StringCalculator.add(text);

        assertEquals(3, result);
    }

    @DisplayName("콜론 구분자를 지원한다")
    @Test
    void colon_delimiter() {
        String text = "1:2";

        int result = StringCalculator.add(text);

        assertEquals(3, result);
    }

    @DisplayName("쉼표와 콜론을 함께 사용할 수 있다")
    @Test
    void mixed_delimiters() {
        String text = "1,2:3";

        int result = StringCalculator.add(text);

        assertEquals(6, result);
    }

    @DisplayName("구분자 없이 숫자 하나면 해당 숫자를 반환한다")
    @Test
    void single_number() {
        String text = "1";

        int result = StringCalculator.add(text);

        assertEquals(1, result);
    }

    @DisplayName("커스텀 구분자를 지원한다")
    @Test
    void custom_delimiter() {
        String text = "//;\n1;2;3";

        int result = StringCalculator.add(text);

        assertEquals(6, result);
    }

    @DisplayName("음수를 포함하면 예외가 발생한다")
    @Test
    void negative_number_throw_exception() {
        String text = "1,-2,3";

        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add(text));
    }
}
