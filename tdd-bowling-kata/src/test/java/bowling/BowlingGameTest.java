package bowling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BowlingGameTest {

    @DisplayName("Gutter Game: 모든 투구가 0점인 경우, 최종 점수는 0점이다.")
    @Test
    void gutterGame() {
        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertThat(game.getScore()).isEqualTo(0);
    }

    @DisplayName("All Ones: 20번의 모든 투구가 1점인 경우, 최종 점수는 20점이다.")
    @Test
    void allOnes() {
        Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }

        assertThat(game.getScore()).isEqualTo(20);
    }
}
