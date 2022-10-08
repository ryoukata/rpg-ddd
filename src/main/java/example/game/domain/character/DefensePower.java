package example.game.domain.character;

import lombok.Data;

/**
 * Defense Power class.
 */
@Data
public class DefensePower {

    /** defense power value */
    private int defensePower;

    public DefensePower(final int defensePower) {
        if (defensePower < 0) {
            throw new IllegalArgumentException("must 0 or more defense power value: " + defensePower);
        }
        if (defensePower > 999) {
            throw new IllegalArgumentException("must 999 or less defense power value: " + defensePower);
        }
        this.defensePower = defensePower;
    }

    /**
     * change defense power
     * @param newDefensePower new defense power
     * @return DefensePower changed defense power
     */
    public DefensePower changeDefensePower(final int newDefensePower) {
        return new DefensePower(newDefensePower);
    }
}
