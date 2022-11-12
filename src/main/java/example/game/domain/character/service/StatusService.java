package example.game.domain.character.service;

import example.game.domain.character.HitPoint;
import example.game.domain.character.Status;

/**
 * Status Service class.
 */
public class StatusService {

    /** player's status */
    private final Status status;
    /** player's hit point */
    private final HitPoint hitPoint;

    public StatusService(final Status status, final HitPoint hitPoint) {
        this.status = status;
        this.hitPoint = hitPoint;
    }

    /**
     * change status for hit point.
     */
    public Status changeStatusForHitPoint() {
        final long remain20percentHitpoint = Math.round(hitPoint.getMaxHitPoint() * 0.2);
        if (hitPoint.getCurrentHitPoint() <= 0) {
            return status.changeStatus(Status.StatusValue.DYING);
        }
        if (hitPoint.getCurrentHitPoint() > remain20percentHitpoint) {
            return status.changeStatus(Status.StatusValue.NORMAL);
        }
        if (hitPoint.getCurrentHitPoint() < remain20percentHitpoint) {
            return status.changeStatus(Status.StatusValue.PINCH);
        }
        return  null;
    }
}
