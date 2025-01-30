package cond;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @ParameterizedTest
    @ValueSource(ints = {-1, 101})
    void calculateGradeFor_NegativeScore_ShouldThrowException(int invalidStudentScore) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculateGradeFor(invalidStudentScore));

        assertEquals("유효한 점수가 아닙니다. 다시 확인 바랍니다", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 도보",
            "10, 자전거",
            "100, 자동차",
            "101, 비행기"
    })
    void selectVehicleFor_Distance_ShouldReturnExpectedVehicle(int distance, String expectedVehicle) {
        String result = selectVehicleFor(distance);

        assertEquals(expectedVehicle, result);
    }

    private String calculateGradeFor(int studentScore) {
        if (studentScore < 0 || studentScore > 100) {
            throw new IllegalArgumentException("유효한 점수가 아닙니다. 다시 확인 바랍니다");
        }

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

    // TODO: 2025.01.30 다형성, 값 Enum, 예외
    private String selectVehicleFor(int distance) {
        if (distance <= 1) {
            return "도보";
        }
        if (distance <= 10) {
            return "자전거";
        }
        if (distance <= 100) {
            return "자동차";
        }

        return "비행기";
    }
}
