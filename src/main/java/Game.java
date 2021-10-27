import BattleMechanics.DiceAndCoinService;
import Characters.PlayerCharacter;
import Map.Area;
import Map.LevelLoader;
import MiscServices.CharacterService;
import MiscServices.LocationService;
import MiscServices.PrinterService;


public class Game {

    public static void startGame() {
        CharacterService characterService = new CharacterService();
        boolean runGame = true;
        PlayerCharacter playerCharacter = new PlayerCharacter();
        PrinterService printerService = new PrinterService();


        while (runGame) {
            boolean nameSet = false;
            printerService.printHeading("WELCOME TO THE GAME, PLEASE EMAIL ME WITH ANY COMMENTS AT PPETTYTHEFTT@GMAIL.COM");

            while (!nameSet) {
                playerCharacter.setName(printerService.getUserTextInput("Please name your character :"));
                if (playerCharacter.getName() != null) {
                    nameSet = true;
                }
            }

            printerService.printCharacterClassNamesAndDescriptions();
            playerCharacter.setCharacterClass(characterService.getCharacterClassFromUserChoice(printerService.getUserNumberInput()));

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
        LevelLoader levelLoader = new LevelLoader();
        LocationService locationService = new LocationService();
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        PrinterService printerService = new PrinterService();
        Area currentArea = levelLoader.loadMainRoad();
        String[] areaList = {"Main Road", "Bazaar", "Tavern", "Church", "Castle Gates"};
        String[] mainMenu = {"Move", "Look", "Talk", "Check Inventory", "Check Skills", "Check Status"};
        boolean inLevelOne = true;

        while (inLevelOne) {
            printerService.printHeading("You are walking down the main road in the Reindt Stronghold, a massive castle deep\n" +
                    "in the heart of the main continent. You currently don't have any objectives and are looking\n" +
                    "for any work available from the locals. You look to see what's around.");
            printerService.createWhiteSpace(1);

            for (int i = 0; i < mainMenu.length; i++) {
                System.out.println((i + 1) + " " + mainMenu[i]);
            }
            int mainMenuChoice = printerService.getUserNumberInput();

            boolean inMainMenu = true;
            while (inMainMenu) {
                if (mainMenuChoice == 1) {

                    int counter = 1;
                    System.out.println("Please choose an option to move to.");
                    printerService.createWhiteSpace(1);
                    for (String area : areaList) {
                        System.out.println(counter + " )  " + area);
                        counter++;
                    }
                    int choiceForMove = printerService.getUserNumberInput();
                    currentArea = locationService.loadMovingChoice(choiceForMove);
                    System.out.println(currentArea.getOpeningText());
                } else if (mainMenuChoice == 2) {
                    printerService.createWhiteSpace(2);
                    diceAndCoinService.rollForLook(currentArea);
                    printerService.createWhiteSpace(1);
                    break;
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
}
