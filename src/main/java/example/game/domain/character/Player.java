package example.game.domain.character;

import example.game.domain.equipment.EquipmentManager;
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
    /** player's experience point */
    private final ExperiencePoint experiencePoint;
    /** player's equipment manager */
    private final EquipmentManager equipmentManager;
    /** player's hit point */
    private final HitPoint hitPoint;

    public Player(final PlayerName playerName, final AttackPower attackPower, final DefensePower defensePower,
                  final Level level, final Status status, final ExperiencePoint experiencePoint,
                  final EquipmentManager equipmentManager, final HitPoint hitPoint) {
        this.playerName = playerName;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.level = level;
        this.status = status;
        this.experiencePoint = experiencePoint;
        this.equipmentManager = equipmentManager;
        this.hitPoint = hitPoint;
    }

}
