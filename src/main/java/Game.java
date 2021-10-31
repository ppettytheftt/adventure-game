import battle_mechanics.DiceAndCoinService;
import characters.PlayerCharacter;
import inventory.Item;
import inventory.ItemCreator;
import inventory.Money;
import map.Area;
import map.LevelOneLoader;
import misc_services.CharacterService;
import misc_services.DialogueService;
import misc_services.LocationService;
import misc_services.PrinterService;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private static final PlayerCharacter playerCharacter = new PlayerCharacter();
    public static final ItemCreator itemCreator = new ItemCreator();

    public static void startGame() {

        CharacterService characterService = new CharacterService();
        boolean runGame = true;
        PrinterService printerService = new PrinterService();

        playerCharacter.setInventory(createStartingInventory());

        while (runGame) {
            boolean nameSet = false;
            printerService.printHeading("WELCOME TO THE GAME, PLEASE EMAIL ME WITH ANY COMMENTS OR QUESTIONS AT\n PPETTYTHEFTT@GMAIL.COM");

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
        LevelOneLoader levelOneLoader = new LevelOneLoader();
        LocationService locationService = new LocationService();
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        PrinterService printerService = new PrinterService();
        Area currentArea = levelOneLoader.loadMainRoad();
        String[] areaList = {"Main Road", "Bazaar", "Tavern", "Church", "Castle Gates"};
        String[] mainMenu = {"Move", "Look", "Talk", "Check Inventory", "Check Skills", "Check Status"};
        boolean inLevelOne = true;
        printerService.printHeading("You are walking down the main road in the Reindt Stronghold, a massive castle deep\n" +
                "in the heart of the main continent. You currently don't have any objectives and are looking\n" +
                "for any work available from the locals. You look to see what's around.");

        while (inLevelOne) {
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
                    break;

                } else if (mainMenuChoice == 2) {
                    printerService.createWhiteSpace(2);
                    diceAndCoinService.rollForLook(currentArea);
                    printerService.createWhiteSpace(1);
                    break;

                } else if (mainMenuChoice == 3) {
                    DialogueService dialogueService = new DialogueService();
                    if (currentArea.getAreaName().equals("Church")) {

                        System.out.println("You see a priest and a monk that don't look too busy. Which should I talk to?");
                        System.out.println("1 ) The Priest.");
                        System.out.println("2 ) The Monk.");
                        int talkChoiceChurch = printerService.getUserNumberInput();

                        if (talkChoiceChurch == 1) {
                            dialogueService.executePriestConversation();
                            break;
                        } else if (talkChoiceChurch == 2) {
                            dialogueService.executeBrotherCaineConversation();
                            List<Item> itemsToAddToInventory = playerCharacter.getInventory();
                            itemsToAddToInventory.add(itemCreator.createMinorPotion());
                            itemsToAddToInventory.add(itemCreator.createMinorPotion());
                            playerCharacter.setInventory(itemsToAddToInventory);


                            System.out.println("You have received 2 Minor Potions.");
                            printerService.createWhiteSpace(2);
                            printerService.anythingToContinue();
                            break;
                        } else {
                            System.out.println("That is not a valid option...");
                            printerService.anythingToContinue();
                            break;
                        }
                    } else if(currentArea.getAreaName().equals("Castle Gate")) {
                            dialogueService.executeGateGuardConversation(playerCharacter);
                    } else {
                        System.out.println("There's no one here to talk to.");
                        printerService.anythingToContinue();
                        break;
                    }
                }
            }
        }
    }

    private static List<Item> createStartingInventory() {
        List<Item> listToAdd = new ArrayList<>();
        Item locket = new Item();
        Item water = new Item();
        Money locketValue = new Money();
        locketValue.setGold(10);
        locketValue.setSilver(9);
        locketValue.setCopper(8);

        Money waterValue = new Money();
        waterValue.setCopper(2);

        locket.setName("Locket");
        locket.setDescription("It seems valuable. I can't seem to remember who's pictured inside.");
        locket.setValue(locketValue);
        locket.setCanBeSold(true);

        water.setName("Water");
        water.setDescription("A small gourd containing water. Good for curing burn status.");
        water.setValue(waterValue);
        water.setCanBeSold(true);

        listToAdd.add(locket);
        listToAdd.add(water);

        return listToAdd;
    }
}

