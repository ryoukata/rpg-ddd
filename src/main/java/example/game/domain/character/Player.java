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

    public Player(final PlayerName playerName, final AttackPower attackPower, final DefensePower defensePower) {
        this.playerName = playerName;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

}
