package MiscServices;

import Characters.CharacterClass;

public class CharacterService {
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
                characterClass.setClassName("spell blade");
                characterClass.setDescription("Spell blades are somewhat like sorcerers, but are also proficient in most simple weapons.\n" +
                        "    Main attribute: Intelligence");
                characterClass.setMainAttribute("intelligence");
                break;
        }
        return characterClass;
    }
}
