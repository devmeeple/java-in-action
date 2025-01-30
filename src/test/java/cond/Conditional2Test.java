package cond;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
