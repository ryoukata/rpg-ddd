package example.game.domain.character;

import org.junit.Test;
import static org.junit.Assert.*;import static org.junit.Assert.*;

public class HitPointTest {

    @Test
    public void should_create_hitpoint_init_factory() {
        final HitPoint hitPoint = HitPoint.hitPointFactory();

        assertEquals(20, hitPoint.getHitPoint());
    }

    @Test
    public void should_recover_hit_point_value() {
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final HitPoint recoveredHitPoint = hitPoint.recover(10);

        assertEquals(30, recoveredHitPoint.getHitPoint());
    }

    @Test
    public void should_damage_hit_point_value() {
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final HitPoint damagedHitPoint = hitPoint.damage(10);

        assertEquals(10, damagedHitPoint.getHitPoint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_set_0_less_hit_point_value_to_damage() {
        final int damageValue = 21;
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final HitPoint ngHitPoint = hitPoint.damage(damageValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_999_more_hit_point_value_to_recover() {
        final int recoveryValue = 980;
        final HitPoint hitPoint = HitPoint.hitPointFactory();
        final HitPoint ngHitPoint = hitPoint.recover(recoveryValue);
    }
}
