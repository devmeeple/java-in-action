package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingGameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @DisplayName("Gutter Game: 모든 투구가 0점인 경우, 최종 점수는 0점이다.")
    @Test
    void gutterGame() {
        rollMany(20, 0);

        assertThat(game.getScore()).isEqualTo(0);
    }

    @DisplayName("All Ones: 모든 투구가 1점인 경우, 최종 점수는 20점이다.")
    @Test
    void allOnes() {
        rollMany(20, 1);

        assertThat(game.getScore()).isEqualTo(20);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
}
