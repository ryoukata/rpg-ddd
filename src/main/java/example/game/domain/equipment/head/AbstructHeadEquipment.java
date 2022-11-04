package example.game.domain.equipment.head;

import example.game.domain.equipment.Equipment;
import example.game.domain.equipment.EquipmentType;

/**
 * abstruct head equipment class.
 */
abstract public class AbstructHeadEquipment implements Equipment {

    /** equipment type */
    private final EquipmentType equipmentType;
    /** equipment value */
    private final int value;

    public AbstructHeadEquipment(final EquipmentType equipmentType, final int value) {
        if (value < 0) {
            throw new IllegalArgumentException("must 0 or more head equipment value: " + value);
        }
        if (value > 300) {
            throw new IllegalArgumentException("must 300 or less head equipment value: " + value);
        }
        if (equipmentType != EquipmentType.HEAD) {
            throw new IllegalArgumentException("Equipment Type must be Head type." + equipmentType);
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
