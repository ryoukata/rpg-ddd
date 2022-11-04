package example.game.domain.equipment.body;

import example.game.domain.equipment.Equipment;
import example.game.domain.equipment.EquipmentType;

/**
 * abstruct body equipment class.
 */
abstract public class AbstructBodyEquipment implements Equipment {

    /** equipment type */
    private final EquipmentType equipmentType;
    /** equipment value */
    private final int value;

    public AbstructBodyEquipment(final EquipmentType equipmentType, final int value) {
        if (value < 0) {
            throw new IllegalArgumentException("must 0 or more body equipment value: " + value);
        }
        if (value > 300) {
            throw new IllegalArgumentException("must 300 or less body equipment value: " + value);
        }
        if (equipmentType != EquipmentType.BODY) {
            throw new IllegalArgumentException("Equipment Type must be Body type." + equipmentType);
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
