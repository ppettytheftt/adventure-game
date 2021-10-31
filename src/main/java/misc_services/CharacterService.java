package misc_services;

import characters.CharacterClass;

public class CharacterService {
    public CharacterClass getCharacterClassFromUserChoice(int playerChoice) {
        CharacterClass characterClass = new CharacterClass();
        //Here in the character service, we need to also set the different attributes pertaining to characterClasses.
        //Anytime we want to add a new class we will just need to do it here and in the Game class to add it to the
        //list of possible choices for the player to choose. This should speed up implementing a new class.

        //Also maybe this entire class can be merged with ClassService???

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
}
