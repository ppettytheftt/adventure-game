package misc_services;

import characters.CharacterClass;

import java.util.ArrayList;
import java.util.List;

public class ClassService {
    private static final String[] classNames = {"Thief", "Knight", "Spellblade"};
    private static final String[] descriptions = {
            "Thieves hide in the shadows and ambush their prey.\n    Main attribute: Dexterity",
            "Knights use raw strength to carry out their will.\n    Main attribute: Strength",
            "Spell blades are somewhat like sorcerers, but are also proficient in most simple weapons.\n" +
                    "    Main attribute: Intelligence"
    };

    public List<CharacterClass> getAllClassesForPrint() {

        List<CharacterClass> listToReturn = new ArrayList<>();
        CharacterClass thief = new CharacterClass();
        listToReturn.add(thief);
        CharacterClass knight = new CharacterClass();
        listToReturn.add(knight);
        CharacterClass spellblade = new CharacterClass();
        listToReturn.add(spellblade);

        for(int i = 0; i < listToReturn.size(); i ++) {
            CharacterClass classToSet = listToReturn.get(i);
            setCharacterClassForPrint(classToSet, i);
        }
        return listToReturn;
    }

    public CharacterClass getCharacterClassFromUserChoice(int playerChoice) {
        CharacterClass characterClass = new CharacterClass();

        switch (playerChoice) {
            case 1:
                characterClass.setClassName("Thief");
                characterClass.setDescription("Thieves hide in the shadows and ambush their prey.\n    Main attribute: Dexterity");
                characterClass.setMainAttribute("dexterity");
                break;

            case 2:
                characterClass.setClassName("Knight");
                characterClass.setDescription("Knights use raw strength to carry out their will.\n    Main attribute: Strength");
                characterClass.setMainAttribute("strength");
                break;
            case 3:
                characterClass.setClassName("Spell Blade");
                characterClass.setDescription("Spell blades are somewhat like sorcerers, but are also proficient in most simple weapons.\n" +
                        "    Main attribute: Intelligence");
                characterClass.setMainAttribute("intelligence");
                break;
        }
        return characterClass;
    }

    private void setCharacterClassForPrint(CharacterClass characterClass, int counter){
        characterClass.setClassName(classNames[counter]);
        characterClass.setDescription(descriptions[counter]);
    }
}
