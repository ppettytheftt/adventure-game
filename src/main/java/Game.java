import BattleMechanics.DiceAndCoinService;
import Characters.CharacterClass;
import Characters.Npc;
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

    private static void loadLevelOne(){
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
            boolean inMoveMenu = true;
            while(inMoveMenu) {
                int counter = 1;
                System.out.println("Please choose an option to move to.");

                for (String area : areaList) {
                    System.out.println(counter + ")  " + area);
                    counter++;
                }
                int choiceForMove = printerService.getUserNumberInput();
                currentArea = loadMovingChoice(choiceForMove);
                System.out.println(currentArea.getOpeningText());
                inMoveMenu = false;
            }
        } else if (mainMenuChoice == 2){
            rollForLook(currentArea);
        } else if (mainMenuChoice == 3){
            boolean inTalkMenu = true;
            while(inTalkMenu){
                //need to create menu logic
                //Going to iterate over the arraylist of possible npcs, grabbing the name for options to the player
                //then matching the possible dialogue to responses to the player to simulate conversation.
            }
        }


    }

    private static Area loadMovingChoice(int choiceForMove) {
        Area newCurrentArea = new Area();
        switch (choiceForMove){
            case 1: newCurrentArea = loadMainRoad();
            break;

            case 2: newCurrentArea = loadBazaar();
            break;

            case 3: newCurrentArea = loadTavern();
            break;

            case 4: newCurrentArea = loadChurch();
            break;

            case 5: newCurrentArea = loadCastleGates();
            break;
        }
        return newCurrentArea;
    }

    private static Area loadMainRoad() {
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

    private static Area loadBazaar() {
        Area bazaar = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        areaList.add("Main Road");
        areaList.add("Tavern");
        areaList.add("Church");
        areaList.add("Castle Gates");
        lookOutcomes.add("There's A lot for sale here... as much as I wish I could buy, I need work first");
        lookOutcomes.add("This is quite a large place. I wonder what's around.");
        lookOutcomes.add("The church bells are quite loud. I wonder if anyone there has any work?");
        lookOutcomes.add("The tavern seems like a good place to look for work. I'm sure there's a lot of shady characters\n" +
                "needing a hand.");

        bazaar.setAreaName("Bazaar");
        bazaar.setOpeningText("The bazaar of the Reindt Stronghold. There are many merchants lining the streets \n" +
                "selling many different things here. Looks like there's nothing that would be too hard to find here.\n" +
                "After I find some work I should look into upgrading my gear here.");
        bazaar.setNextAreas(areaList);
        bazaar.setDiceForRolls(4);
        bazaar.setPossibleLookOutcomes(lookOutcomes);

        return bazaar;
    }

    private static Area loadTavern() {
        Area tavern = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        List<Npc> listOfNpcs = new ArrayList<>();
        areaList.add("Main Road");
        areaList.add("Bazaar");
        areaList.add("Church");
        areaList.add("Castle Gates");
        lookOutcomes.add("It's quite noisy in here. Many patrons seem to be yelling over each other.");
        lookOutcomes.add("What did I just step in?");
        lookOutcomes.add("I can see a few people here who look like they might have some work.");
        lookOutcomes.add("I should ask around for work.");

        tavern.setAreaName("Bazaar");
        tavern.setOpeningText("The tavern in the Reindt Stronghold. There are many people packed into the establishment \n" +
                "talking over one another. I'm sure someone has to have some work around here. I see a few people sitting\n" +
                "alone. Perhaps other travelers. I may be able to ask the bartender if anyone has been looking for work.");
        tavern.setNextAreas(areaList);
        tavern.setDiceForRolls(4);
        tavern.setPossibleLookOutcomes(lookOutcomes);
        Npc shadyCharacter = new Npc();
        shadyCharacter.setName("Shady character");
        //need to create other npcs to interact with for loading the tavern. Also need to set the other values in order to create the next
        //menu option

        return tavern;
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

    private static void rollForLook(Area currentArea) {
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        List<String> lookList = currentArea.getPossibleLookOutcomes();
        int diceRoll = diceAndCoinService.rollDice(currentArea.getDiceForRolls());
        System.out.println(lookList.get(diceRoll));
    }
}
