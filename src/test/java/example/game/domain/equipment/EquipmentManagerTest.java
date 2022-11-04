package example.game.domain.equipment;

import example.game.domain.equipment.body.BodyWoodenArmor;
import example.game.domain.equipment.head.HeadWoodenHelmet;
import example.game.domain.equipment.leg.LegWoodenAromor;
import example.game.domain.equipment.weapon.WoodenWeapon;
import org.junit.Test;
import static org.junit.Assert.*;import static org.junit.Assert.*;

public class EquipmentManagerTest {

    @Test
    public void should_create_equip_manager() {
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory();
        assertNotNull(equipmentManager);
    }

    @Test
    public void should_equip_head() {
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory();
        final Equipment headEquipment = new HeadWoodenHelmet(EquipmentType.HEAD, 5);
        final EquipmentManager equipmentedManager = equipmentManager.equip(headEquipment);

        assertSame(headEquipment, equipmentedManager.getHeadEquipment());
    }

    @Test
    public void should_equip_body() {
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory();
        final Equipment bodyEquipment = new BodyWoodenArmor(EquipmentType.BODY, 5);
        final EquipmentManager equipmentedManager = equipmentManager.equip(bodyEquipment);

        assertSame(bodyEquipment, equipmentedManager.getBodyEquipment());
    }

    @Test
    public void should_equip_leg() {
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory();
        final Equipment legEquipment = new LegWoodenAromor(EquipmentType.LEG, 5);
        final EquipmentManager equipmentedManager = equipmentManager.equip(legEquipment);

        assertSame(legEquipment, equipmentedManager.getLegEquipment());
    }

    @Test
    public void should_equip_weapon() {
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory();
        final Equipment weaponEquipment = new WoodenWeapon(EquipmentType.WEAPON, 5);
        final EquipmentManager equipmentedManager = equipmentManager.equip(weaponEquipment);

        assertSame(weaponEquipment, equipmentedManager.getWeaponEquipment());
    }

    @Test
    public void should_take_off_head() {
        final Equipment headEquipment = new HeadWoodenHelmet(EquipmentType.HEAD, 5);
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory().equip(headEquipment);
        assertSame(headEquipment, equipmentManager.getHeadEquipment());

        final EquipmentManager takeOffEquipmentManager = equipmentManager.takeOff(equipmentManager.getHeadEquipment());
        assertNull(takeOffEquipmentManager.getHeadEquipment());
    }

    @Test
    public void should_take_off_body() {
        final Equipment bodyEquipment = new BodyWoodenArmor(EquipmentType.BODY, 5);
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory().equip(bodyEquipment);
        assertSame(bodyEquipment, equipmentManager.getBodyEquipment());

        final EquipmentManager takeOffEquipmentManager = equipmentManager.takeOff(equipmentManager.getBodyEquipment());
        assertNull(takeOffEquipmentManager.getBodyEquipment());
    }

    @Test
    public void should_take_off_leg() {
        final Equipment legEquipment = new LegWoodenAromor(EquipmentType.LEG, 5);
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory().equip(legEquipment);
        assertSame(legEquipment, equipmentManager.getLegEquipment());

        final EquipmentManager takeOffEquipmentManager = equipmentManager.takeOff(equipmentManager.getLegEquipment());
        assertNull(takeOffEquipmentManager.getLegEquipment());
    }

    @Test
    public void should_take_off_weapon() {
        final Equipment weaponEquipment = new WoodenWeapon(EquipmentType.WEAPON, 5);
        final EquipmentManager equipmentManager = EquipmentManager.equipmentManagerFactory().equip(weaponEquipment);
        assertSame(weaponEquipment, equipmentManager.getWeaponEquipment());

        final EquipmentManager takeOffEquipmentManager = equipmentManager.takeOff(equipmentManager.getWeaponEquipment());
        assertNull(takeOffEquipmentManager.getWeaponEquipment());
    }
}
