package example.game.domain.equipment.leg;

import example.game.domain.equipment.Equipment;
import example.game.domain.equipment.EquipmentType;

/**
 * abstruct leg equipment class.
 */
abstract public class AbstructLegEquipment implements Equipment {

    /** equipment type */
    private final EquipmentType equipmentType;
    /** equipment value */
    private final int value;

    public AbstructLegEquipment(final EquipmentType equipmentType, final int value) {
        if (value < 0) {
            throw new IllegalArgumentException("must 0 or more leg equipment value: " + value);
        }
        if (value > 300) {
            throw new IllegalArgumentException("must 300 or less leg equipment value: " + value);
        }
        if (equipmentType != EquipmentType.LEG) {
            throw new IllegalArgumentException("Equipment Type must be Leg type." + equipmentType);
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
