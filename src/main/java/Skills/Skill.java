package Skills;

import Attributes.CharacterAttributes;
import Gamelogic.Dice;
import Story.StoryElement;

import java.util.List;

public class Skill {
    String skillName;
    Dice diceUsed;
    boolean affectsArmorClassRating = false;
    boolean affectsCharacterAttributes = false;
    boolean affectsStatusEffect = false;
    boolean affectsStoryElements = false;
    boolean affectsWeaponProficiency = false;
    boolean affectsArmorProficiency = false;
    boolean affectsWeaknessList = false;
    boolean affectsStrengthsList = false;
    List<CharacterAttributes> characterAttributesAffected;
    List<StoryElement> storyElementsAffected;
    List<String> weaknessesAffected;
    List<String> strengthsAffected;
    int costToLevelUp;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Dice getDiceUsed() {
        return diceUsed;
    }

    public void setDiceUsed(Dice diceUsed) {
        this.diceUsed = diceUsed;
    }

    public boolean isAffectsArmorClassRating() {
        return affectsArmorClassRating;
    }

    public void setAffectsArmorClassRating(boolean affectsArmorClassRating) {
        this.affectsArmorClassRating = affectsArmorClassRating;
    }

    public boolean isAffectsCharacterAttributes() {
        return affectsCharacterAttributes;
    }

    public void setAffectsCharacterAttributes(boolean affectsCharacterAttributes) {
        this.affectsCharacterAttributes = affectsCharacterAttributes;
    }

    public boolean isAffectsStatusEffect() {
        return affectsStatusEffect;
    }

    public void setAffectsStatusEffect(boolean affectsStatusEffect) {
        this.affectsStatusEffect = affectsStatusEffect;
    }

    public boolean isAffectsStoryElements() {
        return affectsStoryElements;
    }

    public void setAffectsStoryElements(boolean affectsStoryElements) {
        this.affectsStoryElements = affectsStoryElements;
    }

    public boolean isAffectsWeaponProficiency() {
        return affectsWeaponProficiency;
    }

    public void setAffectsWeaponProficiency(boolean affectsWeaponProficiency) {
        this.affectsWeaponProficiency = affectsWeaponProficiency;
    }

    public boolean isAffectsArmorProficiency() {
        return affectsArmorProficiency;
    }

    public void setAffectsArmorProficiency(boolean affectsArmorProficiency) {
        this.affectsArmorProficiency = affectsArmorProficiency;
    }

    public boolean isAffectsWeaknessList() {
        return affectsWeaknessList;
    }

    public void setAffectsWeaknessList(boolean affectsWeaknessList) {
        this.affectsWeaknessList = affectsWeaknessList;
    }

    public boolean isAffectsStrengthsList() {
        return affectsStrengthsList;
    }

    public void setAffectsStrengthsList(boolean affectsStrengthsList) {
        this.affectsStrengthsList = affectsStrengthsList;
    }

    public List<CharacterAttributes> getCharacterAttributesAffected() {
        return characterAttributesAffected;
    }

    public void setCharacterAttributesAffected(List<CharacterAttributes> characterAttributesAffected) {
        this.characterAttributesAffected = characterAttributesAffected;
    }

    public List<StoryElement> getStoryElementsAffected() {
        return storyElementsAffected;
    }

    public void setStoryElementsAffected(List<StoryElement> storyElementsAffected) {
        this.storyElementsAffected = storyElementsAffected;
    }

    public List<String> getWeaknessesAffected() {
        return weaknessesAffected;
    }

    public void setWeaknessesAffected(List<String> weaknessesAffected) {
        this.weaknessesAffected = weaknessesAffected;
    }

    public List<String> getStrengthsAffected() {
        return strengthsAffected;
    }

    public void setStrengthsAffected(List<String> strengthsAffected) {
        this.strengthsAffected = strengthsAffected;
    }

    public int getCostToLevelUp() {
        return costToLevelUp;
    }

    public void setCostToLevelUp(int costToLevelUp) {
        this.costToLevelUp = costToLevelUp;
    }
}
