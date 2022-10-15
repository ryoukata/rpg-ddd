package example.game.domain.character;

import lombok.Data;

/**
 * Player class in RPG Game.
 */
@Data
public class Player {
    /** player name */
    private final PlayerName playerName;
    /** attack power */
    private final AttackPower attackPower;
    /** deffense power */
    private final DefensePower defensePower;
    /** player's level */
    private final Level level;
    /** player's status */
    private final Status status;

    public Player(final PlayerName playerName, final AttackPower attackPower, final DefensePower defensePower,
                  final Level level, final Status status) {
        this.playerName = playerName;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.level = level;
        this.status = status;
    }

}
