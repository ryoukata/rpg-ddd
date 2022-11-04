package example.game.domain.equipment;

import example.game.domain.equipment.body.BodyWoodenArmor;
import example.game.domain.equipment.head.HeadWoodenHelmet;
import example.game.domain.equipment.leg.LegWoodenAromor;
import example.game.domain.equipment.weapon.WoodenWeapon;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquipmentTest {

    @Test
    public void should_equip_head() {
        final Equipment headEquipment = new HeadWoodenHelmet(EquipmentType.HEAD, 5);

        assertEquals("Head", headEquipment.equipmentType().getEquipmentType());
        assertEquals(5, headEquipment.equipmentValue());
    }

    @Test
    public void should_equip_body() {
        final Equipment bodyEquipment = new BodyWoodenArmor(EquipmentType.BODY, 5);

        assertEquals("Body", bodyEquipment.equipmentType().getEquipmentType());
        assertEquals(5, bodyEquipment.equipmentValue());
    }

    @Test
    public void should_equip_leg() {
        final Equipment legEquipment = new LegWoodenAromor(EquipmentType.LEG, 5);

        assertEquals("Leg", legEquipment.equipmentType().getEquipmentType());
        assertEquals(5, legEquipment.equipmentValue());
    }

    @Test
    public void should_equip_weapon() {
        final Equipment weaponEquipment = new WoodenWeapon(EquipmentType.WEAPON, 5);

        assertEquals("Weapon", weaponEquipment.equipmentType().getEquipmentType());
        assertEquals(5, weaponEquipment.equipmentValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_head_equipment_value() {
        final int ngEquipmentValue = -1;
        final Equipment ngAttackPower = new HeadWoodenHelmet(EquipmentType.HEAD, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_300_more_head_equipment_value() {
        final int ngEquipmentValue = 301;
        final Equipment ngAttackPower = new HeadWoodenHelmet(EquipmentType.HEAD, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_body_equipment_value() {
        final int ngEquipmentValue = -1;
        final Equipment ngAttackPower = new BodyWoodenArmor(EquipmentType.BODY, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_300_more_body_equipment_value() {
        final int ngEquipmentValue = 301;
        final Equipment ngAttackPower = new BodyWoodenArmor(EquipmentType.BODY, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_leg_equipment_value() {
        final int ngEquipmentValue = -1;
        final Equipment ngAttackPower = new LegWoodenAromor(EquipmentType.LEG, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_300_more_leg_equipment_value() {
        final int ngEquipmentValue = 301;
        final Equipment ngAttackPower = new LegWoodenAromor(EquipmentType.LEG, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_0_less_weapon_equipment_value() {
        final int ngEquipmentValue = -1;
        final Equipment ngAttackPower = new WoodenWeapon(EquipmentType.WEAPON, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_300_more_weapon_equipment_value() {
        final int ngEquipmentValue = 301;
        final Equipment ngAttackPower = new WoodenWeapon(EquipmentType.WEAPON, ngEquipmentValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_equip_head_exclude_head_type() {
        final Equipment ngEquipmentType = new HeadWoodenHelmet(EquipmentType.LEG, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_equip_body_exclude_body_type() {
        final Equipment ngEquipmentType = new BodyWoodenArmor(EquipmentType.LEG, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_equip_leg_exclude_leg_type() {
        final Equipment ngEquipmentType = new LegWoodenAromor(EquipmentType.WEAPON, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_equip_weapon_exclude_weapon_type() {
        final Equipment ngEquipmentType = new WoodenWeapon(EquipmentType.LEG, 5);
    }
}
