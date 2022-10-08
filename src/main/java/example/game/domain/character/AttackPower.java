package example.game.domain.character;

import lombok.Data;

/**
 * Attack Power class.
 */
@Data
public class AttackPower {

    /** attack power value */
    private final int attackPower;

    public AttackPower(final int attackPower) {
        if (attackPower < 0) {
            throw new IllegalArgumentException("must 0 or more attack power value: " + attackPower);
        }
        if (attackPower > 999) {
            throw new IllegalArgumentException("must 999 or less attack power value: " + attackPower);
        }
        this.attackPower = attackPower;
    }

    /**
     * change attack power
     * @param newAttackPower new attack power
     * @return AttackPower changed AttackPower
     */
    public AttackPower changeAttackPower(final int newAttackPower) {
        return new AttackPower(newAttackPower);
    }
}
