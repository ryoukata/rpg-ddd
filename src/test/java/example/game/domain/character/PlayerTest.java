package example.game.domain.character;

import example.game.domain.equipment.Equipment;
import example.game.domain.equipment.EquipmentManager;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void should_create_player() {
        final PlayerName playerName = new PlayerName("player1");
        final AttackPower attackPower = new AttackPower(5);
        final DefensePower defensePower = new DefensePower(5);
        final Level level = new Level(0);
        final Status status = new Status(Status.StatusValue.NORMAL);
        final ExperiencePoint experiencePoint = new ExperiencePoint(0);
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory();
        final HitPoint hitPoint = HitPoint.hitPointFactory();

        final Player player = new Player(playerName, attackPower, defensePower, level, status, experiencePoint, equipmentManager, hitPoint);
        assertEquals(playerName.getPlayerName(), player.getPlayerName().getPlayerName());
        assertEquals(attackPower.getAttackPower(), player.getAttackPower().getAttackPower());
        assertEquals(defensePower.getDefensePower(), player.getDefensePower().getDefensePower());
        assertEquals(level.getLevel(), player.getLevel().getLevel());
        assertEquals(status.getStatus(), player.getStatus().getStatus());
        assertEquals(experiencePoint.getExperiencePoint(), player.getExperiencePoint().getExperiencePoint());
        assertSame(equipmentManager, player.getEquipmentManager());
        assertSame(hitPoint, player.getHitPoint());
    }

}
