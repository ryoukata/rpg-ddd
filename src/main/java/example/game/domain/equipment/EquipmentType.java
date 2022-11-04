package example.game.domain.equipment;

/**
 * EquipmentType enum.
 */
public enum EquipmentType {

    /** head */
    HEAD("Head"),
    /** body */
    BODY("Body"),
    /** leg */
    LEG("Leg"),
    /** weapon */
    WEAPON("Weapon"),
    ;

    private String equipmentType;

    EquipmentType(final String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }
}
