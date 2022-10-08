package example.game.domain.character;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefensePowerTest {

    @Test
    public void should_create_defense_power() {
        final int defensePowerValue = 5;
        final DefensePower defensePower = new DefensePower(defensePowerValue);

        assertEquals(defensePowerValue, defensePower.getDefensePower());
    }

    @Test
    public void should_change_defense_power() {
        final int defensePowerValue = 5;
        final DefensePower defensePower = new DefensePower(defensePowerValue);

        final int newDefensePowerValue = 10;
        final DefensePower newDefensePowerPlayer = defensePower.changeDefensePower(newDefensePowerValue);
        assertEquals(newDefensePowerValue, newDefensePowerPlayer.getDefensePower());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_defense_power_value() {
        final int ngDefensePowerValue = -1;
        final DefensePower defensePower = new DefensePower(ngDefensePowerValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_999_more_attack_power_value() {
        final int ngDefensePowerValue = 1000;
        final DefensePower defensePower = new DefensePower(ngDefensePowerValue);
    }
}
