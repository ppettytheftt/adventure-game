package map;

import characters.NonPlayerCharacter;
import java.util.ArrayList;
import java.util.List;

public class LevelOneLoader {

    private static final String BAZAAR_NAME = "Bazaar";
    private static final String TAVERN_NAME = "Tavern";
    private static final String CHURCH_NAME = "Church";
    private static final String CASTLE_GATES_NAME = "Castle Gates";
    private static final String MAIN_ROAD_NAME = "Main Road";
    private static final String ASK_FOR_WORK = "I should ask around for work.";

    public Area loadMainRoad() {
        Area mainRoad = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        areaList.add(BAZAAR_NAME);
        areaList.add(TAVERN_NAME);
        areaList.add(CHURCH_NAME);
        areaList.add(CASTLE_GATES_NAME);
        lookOutcomes.add("Nothing really interesting around.");
        lookOutcomes.add("This is quite a large place. I wonder what's around.");
        lookOutcomes.add("The church bells are quite loud. I wonder if anyone there has any work?");
        lookOutcomes.add("The tavern seems like a good place to look for work. I'm sure there's a lot of shady characters\n" +
                "needing a hand.");

        mainRoad.setAreaName(MAIN_ROAD_NAME);
        mainRoad.setOpeningText("The main road of the Reindt Stronghold. You see the massive castle to the north, the \n" +
                "castle gates to the south, the bazaar in the east, and a church and tavern to the west.\nThere's " +
                "a good amount of traffic on this road, not surprising as this stronghold is the capital\nof trade.");
        mainRoad.setNextAreas(areaList);
        mainRoad.setDiceForRolls(4);
        mainRoad.setPossibleLookOutcomes(lookOutcomes);

        return mainRoad;
    }

    public Area loadBazaar() {
        Area bazaar = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        areaList.add(MAIN_ROAD_NAME);
        areaList.add(TAVERN_NAME);
        areaList.add(CHURCH_NAME);
        areaList.add(CASTLE_GATES_NAME);
        lookOutcomes.add("There's a lot for sale here... as much as I wish I could buy, I need work first");
        lookOutcomes.add("This is quite a large place. I wonder what's around.");
        lookOutcomes.add("The church bells are quite loud. I wonder if anyone there has any work?");
        lookOutcomes.add("The tavern seems like a good place to look for work. I'm sure there's a lot of shady characters\n" +
                "needing a hand.");

        bazaar.setAreaName(BAZAAR_NAME);
        bazaar.setOpeningText("The bazaar of the Reindt Stronghold. There are many merchants lining the streets " +
                "selling\nmany different things here. Looks like there's nothing that would be too hard to find here.\n" +
                "After I find some work I should look into upgrading my gear here.");
        bazaar.setNextAreas(areaList);
        bazaar.setDiceForRolls(4);
        bazaar.setPossibleLookOutcomes(lookOutcomes);

        return bazaar;
    }

