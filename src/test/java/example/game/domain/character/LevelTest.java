package example.game.domain.character;

import org.junit.Test;
import static org.junit.Assert.*;

public class LevelTest {

    @Test
    public void should_create_level() {
        final int levelValue = 0;

        final Level level = new Level(levelValue);
        assertEquals(levelValue, level.getLevel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_level_value() {
        final int ngLevelValue = -1;
        final Level ngLevel = new Level(ngLevelValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_999_more_level_value() {
        final int ngLevelValue = 1000;
        final Level ngLevel = new Level(ngLevelValue);
    }

    @Test
    public void should_count_up_level() {
        final int levelValue = 0;
        final Level level = new Level(levelValue);
        final Level upLevel = level.levelUp();
        assertEquals(1, upLevel.getLevel());
    }
}
