package Spell;

import Attributes.CharacterAttributes;
import Gamelogic.Dice;
import StatusEffect.StatusEffect;

public class Spell {
    String name;
    String description;
    Dice damageDice;
    boolean affectsStatusEffect;
    StatusEffect statusEffectAffected;
    boolean affectsCharacterAttributes;
    CharacterAttributes characterAttributesAffected;

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

    public Dice getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(Dice damageDice) {
        this.damageDice = damageDice;
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
}
