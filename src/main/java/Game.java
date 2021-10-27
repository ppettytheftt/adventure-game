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

            printerService.printHeading("You have chosen the " + playerCharacter.getCharacterClass());
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

        printerService.printHeading("You are walking down the main road in the Reindt Stronghold, a massive castle deep\n" +
                "in the heart of the main continent. You currently don't have any objectives and are looking\n" +
                "for any work available from the locals. You look to see what's around.");

        for (int i = 0; i < mainMenu.length; i++) {
            System.out.println((i + 1) + " " + mainMenu[i]);
        }
        int mainMenuChoice = printerService.getUserNumberInput();

        if (mainMenuChoice == 1) {
            boolean inMoveMenu = true;
            while (inMoveMenu) {
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

        tavern.setAreaName("Tavern");
        tavern.setOpeningText("The tavern in the Reindt Stronghold. There are many people packed into the establishment \n" +
                "talking over one another. I'm sure someone has to have some work around here. I see a few people sitting\n" +
                "alone. Perhaps other travelers. I may be able to ask the bartender if anyone has been looking for work.");
        tavern.setNextAreas(areaList);
        tavern.setDiceForRolls(4);
        tavern.setPossibleLookOutcomes(lookOutcomes);

        Npc shadyCharacter = new Npc();
        shadyCharacter.setName("Shady character");

        List<String> npcResponses = new ArrayList<>();
        npcResponses.add("Leave me alone stranger.");
        npcResponses.add("You're persistent aren't you?");
        npcResponses.add("Okay, fine.. Looking for work? I have someone asking me to fetch an item for\n" +
                "them from the ruins to the east. I'll be willing to give you a good cut of the profits.");
        shadyCharacter.setResponsesToUser(npcResponses);

        List<String> playerDialogue = new ArrayList<>();
        playerDialogue.add("Hey... I see you're alone. Traveler? I'm looking for work myself and if you have any leads..");
        playerDialogue.add("I'm not really having any luck elsewhere...");
        playerDialogue.add("Count me in. Where can I find it?");
        playerDialogue.add("No thanks, I think I'll keep looking.");
        shadyCharacter.setPossibleDialogue(playerDialogue);
        listOfNpcs.add(shadyCharacter);

        Npc bartender = new Npc();
        bartender.setName("Shady character");

        List<String> npcResponsesBartender = new ArrayList<>();
        npcResponsesBartender.add("Just a rat problem out at the western farm.. I think they were looking for someone to take them out.");
        npcResponsesBartender.add("Great. I'm sure it will be greatly appreciated. You'll have to go out the castle gates in order\n" +
                "to get there. Here, take this pass so you can exit the gates.");
        //Need to remember to create the gate pass check
        npcResponsesBartender.add("No, not that I know of, stranger. Try talking to that shady character over there in the corner.");
        bartender.setResponsesToUser(npcResponsesBartender);

        List<String> playerDialogueBartender = new ArrayList<>();
        playerDialogueBartender.add("Barkeep.. any word on work around here?");
        playerDialogueBartender.add("I can look into it.");
        playerDialogueBartender.add("Rats? Is there anything else that needs done?");
        playerDialogueBartender.add("Thanks for your help.");
        bartender.setPossibleDialogue(playerDialogueBartender);
        listOfNpcs.add(bartender);

        tavern.setNpcList(listOfNpcs);

        return tavern;
    }

    private static Area loadChurch() {
        Area church = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        List<Npc> listOfNpcs = new ArrayList<>();
        areaList.add("Main Road");
        areaList.add("Bazaar");
        areaList.add("Tavern");
        areaList.add("Castle Gates");
        lookOutcomes.add("It's quiet, minus a few prayers being whispered and hymns being hummed. There's a\n" +
                "few people working around here and a priest sitting on the bench in the front row.\n" +
                "Maybe he has some work for me?");
        lookOutcomes.add("Nothing really interesting.");
        lookOutcomes.add("There's a man sitting in the front pew.. He seems pretty important. Maybe I should speak with him.");
        lookOutcomes.add("I should ask around for work.");

        church.setAreaName("Church");
        church.setOpeningText("The church in the Reindt Stronghold. It seems pretty empty for the most part with only a few \n" +
                "people either sitting in the pews, or hard at work with the many day to day duties in the church. Maybe\n" +
                "I can find someone here that has some work to offer me.");
        church.setNextAreas(areaList);
        church.setDiceForRolls(4);
        church.setPossibleLookOutcomes(lookOutcomes);

        Npc priest = new Npc();
        priest.setName("Priest");

        List<String> npcResponses = new ArrayList<>();
        npcResponses.add("Yes.. I believe there is some work that needs to be done. Brother Caine was talking about \n" +
                "a book that needed to be fetched. He seemed very intent on getting it to the church.");
        npcResponses.add("Eldath be with you.");
        priest.setResponsesToUser(npcResponses);

        List<String> playerDialogue = new ArrayList<>();
        playerDialogue.add("Hello, Father. Have you heard of any work that needs to be done around the church?");
        playerDialogue.add("Thank you I will speak with him now.");
        priest.setPossibleDialogue(playerDialogue);
        listOfNpcs.add(priest);

        Npc brotherCaine = new Npc();
        brotherCaine.setName("Monk");

        List<String> brotherCaineResponses = new ArrayList<>();
        brotherCaineResponses.add("Just a rat problem out at the western farm.. I think they were looking for someone to take them out.");
        brotherCaineResponses.add("Great. I'm sure it will be greatly appreciated. You'll have to go out the castle gates in order\n" +
                "to get there. Here, take this pass so you can exit the gates.");
        //Need to remember to create the gate pass check
        brotherCaineResponses.add("No, not that I know of, stranger. Try talking to that shady character over there in the corner.");
        brotherCaine.setResponsesToUser(brotherCaineResponses);

        List<String> playerDialogueBrotherCaine = new ArrayList<>();
        playerDialogueBrotherCaine.add("Barkeep.. any word on work around here?");
        playerDialogueBrotherCaine.add("I can look into it.");
        playerDialogueBrotherCaine.add("Rats? Is there anything else that needs done?");
        playerDialogueBrotherCaine.add("Thanks for your help.");
        brotherCaine.setPossibleDialogue(playerDialogueBrotherCaine);
        listOfNpcs.add(brotherCaine);

        church.setNpcList(listOfNpcs);

        return church;
    }

    private static Area loadCastleGates() {
        Area castleGates = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        List<Npc> listOfNpcs = new ArrayList<>();
        areaList.add("Main Road");
        areaList.add("Bazaar");
        areaList.add("Tavern");
        areaList.add("Church");
        lookOutcomes.add("It's quiet, minus a few prayers being whispered and hymns being hummed. There's a\n" +
                "few people working around here and a gateGuard sitting on the bench in the front row.\n" +
                "Maybe he has some work for me?");
        lookOutcomes.add("Nothing really interesting.");
        lookOutcomes.add("There's a man sitting in the front pew.. He seems pretty important. Maybe I should speak with him.");
        lookOutcomes.add("I should ask around for work.");

        castleGates.setAreaName("Castle Gates");
        castleGates.setOpeningText("The castleGates in the Reindt Stronghold. It seems pretty empty for the most part with only a few \n" +
                "people either sitting in the pews, or hard at work with the many day to day duties in the castleGates. Maybe\n" +
                "I can find someone here that has some work to offer me.");
        castleGates.setNextAreas(areaList);
        castleGates.setDiceForRolls(4);
        castleGates.setPossibleLookOutcomes(lookOutcomes);

        Npc gateGuard = new Npc();
        gateGuard.setName("Gate Guard");

        List<String> npcResponses = new ArrayList<>();
        npcResponses.add("Halt. Do have your gate pass?");
        //if not, you don't pass, if you do you can.
        npcResponses.add("You cannot pass, Stranger. With current threats to the stronghold, we are locked down.");
        gateGuard.setResponsesToUser(npcResponses);

        List<String> playerDialogue = new ArrayList<>();
        playerDialogue.add("Hello, I'd like to pass.");
        playerDialogue.add("Well, okay.");
        gateGuard.setPossibleDialogue(playerDialogue);
        listOfNpcs.add(gateGuard);

        castleGates.setNpcList(listOfNpcs);

        return castleGates;
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
