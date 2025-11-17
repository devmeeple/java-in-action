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

    @DisplayName("One Spare: 첫 프레임 스페어(5,5) 후 3점 투구 시 총점은 16점이다.")
    @Test
    void oneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);

        assertThat(game.getScore()).isEqualTo(16);
    }

    @DisplayName("One Strike: 첫 프레임 스트라이크 후 3점, 4점 투구 시 총점은 24점이다.")
    @Test
    void oneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);

        assertThat(game.getScore()).isEqualTo(24);
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
}
