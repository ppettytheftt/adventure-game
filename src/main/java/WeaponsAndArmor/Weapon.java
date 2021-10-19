package WeaponsAndArmor;


import Inventory.Money;

public class Weapon {
    String name;
    MagicEffect magicEffect;
    boolean affectsCharacterAttributes;
    String weaponType;
    Money value;
    Dice damageDice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MagicEffect getMagicEffect() {
        return magicEffect;
    }

    public void setMagicEffect(MagicEffect magicEffect) {
        this.magicEffect = magicEffect;
    }

    public boolean isAffectsCharacterAttributes() {
        return affectsCharacterAttributes;
    }

    public void setAffectsCharacterAttributes(boolean affectsCharacterAttributes) {
        this.affectsCharacterAttributes = affectsCharacterAttributes;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(Money value) {
        this.value = value;
    }

    public Dice getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(Dice damageDice) {
        this.damageDice = damageDice;
    }
}
