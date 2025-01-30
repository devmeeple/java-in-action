package cond;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        switch (grade) {
            case "A":
                return "탁월한 성과";
            case "B":
                return "좋은 성과";
            case "C":
                return "준수한 성과";
            case "D":
                return "향상 필요";
            case "F":
                return "불합격";
            default:
                throw new IllegalArgumentException("잘못된 학점");
        }
    }
}
