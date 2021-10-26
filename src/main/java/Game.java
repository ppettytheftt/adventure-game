import BattleMechanics.DiceAndCoinService;
import Characters.CharacterClass;
import Characters.PlayerCharacter;
import Map.Area;
import MiscServices.PrinterService;

import java.util.ArrayList;
import java.util.List;

public class Game {


    public static void startGame() {
        boolean runGame = true;
        PlayerCharacter playerCharacter = new PlayerCharacter();
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        PrinterService printerService = new PrinterService();
        String[] classArray = {"thief", "knight", "spell blade"};

        while (runGame) {
            printerService.printHeading("WELCOME TO THE GAME, PLEASE EMAIL ME WITH ANY COMMENTS AT PPETTYTHEFTT@GMAIL.COM");

            playerCharacter.setName(printerService.getUserTextInput("Please name your character :"));
            printClasses(classArray);
            playerCharacter.setCharacterClass(getCharacterClass(printerService.getUserNumberInput()));

            printerService.printHeading("You have chosen the "+ playerCharacter.getCharacterClass());
            String classContinueChoice = printerService.getUserTextInput("Do you wish to continue?");
            if (classContinueChoice.equals("no")){
                System.out.println("Please Rerun The Game");
                runGame = false;
            }

            loadLevelOne();


        }
    }

    private void loadLevelOne(){
        PrinterService printerService = new PrinterService();
        Area currentArea = loadMainRoad();
        String[] areaList = {"Main Road", "Bazaar", "Tavern", "Church", "Castle Gates"};
        String[] mainMenu = {"Move", "Look", "Talk", "Check Inventory", "Check Skills", "Check Status"};

        printerService.printHeading("You are walking down the main road in the Reindt Stronghold, a massive castle deep\n" +
                "in the heart of the main continent. You currently don't have any objectives and are looking\n" +
                "for any work available from the locals. You look to see what's around.");

        for(int i = 0; i < mainMenu.length; i++){
            System.out.println((i + 1) + " " + mainMenu[i]);
        }
        int mainMenuChoice = printerService.getUserNumberInput();

        if (mainMenuChoice == 1) {
            //Need menu for next area...
        } else if (mainMenuChoice == 2){
            rollForLook(currentArea);
        }


    }

    private Area loadMainRoad() {
        Area mainRoad = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        areaList.add("Bazaar");
        areaList.add("Tavern");
        areaList.add("Church");
        areaList.add("Castle Gates");
        lookOutcomes.add("Nothing really interesting around.");
        lookOutcomes.add("This is quite a large place. I wonder what's around.");
        lookOutcomes.add("The church bells are quite loud. I wonder if anyone there has any work?");
        lookOutcomes.add("The tavern seems like a good place to look for work. I'm sure there's a lot of shady characters\n" +
                "needing a hand.");

        mainRoad.setAreaName("Main Road");
        mainRoad.setOpeningText("The main road of the Reindt Stronghold. You see the massive castle to the north, the \n" +
                "castle gates to the south, the bazaar in the east, and a church and tavern to the west. There's\n" +
                "a good amount of traffic on this road, not surprising as this stronghold is the capital of trade.");
        mainRoad.setNextAreas(areaList);
        mainRoad.setDiceForRolls(4);
        mainRoad.setPossibleLookOutcomes(lookOutcomes);

        return mainRoad;
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
            System.out.println(i + 1);
            System.out.println(classArray[i]);
        }
    }

    private void rollForLook(Area currentArea) {
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        List<String> lookList = currentArea.getPossibleLookOutcomes();
        int diceRoll = diceAndCoinService.rollDice(currentArea.getDiceForRolls());
        System.out.println(lookList.get(diceRoll));
    }
}
