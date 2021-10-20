package CharacterClasses;

import Skills.Skill;

import java.util.List;

public class ClassAttributes {
    int strengthModifier;
    int dexModifier;
    int intelligenceModifier;
    int wisdomModifier;
    int constitutionModifier;
    int charismaModifier;
    List<Skill> proficientSkills;

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public void setStrengthModifier(int strengthModifier) {
        this.strengthModifier = strengthModifier;
    }

    public int getDexModifier() {
        return dexModifier;
    }

    public void setDexModifier(int dexModifier) {
        this.dexModifier = dexModifier;
    }

    public int getIntelligenceModifier() {
        return intelligenceModifier;
    }

    public void setIntelligenceModifier(int intelligenceModifier) {
        this.intelligenceModifier = intelligenceModifier;
    }

    public int getWisdomModifier() {
        return wisdomModifier;
    }

    public void setWisdomModifier(int wisdomModifier) {
        this.wisdomModifier = wisdomModifier;
    }

    public int getConstitutionModifier() {
        return constitutionModifier;
    }

    public void setConstitutionModifier(int constitutionModifier) {
        this.constitutionModifier = constitutionModifier;
    }

    public int getCharismaModifier() {
        return charismaModifier;
    }

    public void setCharismaModifier(int charismaModifier) {
        this.charismaModifier = charismaModifier;
    }

    public List<Skill> getProficientSkills() {
        return proficientSkills;
    }

    public void setProficientSkills(List<Skill> proficientSkills) {
        this.proficientSkills = proficientSkills;
    }
}
