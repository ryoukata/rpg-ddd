package example.game.domain.equipment.weapon;

import example.game.domain.equipment.Equipment;
import example.game.domain.equipment.EquipmentType;

/**
 * abstruct weapon equipment class.
 */
abstract public class AbstructWeaponEquipment implements Equipment {

    /** equipment type */
    private final EquipmentType equipmentType;
    /** equipment value */
    private final int value;

    public AbstructWeaponEquipment(final EquipmentType equipmentType, final int value) {
        if (value < 0) {
            throw new IllegalArgumentException("must 0 or more weapon equipment value: " + value);
        }
        if (value > 300) {
            throw new IllegalArgumentException("must 300 or less weapon equipment value: " + value);
        }
        if (equipmentType != EquipmentType.WEAPON) {
            throw new IllegalArgumentException("Equipment Type must be Weapon type." + equipmentType);
        }
        this.equipmentType = equipmentType;
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int equipmentValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EquipmentType equipmentType() {
        return this.equipmentType;
    }
}
