package example.game.domain.character;

import lombok.Data;

/**
 * Level class.
 */
@Data
public class Level {

    /** Level value */
    private final int level;

    /** default count about level up */
    private final int DEFAULT_LEVEL_UP_COUNT = 1;

    public Level(final int level) {
        if (level < 0) {
            throw new IllegalArgumentException("must 0 or more level value:" + level);
        }
        if (level > 999) {
            throw new IllegalArgumentException("must 999 or less level value: " + level);
        }
        this.level = level;
    }

    /**
     * count up 1 level.
     * @return Level up 1 level.
     */
    public Level levelUp() {
        return new Level(this.level + DEFAULT_LEVEL_UP_COUNT);
    }
}
