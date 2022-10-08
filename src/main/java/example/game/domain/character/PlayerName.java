package example.game.domain.character;

import lombok.Data;

/**
 * PlayerName class in RPG Game.
 */
@Data
public class PlayerName {

    /** player name */
    private final String playerName;

    public PlayerName(final String playerName) {
        if (playerName.length() < 3) {
            throw new IllegalArgumentException("must 3 or more characters name: " + playerName);
        }
        if (playerName.length() > 20) {
            throw new IllegalArgumentException("must 20 characters or less name: " + playerName);
        }
        this.playerName = playerName;
    }

    /**
     * change Player name
     * @param newName new player name
     * @return PlayerName changed playerName
     */
    public PlayerName changePlayerName(final String newName) {
        return new PlayerName(newName);
    }
}
