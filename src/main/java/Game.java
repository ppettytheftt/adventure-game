import BattleMechanics.DiceAndCoinService;
import Characters.CharacterClass;
import Characters.PlayerCharacter;
import Map.Area;
import MiscServices.PrinterService;

import java.util.List;

import static Map.LevelLoader.*;

public class Game {


    public static void startGame() {
        boolean runGame = true;
        PlayerCharacter playerCharacter = new PlayerCharacter();
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        PrinterService printerService = new PrinterService();
        String[] classArray = {"thief", "knight", "spell blade"};

        while (runGame) {
            boolean nameSet = false;
            printerService.printHeading("WELCOME TO THE GAME, PLEASE EMAIL ME WITH ANY COMMENTS AT PPETTYTHEFTT@GMAIL.COM");

            while(!nameSet){
                playerCharacter.setName(printerService.getUserTextInput("Please name your character :"));
                if(playerCharacter.getName() != null){
                    nameSet = true;
                }
            }
            printClasses(classArray);
            playerCharacter.setCharacterClass(getCharacterClass(printerService.getUserNumberInput()));

            printerService.printHeading("You have chosen the " + playerCharacter.getCharacterClass().getClassName());
            String classContinueChoice = printerService.getUserTextInput("Do you wish to continue?");
            if (classContinueChoice.equals("no")) {
                System.out.println("Please Rerun The Game");
                runGame = false;
            }

            loadLevelOne();


        }
    }

    private static void loadLevelOne() {

        PrinterService printerService = new PrinterService();
        Area currentArea = loadMainRoad();
        String[] areaList = {"Main Road", "Bazaar", "Tavern", "Church", "Castle Gates"};
        String[] mainMenu = {"Move", "Look", "Talk", "Check Inventory", "Check Skills", "Check Status"};
        boolean inLevelOne = true;

        while (inLevelOne) {
            printerService.printHeading("You are walking down the main road in the Reindt Stronghold, a massive castle deep\n" +
                    "in the heart of the main continent. You currently don't have any objectives and are looking\n" +
                    "for any work available from the locals. You look to see what's around.");

            for (int i = 0; i < mainMenu.length; i++) {
                System.out.println((i + 1) + " " + mainMenu[i]);
            }
            int mainMenuChoice = printerService.getUserNumberInput();


            boolean inMainMenu = true;
            while (inMainMenu) {
                if (mainMenuChoice == 1) {

                    int counter = 1;
                    System.out.println("Please choose an option to move to.");
                    for (String area : areaList) {
                        System.out.println(counter + " )  " + area);
                        counter++;
                    }
                    int choiceForMove = printerService.getUserNumberInput();
                    currentArea = loadMovingChoice(choiceForMove);
                    System.out.println(currentArea.getOpeningText());
                } else if (mainMenuChoice == 2) {
                    rollForLook(currentArea);
                } else if (mainMenuChoice == 3) {
                    boolean inTalkMenu = true;
                    while (inTalkMenu) {
                        //need to create menu logic
                        //Going to iterate over the arraylist of possible npcs, grabbing the name for options to the player
                        //then matching the possible dialogue to responses to the player to simulate conversation.
                    }
                }
            }
        }
    }

    private static Area loadMovingChoice(int choiceForMove) {

        Area newCurrentArea = new Area();
        switch (choiceForMove) {
            case 1:
                newCurrentArea = loadMainRoad();
                break;

            case 2:
                newCurrentArea = loadBazaar();
                break;

            case 3:
                newCurrentArea = loadTavern();
                break;

            case 4:
                newCurrentArea = loadChurch();
                break;

            case 5:
                newCurrentArea = loadCastleGates();
                break;
        }
        return newCurrentArea;
    }

    private static CharacterClass getCharacterClass(int playerChoice) {
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

    private static void printClasses(String[] classArray) {
        for (int i = 0; i < classArray.length; i++) {
            System.out.println(i + 1 + " ) " + classArray[i]);
        }
    }

    private static void rollForLook(Area currentArea) {
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        List<String> lookList = currentArea.getPossibleLookOutcomes();
        int diceRoll = diceAndCoinService.rollDice(currentArea.getDiceForRolls());

        System.out.println(lookList.get(diceRoll -1));
    }
}
