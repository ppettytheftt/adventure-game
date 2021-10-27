package MiscServices;

import Characters.CharacterClass;

public class CharacterService {
    public CharacterClass getCharacterClassFromUserChoice(int playerChoice) {
        CharacterClass characterClass = new CharacterClass();

        switch (playerChoice) {
            case 1:
                characterClass.setClassName("thief");
                characterClass.setDescription("");
                characterClass.setMainAttribute("dexterity");
                break;

            case 2:
                characterClass.setClassName("knight");
                characterClass.setDescription("");
                characterClass.setMainAttribute("strength");
                break;
            case 3:
                characterClass.setClassName("spell blade");
                characterClass.setDescription("");
                characterClass.setMainAttribute("intelligence");
                break;
        }
        return characterClass;
    }
}
