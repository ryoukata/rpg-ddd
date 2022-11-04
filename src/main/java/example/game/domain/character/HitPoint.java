package example.game.domain.character;

import lombok.Data;

/**
 * Hit Point class.
 */
@Data
public class HitPoint {

    /** hit point */
    private final int hitPoint;

    private HitPoint() {
        this.hitPoint = 20;
    }

    private HitPoint(final int hitPoint) {
        if (hitPoint < 0) {
            throw new IllegalArgumentException("must 0 or more hit point value: " + hitPoint);
        }
        if (hitPoint > 999) {
            throw new IllegalArgumentException("must 999 or less hit point value: " + hitPoint);
        }
        this.hitPoint = hitPoint;
    }

    /**
     * hit point factory.
     */
    public static HitPoint hitPointFactory() {
        return new HitPoint();
    }

    /**
     * recover hit point.
     * @param recoveryValue recovery value
     * @return HitPoint
     */
    public HitPoint recover(final int recoveryValue) {
        return new HitPoint(this.hitPoint + recoveryValue);
    }

    /**
     * damage hit point.
     * @param damageValue damage value
     * @return HitPoint
     */
    public HitPoint damage(final int damageValue) {
        return new HitPoint(this.hitPoint - damageValue);
    }

}
