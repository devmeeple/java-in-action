package operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperatorTest {

    @Test
    void sumAndAverageOfThreeIntegers_ShouldBeCorrect() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        assertEquals(60, sum);
        assertEquals(20, average);
    }

    @Test
    void sumAndAverageOfThreeDoubles_ShouldBeCorrect() {
        double num1 = 1.5;
        double num2 = 2.5;
        double num3 = 3.5;

        double sum = num1 + num2 + num3;
        double average = sum / 3;

        assertEquals(7.5, sum);
        assertEquals(2.5, average);
    }

    @Test
    void scoreWithinPassingRange_ShouldReturnTrue() {
        int score = 80;

        boolean result = score >= 80 && score <= 100;

        assertTrue(result);
    }
}
