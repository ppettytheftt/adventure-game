package Characters;

import Attributes.ArmorClassRating;
import Attributes.CharacterAttributes;
import CharacterClasses.CharacterClass;
import Inventory.Inventory;
import Passive.Passive;
import Skills.Skill;
import Spell.Spell;
import StatusEffect.StatusEffect;
import WeaponsAndArmor.Weapon;

import java.util.List;


public class PlayerCharacter {
    String name;
    CharacterClass characterClass;
    CharacterAttributes characterAttributes;
    ArmorClassRating armorClassRating;
    Weapon currentlyEquippedWeapon;
    StatusEffect statusEffect;
    List<Spell> spellList;
    List<Skill> skillList;
    List<Passive> passiveList;
    Inventory inventory;
    int currentHp;
    int maxHp;
    int xp;
    int currentLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
}
