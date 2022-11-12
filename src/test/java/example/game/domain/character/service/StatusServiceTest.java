package example.game.domain.character.service;

import example.game.domain.character.HitPoint;
import example.game.domain.character.Status;
import org.junit.Test;
import static org.junit.Assert.*;import static org.junit.Assert.*;

public class StatusServiceTest {

    @Test
    public void should_create_status_serivce() {
        final Status status = new Status(Status.StatusValue.NORMAL);
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final StatusService statusService = new StatusService(status, hitPoint);

        assertNotNull(statusService);
    }

    @Test
    public void should_be_normal_status_when_hitpoint_more_20_percent() {
        final Status status = new Status(Status.StatusValue.NORMAL);
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final StatusService statusService = new StatusService(status, hitPoint);

        final Status changedStatus = statusService.changeStatusForHitPoint();
        assertEquals(Status.StatusValue.NORMAL, changedStatus.getStatus());
    }

    @Test
    public void should_be_pinch_status_when_hitpoint_less_20_percent() {
        final Status status = new Status(Status.StatusValue.NORMAL);
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final HitPoint pinchHitPoint = hitPoint.damage(18);
        final StatusService statusService = new StatusService(status, pinchHitPoint);

        final Status changedStatus = statusService.changeStatusForHitPoint();
        assertEquals(Status.StatusValue.PINCH, changedStatus.getStatus());
    }

    @Test
    public void should_be_dying_status_when_hitpoint_is_0() {
        final Status status = new Status(Status.StatusValue.NORMAL);
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final HitPoint dyingHitPoint = hitPoint.damage(20);
        final StatusService statusService = new StatusService(status, dyingHitPoint);

        final Status changedStatus = statusService.changeStatusForHitPoint();
        assertEquals(Status.StatusValue.DYING, changedStatus.getStatus());
    }
}
