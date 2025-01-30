package cond;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Conditional2Test {

    // TODO: 2025.01.30 suggest vs. recommend
    @Test
    void recommendMovieFor_Rating_ShouldBeCorrect() {
        double rating = 7.1;

        String result = recommendMovieFor(rating);

        assertEquals("어바웃타임, 토이 스토리", result);
    }

    private String recommendMovieFor(double rating) {
        List<String> movies = new ArrayList<>();

        if (rating <= 9) {
            movies.add("어바웃타임");
        }
        if (rating <= 8) {
            movies.add("토이 스토리");
        }
        if (rating <= 7) {
            movies.add("고질라");
        }

        return String.join(", ", movies);
    }

    @ParameterizedTest
    @CsvSource({
            "A, 탁월한 성과",
            "B, 좋은 성과",
            "C, 준수한 성과",
            "D, 향상 필요",
            "F, 불합격",
    })
    void getAchievementFor_Grade_ShouldBeCorrect(String grade, String expected) {
        String result = getAchievementFor(grade);

        assertEquals(expected, result);
    }

    @Test
    void getAchievementFor_Rating_ShouldThrowException() {
        String invalidRating = "G";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> getAchievementFor(invalidRating));

        assertEquals("잘못된 학점", exception.getMessage());
    }

    private String getAchievementFor(String grade) {
        return switch (grade) {
            case "A" -> "탁월한 성과";
            case "B" -> "좋은 성과";
            case "C" -> "준수한 성과";
            case "D" -> "향상 필요";
            case "F" -> "불합격";
            default -> throw new IllegalArgumentException("잘못된 학점");
        };
    }

    @Test
    void givenIntegers_whenUsingTernaryOperator_thenReturnBoolean() {
        int a = 10;
        int b = 20;

        int result = (a > b) ? a : b;

        assertEquals(20, result);
    }

    @Test
    void givenEvenNumber_whenUsingTernaryOperator_thenReturnTrue() {
        int x = 2;

        boolean result = (x % 2 == 0) ? true : false;

        assertTrue(result);
    }

    @Test
    void givenOddNumber_whenUsingTernaryOperator_thenReturnFalse() {
        int x = 3;

        boolean result = (x % 2 == 0) ? true : false;

        assertFalse(result);
    }
}
