package StatusEffect;

import Attributes.CharacterAttributes;
import Attributes.RacialAttributes;

public class StatusEffect {
    String name;
    String description;
    int numberOfPointsAffected;
    boolean affectsArmorClassRating;
    boolean affectsCharacterAttributes;
    CharacterAttributes characterAttributesAffected;
    boolean affectsRacialAttributes;
    RacialAttributes racialAttributesAffected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfPointsAffected() {
        return numberOfPointsAffected;
    }

    public void setNumberOfPointsAffected(int numberOfPointsAffected) {
        this.numberOfPointsAffected = numberOfPointsAffected;
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

    public CharacterAttributes getCharacterAttributesAffected() {
        return characterAttributesAffected;
    }

    public void setCharacterAttributesAffected(CharacterAttributes characterAttributesAffected) {
        this.characterAttributesAffected = characterAttributesAffected;
    }

    public boolean isAffectsRacialAttributes() {
        return affectsRacialAttributes;
    }

    public void setAffectsRacialAttributes(boolean affectsRacialAttributes) {
        this.affectsRacialAttributes = affectsRacialAttributes;
    }

    public RacialAttributes getRacialAttributesAffected() {
        return racialAttributesAffected;
    }

    public void setRacialAttributesAffected(RacialAttributes racialAttributesAffected) {
        this.racialAttributesAffected = racialAttributesAffected;
    }
}
