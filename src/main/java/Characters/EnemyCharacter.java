package Characters;

import Attributes.ArmorClassRating;
import Attributes.CharacterAttributes;
import Inventory.Item;
import Passive.Passive;
import Skills.Skill;
import Spell.Spell;
import StatusEffect.StatusEffect;
import WeaponsAndArmor.Weapon;

import java.util.List;

public class EnemyCharacter {
    String name;
    String enemyType;
    CharacterAttributes characterAttributes;
    ArmorClassRating armorClassRating;
    Weapon currentlyEquippedWeapon;
    StatusEffect statusEffect;
    List<Spell> spellList;
    List<Skill> skillList;
    List<Passive> passiveList;
    List<Item> possibleDrops;
    int currentHp;
    int maxHp;
    int xpWorth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public CharacterAttributes getCharacterAttributes() {
        return characterAttributes;
    }

    public void setCharacterAttributes(CharacterAttributes characterAttributes) {
        this.characterAttributes = characterAttributes;
    }

    public ArmorClassRating getArmorClassRating() {
        return armorClassRating;
    }

    public void setArmorClassRating(ArmorClassRating armorClassRating) {
        this.armorClassRating = armorClassRating;
    }

    public Weapon getCurrentlyEquippedWeapon() {
        return currentlyEquippedWeapon;
    }

    public void setCurrentlyEquippedWeapon(Weapon currentlyEquippedWeapon) {
        this.currentlyEquippedWeapon = currentlyEquippedWeapon;
    }

    public StatusEffect getStatusEffect() {
        return statusEffect;
    }

    public void setStatusEffect(StatusEffect statusEffect) {
        this.statusEffect = statusEffect;
    }

    public List<Spell> getSpellList() {
        return spellList;
    }

    public void setSpellList(List<Spell> spellList) {
        this.spellList = spellList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Passive> getPassiveList() {
        return passiveList;
    }

    public void setPassiveList(List<Passive> passiveList) {
        this.passiveList = passiveList;
    }

    public List<Item> getPossibleDrops() {
        return possibleDrops;
    }

    public void setPossibleDrops(List<Item> possibleDrops) {
        this.possibleDrops = possibleDrops;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getXpWorth() {
        return xpWorth;
    }

    public void setXpWorth(int xpWorth) {
        this.xpWorth = xpWorth;
    }
}
