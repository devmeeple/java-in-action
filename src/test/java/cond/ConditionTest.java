package cond;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: 2025.01.30 https://www.baeldung.com/parameterized-tests-junit-5
class ConditionTest {

    @ParameterizedTest
    @CsvSource({
            "90, A",
            "89, B",
            "79, C",
            "69, D",
            "59, F"
    })
    void calculateGradeFor_ShouldReturnExpectedGrade(int studentScore, String expectedGrade) {
        String result = calculateGradeFor(studentScore);
        assertEquals(expectedGrade, result);
    }

    private String calculateGradeFor(int studentScore) {
        if (studentScore >= 90) {
            return "A";
        }
        if (studentScore >= 80) {
            return "B";
        }
        if (studentScore >= 70) {
            return "C";
        }
        if (studentScore >= 60) {
            return "D";
        }
        return "F";
    }
}
