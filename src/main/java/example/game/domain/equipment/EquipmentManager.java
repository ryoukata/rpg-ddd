package example.game.domain.equipment;

import lombok.Data;

/**
 * Equipment Manager calss.
 */
@Data
public class EquipmentManager {

    /** Head Equipment */
    private final Equipment headEquipment;
    /** Body Equipment */
    private final Equipment bodyEquipment;
    /** Leg Equipment */
    private final Equipment legEquipment;
    /** Weapon Equipment */
    private final Equipment weaponEquipment;

    /** init */
    private EquipmentManager() {
        this.headEquipment = null;
        this.bodyEquipment = null;
        this.legEquipment = null;
        this.weaponEquipment = null;
    }
    /** args constructor */
    private EquipmentManager(final Equipment headEquipment,
                            final Equipment bodyEquipment,
                            final Equipment legEquipment,
                            final Equipment weaponEquipment) {
        this.headEquipment = headEquipment;
        this.bodyEquipment = bodyEquipment;
        this.legEquipment = legEquipment;
        this.weaponEquipment = weaponEquipment;
    }

    /**
     * init factory
     * @return EquipmentManager
     */
    public static EquipmentManager equipmentManagerFactory() {
        return new EquipmentManager();
    }

    /**
     * set equipment.
     * @param equipment equipment
     * @return EquipmentManager
     */
    public EquipmentManager equip(final Equipment equipment) {
        if (isHeadType(equipment)) {
            return new EquipmentManager(equipment, this.bodyEquipment, this.legEquipment, this.weaponEquipment);
        }
        if (isBodyType(equipment)) {
            return new EquipmentManager(this.headEquipment, equipment, this.legEquipment, this.weaponEquipment);
        }
        if (isLegType(equipment)) {
            return new EquipmentManager(this.headEquipment, this.bodyEquipment, equipment, this.weaponEquipment);
        }
        if (isWeaponType(equipment)) {
            return new EquipmentManager(this.headEquipment, this.bodyEquipment, this.legEquipment, equipment);
        }
        // 装備の変更がないことをメッセージで返すか？
        return this;
    }

    /**
     * take off equipment.
     * @param equipment equipment
     * @return EquipmentManager
     */
    public EquipmentManager takeOff(final Equipment equipment) {
        if (isHeadType(equipment)) {
            return new EquipmentManager(null, this.bodyEquipment, this.legEquipment, this.weaponEquipment);
        }
        if (isBodyType(equipment)) {
            return new EquipmentManager(this.headEquipment, null, this.legEquipment, this.weaponEquipment);
        }
        if (isLegType(equipment)) {
            return new EquipmentManager(this.headEquipment, this.bodyEquipment, null, this.weaponEquipment);
        }
        if (isWeaponType(equipment)) {
            return new EquipmentManager(this.headEquipment, this.bodyEquipment, this.legEquipment, null);
        }
        return null;
    }

    /**
     * check head equipment type.
     * @param equipment equipment
     * @return boolean
     */
    private boolean isHeadType(final Equipment equipment) {
        return equipment.equipmentType() == EquipmentType.HEAD;
    }

    /**
     * check body equipment type.
     * @param equipment equipment
     * @return boolean
     */
    private boolean isBodyType(final Equipment equipment) {
        return equipment.equipmentType() == EquipmentType.BODY;
    }

    /**
     * check leg equipment type.
     * @param equipment equipment
     * @return boolean
     */
    private boolean isLegType(final Equipment equipment) {
        return equipment.equipmentType() == EquipmentType.LEG;
    }

    /**
     * check weapon equipment type.
     * @param equipment equipment
     * @return boolean
     */
    private boolean isWeaponType(final Equipment equipment) {
        return equipment.equipmentType() == EquipmentType.WEAPON;
    }
}