    public Area loadTavern() {
        Area tavern = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        List<NonPlayerCharacter> listOfNpcs = new ArrayList<>();
        areaList.add(MAIN_ROAD_NAME);
        areaList.add(BAZAAR_NAME);
        areaList.add(CHURCH_NAME);
        areaList.add(CASTLE_GATES_NAME);
        lookOutcomes.add("It's quite noisy in here. Many patrons seem to be yelling over each other.");
        lookOutcomes.add("What did I just step in?");
        lookOutcomes.add("I can see a few people here who look like they might have some work.");
        lookOutcomes.add(ASK_FOR_WORK);

        tavern.setAreaName(TAVERN_NAME);
        tavern.setOpeningText("The tavern in the Reindt Stronghold. There are many people packed into the establishment " +
                "talking over\none another. I'm sure someone has to have some work around here. I see a few people sitting\n" +
                "alone. Perhaps other travelers. I may be able to ask the bartender if anyone has been\nlooking for work.");
        tavern.setNextAreas(areaList);
        tavern.setDiceForRolls(4);
        tavern.setPossibleLookOutcomes(lookOutcomes);

        NonPlayerCharacter shadyCharacter = new NonPlayerCharacter();
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

        NonPlayerCharacter bartender = new NonPlayerCharacter();
        bartender.setName("Shady character");

        List<String> npcResponsesBartender = new ArrayList<>();
        npcResponsesBartender.add("Just a rat problem out at the western farm.. I think they were looking for someone to take them out.");
        npcResponsesBartender.add("Great. I'm sure it will be greatly appreciated. You'll have to go out the castle gates in order\n" +
                "to get there. Here, take this pass so you can exit the gates.");
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

    public Area loadChurch() {
        Area church = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        List<NonPlayerCharacter> listOfNpcs = new ArrayList<>();
        areaList.add(MAIN_ROAD_NAME);
        areaList.add(BAZAAR_NAME);
        areaList.add(TAVERN_NAME);
        areaList.add(CASTLE_GATES_NAME);
        lookOutcomes.add("It's quiet, minus a few prayers being whispered and hymns being hummed. There's a\n" +
                "few people working around here and a priest sitting on the bench in the front row." +
                "\nMaybe he has some work for me?");
        lookOutcomes.add("Nothing really interesting.");
        lookOutcomes.add("There's a man sitting in the front pew.. He seems pretty important. Maybe I should speak with him.");
        lookOutcomes.add(ASK_FOR_WORK);

        church.setAreaName(CHURCH_NAME);
        church.setOpeningText("The church in the Reindt Stronghold. It seems pretty empty for the most part with only a few \n" +
                "people either sitting in the pews, or hard at work with the many day to day duties in the church. Maybe\n" +
                "I can find someone here that has some work to offer me.");
        church.setNextAreas(areaList);
        church.setDiceForRolls(4);
        church.setPossibleLookOutcomes(lookOutcomes);

        NonPlayerCharacter priest = new NonPlayerCharacter();
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

        NonPlayerCharacter brotherCaine = new NonPlayerCharacter();
        brotherCaine.setName("Monk");

        List<String> brotherCaineResponses = new ArrayList<>();
        brotherCaineResponses.add("Yes, my son. There is an ancient tome I have been searching for. It is a book of magic given to us\n" +
                "by Eldath, and needs to be brought to the church. Are you ready for this task?");
        brotherCaineResponses.add("Wonderful. I will give you some healing items for your journey.");
        brotherCaineResponses.add("Go now to the castle gates, you can use this gate pass in order to get there. You will find a mural with the secret map\n" +
                "to where it is being held. Time is of the essense. There are many after this tome.");
        brotherCaine.setResponsesToUser(brotherCaineResponses);

        List<String> playerDialogueBrotherCaine = new ArrayList<>();
        playerDialogueBrotherCaine.add("Hello.. are you Brother Caine? I'm looking for work.");
        playerDialogueBrotherCaine.add("I will bring back the tome.");
        brotherCaine.setPossibleDialogue(playerDialogueBrotherCaine);
        listOfNpcs.add(brotherCaine);

        church.setNpcList(listOfNpcs);

        return church;
    }

    public Area loadCastleGates() {
        Area castleGates = new Area();
        List<String> areaList = new ArrayList<>();
        List<String> lookOutcomes = new ArrayList<>();
        List<NonPlayerCharacter> listOfNpcs = new ArrayList<>();
        areaList.add(MAIN_ROAD_NAME);
        areaList.add(BAZAAR_NAME);
        areaList.add(TAVERN_NAME);
        areaList.add(CHURCH_NAME);
        lookOutcomes.add("The castle gates are massive. Many guards are posted at the entrance. Security has been tightened for some reason.");
        lookOutcomes.add("Nothing really interesting.");
        lookOutcomes.add("I should probably find somewhere to be. I don't want to look suspicious with how on edge the guards are.");
        lookOutcomes.add(ASK_FOR_WORK);

        castleGates.setAreaName(CASTLE_GATES_NAME);
        castleGates.setOpeningText("The castle gates of the Reindt Stronghold. A very impressive structure. It looks like security\n" +
                "has been fortified. I'm not sure what's got the guards on high alert, but I hope that I'm able\n to leave" +
                "the stronghold if I need to.");
        castleGates.setNextAreas(areaList);
        castleGates.setDiceForRolls(4);
        castleGates.setPossibleLookOutcomes(lookOutcomes);

        NonPlayerCharacter gateGuard = new NonPlayerCharacter();
        gateGuard.setName("Gate Guard");

        List<String> npcResponses = new ArrayList<>();
        npcResponses.add("Halt. Do have your gate pass?");
        npcResponses.add("You cannot pass, Stranger. With current threats to the stronghold, we are locked down.");
        npcResponses.add("Okay, you may pass. Please be careful out there.. you don't know what you might find.");
        gateGuard.setResponsesToUser(npcResponses);

        List<String> playerDialogue = new ArrayList<>();
        playerDialogue.add("Hello, I'd like to pass.");
        playerDialogue.add("No... I don't. is there any way I can get through?");
        gateGuard.setPossibleDialogue(playerDialogue);
        listOfNpcs.add(gateGuard);

        castleGates.setNpcList(listOfNpcs);

        return castleGates;
    }


}
