package CharacterClasses.ClassBuilders;

import CharacterClasses.ArmorProficiency;
import CharacterClasses.CharacterClass;
import CharacterClasses.ClassAttributes;
import CharacterClasses.WeaponProficiency;
import Gamelogic.Dice;
import Skills.Skill;

import java.util.List;

public class Barbarian {

    List<ArmorProficiency> armorProficiencyList;
    List<Skill> skillList;
    String description = "Barbarians, different as they might be, are defined by their rage: unbridled, unquenchable," +
            " and unthinking fury. More than a mere emotion, " +
            "their anger is the ferocity of a cornered predator, the unrelenting assault of a storm, the churning turmoil of the sea.";
    List<WeaponProficiency> weaponProficiencies;


    public void createBarbarian() {
        CharacterClass barbarian = new CharacterClass();

        barbarian.setClassName("barbarian");
        barbarian.setBaseAttributes(createClassAttributes());
        barbarian.setArmorProficiencies(createArmorProficiencyList());
        barbarian.setDescription(description);
        barbarian.setBaseSkills(createSkillList());
        barbarian.setClassWeaknessList(null);
        barbarian.setClassStrongAgainstList(null);
        barbarian.setWeaponProficiencies(createWeaponProficiencyList());
    }

    private ClassAttributes createClassAttributes() {
        ClassAttributes attributeBonuses = new ClassAttributes();
        attributeBonuses.setStrengthModifier(2);
        attributeBonuses.setCharismaModifier(0);
        attributeBonuses.setConstitutionModifier(1);
        attributeBonuses.setDexModifier(0);
        attributeBonuses.setWisdomModifier(0);
        attributeBonuses.setIntelligenceModifier(0);

        return attributeBonuses;
    }

    private List<ArmorProficiency> createArmorProficiencyList() {
        ArmorProficiency lightArmor = new ArmorProficiency();
        ArmorProficiency mediumArmor = new ArmorProficiency();
        ArmorProficiency shields = new ArmorProficiency();

        lightArmor.setProficiencyType("light armor");
        lightArmor.setDescription("Barbarians can use light armor to increase their AC rating.");
        mediumArmor.setProficiencyType("mediumArmor");
        mediumArmor.setDescription("Barbarians can use medium armor to increase their AC rating.");
        shields.setProficiencyType("shields");
        shields.setDescription("Barbarians can use shields to increase their AC rating.");

        armorProficiencyList.add(lightArmor);
        armorProficiencyList.add(mediumArmor);
        armorProficiencyList.add(shields);

        return armorProficiencyList;
    }

    private List<WeaponProficiency> createWeaponProficiencyList() {
        WeaponProficiency simpleWeapons = new WeaponProficiency();
        WeaponProficiency martialWeapons = new WeaponProficiency();

        simpleWeapons.setProficiencyType("simple weapons");
        martialWeapons.setProficiencyType("martial weapons");
        weaponProficiencies.add(simpleWeapons);
        weaponProficiencies.add(martialWeapons);
        return weaponProficiencies;
    }

    private List<Skill> createSkillList() {
        Skill rage = new Skill();
        Skill unarmoredDefense = new Skill();
        Dice damageDice = new Dice();
        damageDice.setNumberOfSides(3);

        rage.setSkillName("rage");
        rage.setAffectsArmorClassRating(true);
        rage.setAffectsCharacterAttributes(true);
        rage.setDiceUsed(damageDice);
        unarmoredDefense.setSkillName("unarmored defense");
        unarmoredDefense.setAffectsCharacterAttributes(true);

        skillList.add(rage);
        skillList.add(unarmoredDefense);

        return skillList;

//        While raging, you gain the following benefits if you aren’t wearing heavy armor:
//
//        You have advantage on Strength checks and Strength saving throws.
//        When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.
//        You have resistance to bludgeoning, piercing, and slashing damage.

//        Unarmored Defense
//
//        While you are not wearing any armor, your Armor Class equals 10 + your Dexterity
//    modifier + your Constitution modifier. You can use a shield and still gain this benefit.
    }
}
