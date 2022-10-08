package example.game.domain.character;

import static org.junit.Assert.*;
import org.junit.Test;

public class AttackPowerTest {

    @Test
    public void should_create_attack_power() {
        final int attackPowerValue = 5;
        final AttackPower attackPower = new AttackPower(attackPowerValue);

        assertEquals(attackPowerValue, attackPower.getAttackPower());
    }

    @Test
    public void should_change_attack_power() {
        final int attackPowerValue = 5;
        final AttackPower attackPower = new AttackPower(attackPowerValue);

        final int newAttackPowerValue = 10;
        final AttackPower newAttackPowerPlayer = attackPower.changeAttackPower(newAttackPowerValue);
        assertEquals(newAttackPowerValue, newAttackPowerPlayer.getAttackPower());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_attack_power_value() {
        final int ngAttackPowerValue = -1;
        final AttackPower ngAttackPower = new AttackPower(ngAttackPowerValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_999_more_attack_power_value() {
        final int ngAttackPowerValue = 1000;
        final AttackPower ngAttackPower = new AttackPower(ngAttackPowerValue);
    }
}
