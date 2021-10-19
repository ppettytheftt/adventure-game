package Passive;

import Attributes.RacialAttributes;
import CharacterClasses.ClassAttributes;
import StatusEffect.StatusEffect;

public class Passive {
    String name;
    String description;
    boolean affectsStatusEffect;
    StatusEffect statusEffectAffected;
    boolean affectsClassAttributes;
    ClassAttributes classAttributesAffected;
    boolean affectsRacialAttributes;
    RacialAttributes racialAttributes;

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

    public boolean isAffectsStatusEffect() {
        return affectsStatusEffect;
    }

    public void setAffectsStatusEffect(boolean affectsStatusEffect) {
        this.affectsStatusEffect = affectsStatusEffect;
    }

    public StatusEffect getStatusEffectAffected() {
        return statusEffectAffected;
    }

    public void setStatusEffectAffected(StatusEffect statusEffectAffected) {
        this.statusEffectAffected = statusEffectAffected;
    }

    public boolean isAffectsClassAttributes() {
        return affectsClassAttributes;
    }

    public void setAffectsClassAttributes(boolean affectsClassAttributes) {
        this.affectsClassAttributes = affectsClassAttributes;
    }

    public ClassAttributes getClassAttributesAffected() {
        return classAttributesAffected;
    }

    public void setClassAttributesAffected(ClassAttributes classAttributesAffected) {
        this.classAttributesAffected = classAttributesAffected;
    }

    public boolean isAffectsRacialAttributes() {
        return affectsRacialAttributes;
    }

    public void setAffectsRacialAttributes(boolean affectsRacialAttributes) {
        this.affectsRacialAttributes = affectsRacialAttributes;
    }

    public RacialAttributes getRacialAttributes() {
        return racialAttributes;
    }

    public void setRacialAttributes(RacialAttributes racialAttributes) {
        this.racialAttributes = racialAttributes;
    }
}
