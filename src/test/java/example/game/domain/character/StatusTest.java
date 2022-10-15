package example.game.domain.character;

import org.junit.Test;
import static org.junit.Assert.*;

public class StatusTest {

    @Test
    public void should_create_normal_status() {
        final Status.StatusValue statusValue = Status.StatusValue.NORMAL;
        final Status status = new Status(statusValue);

        assertEquals(statusValue, status.getStatus());
    }

    @Test
    public void should_create_pinch_status() {
        final Status.StatusValue statusValue = Status.StatusValue.PINCH;
        final Status status = new Status(statusValue);

        assertEquals(statusValue, status.getStatus());
    }

    @Test
    public void should_create_dying_status() {
        final Status.StatusValue statusValue = Status.StatusValue.DYING;
        final Status status = new Status(statusValue);

        assertEquals(statusValue, status.getStatus());
    }

    @Test
    public void should_change_status() {
        final Status.StatusValue statusValue = Status.StatusValue.NORMAL;
        final Status status = new Status(statusValue);

        final Status changedStatus = status.changeStatus(Status.StatusValue.PINCH);
        assertEquals(Status.StatusValue.PINCH, changedStatus.getStatus());
    }
}
