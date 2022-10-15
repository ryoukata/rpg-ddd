package example.game.domain.character;

import lombok.Data;

/**
 * Status class.
 */
@Data
public class Status {

    public enum StatusValue {
        NORMAL("Normal"),
        PINCH("Pinch"),
        DYING("Dying");

        private final String statusValue;
        StatusValue(final String status) {
            this.statusValue = status;
        }
    }

    /** player's status */
    private final StatusValue status;

    public Status(final StatusValue status) {
        if (status != StatusValue.NORMAL
                && status != StatusValue.PINCH
                && status != StatusValue.DYING) {
            throw new IllegalArgumentException("invalid status value: " + status);
        }
        this.status = status;
    }

    /** change player's Status */
    public Status changeStatus(StatusValue changedStatus) {
        return new Status(changedStatus);
    }
}
