package example.game.domain.character;

import lombok.Data;

/**
 * Hit Point class.
 */
@Data
public class HitPoint {

    /** max hit point */
    private final int maxHitPoint;
    /** current hit point */
    private final int currentHitPoint;


    private HitPoint() {
        this.maxHitPoint = 20;
        this.currentHitPoint = 20;
    }

    private HitPoint(final int maxHitPoint, final int currentHitPoint) {
        if (currentHitPoint < 0) {
            throw new IllegalArgumentException("must 0 or more hit point value: " + currentHitPoint);
        }
        if (currentHitPoint > 999) {
            throw new IllegalArgumentException("must 999 or less hit point value: " + currentHitPoint);
        }
        this.maxHitPoint = maxHitPoint;
        this.currentHitPoint = currentHitPoint;
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
        int recoveriedHitPoint = this.currentHitPoint + recoveryValue;
        if (recoveriedHitPoint >= this.maxHitPoint) {
            recoveriedHitPoint = this.maxHitPoint;
        }
        return new HitPoint(this.maxHitPoint, recoveriedHitPoint);
    }

    /**
     * damage hit point.
     * @param damageValue damage value
     * @return HitPoint
     */
    public HitPoint damage(final int damageValue) {
        int damagedHitPoint = this.currentHitPoint - damageValue;
        if (damagedHitPoint <= 0) {
            damagedHitPoint = 0;
        }
        return new HitPoint(this.maxHitPoint, damagedHitPoint);
    }

}
