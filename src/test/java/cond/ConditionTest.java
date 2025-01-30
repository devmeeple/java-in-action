package cond;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    // TODO: 2025.01.30 Parameterized
    @Test
    void calculateGradeFor_90_ShouldBeA() {
        int studentScore = 90;

        String result = calculateGradeFor(studentScore);

        assertEquals("A", result);
    }

    @Test
    void calculateGradeFor_89_ShouldBeB() {
        int studentScore = 89;

        String result = calculateGradeFor(studentScore);

        assertEquals("B", result);
    }

    @Test
    void calculateGradeFor_79_ShouldBeC() {
        int studentScore = 79;

        String result = calculateGradeFor(studentScore);

        assertEquals("C", result);
    }

    @Test
    void calculateGradeFor_69_ShouldBeD() {
        int studentScore = 69;

        String result = calculateGradeFor(studentScore);

        assertEquals("D", result);
    }

    @Test
    void calculateGradeFor_59_ShouldBeF() {
        int studentScore = 59;

        String result = calculateGradeFor(studentScore);

        assertEquals("F", result);
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
