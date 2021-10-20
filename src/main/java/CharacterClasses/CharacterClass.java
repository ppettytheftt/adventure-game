package CharacterClasses;

import Skills.Skill;

import java.util.List;

public class CharacterClass {
    private String className;
    private String description;
    private ClassAttributes baseAttributes;
    private List<ArmorProficiency> armorProficiencies;
    private List<WeaponProficiency> weaponProficiencies;
    private List<Skill> baseSkills;
    private List<String> classWeaknessList;
    private List<String> classStrongAgainstList;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClassAttributes getBaseAttributes() {
        return baseAttributes;
    }

    public void setBaseAttributes(ClassAttributes baseAttributes) {
        this.baseAttributes = baseAttributes;
    }

    public List<ArmorProficiency> getArmorProficiencies() {
        return armorProficiencies;
    }

    public void setArmorProficiencies(List<ArmorProficiency> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public WeaponProficiency getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public void setWeaponProficiencies(List<WeaponProficiency> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public List<Skill> getBaseSkills() {
        return baseSkills;
    }

    public void setBaseSkills(List<Skill> baseSkills) {
        this.baseSkills = baseSkills;
    }

    public List<String> getClassWeaknessList() {
        return classWeaknessList;
    }

    public void setClassWeaknessList(List<String> classWeaknessList) {
        this.classWeaknessList = classWeaknessList;
    }

    public List<String> getClassStrongAgainstList() {
        return classStrongAgainstList;
    }

    public void setClassStrongAgainstList(List<String> classStrongAgainstList) {
        this.classStrongAgainstList = classStrongAgainstList;
    }
}
