package variable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VariableTest {

    @Test
    void givenIntegerVariable_whenAssigned_thenCorrect() {
        int num1 = 4;
        int num2 = 3;

        assertEquals(4, num1);
        assertEquals(3, num2);
    }

    @Test
    void givenTwoNumbers_whenAdded_thenSumIsCorrect() {
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        assertEquals(30, sum);
    }

    @Test
    void givenLongAndBoolean_whenInitialized_thenValuesAreCorrect() {
        long amount = 10_000_000_000L;
        boolean isTrue = true;

        assertEquals(10_000_000_000L, amount);
        assertTrue(isTrue);
    }
}
