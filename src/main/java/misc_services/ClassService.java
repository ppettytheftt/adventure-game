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

    private void setCharacterClassForPrint(CharacterClass characterClass, int counter){
        characterClass.setClassName(classNames[counter]);
        characterClass.setDescription(descriptions[counter]);
    }
}
