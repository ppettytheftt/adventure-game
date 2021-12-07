package misc_services;

import characters.NonPlayerCharacter;
import characters.PlayerCharacter;
import map.Area;
import story_checks.LevelOneStoryCheck;

import java.util.List;

public class DialogueService {

    static PrinterService printerService = new PrinterService();
    LocationService locationService = new LocationService();


    public void executePriestConversation() {
        List<Area> areaList = locationService.getAllAreasLevelOne();
        NonPlayerCharacter priest = areaList.get(3).getNpcList().get(0);

        List<String> priestDialogue = priest.getResponsesToUser();
        List<String> playerCharacterDialogue = priest.getPossibleDialogue();

        System.out.println(playerCharacterDialogue.get(0));
        System.out.println(priest.getName() + " : " + priestDialogue.get(0));
        continueConversation();
        System.out.println(playerCharacterDialogue.get(1));
        System.out.println(priest.getName() + " : " + priestDialogue.get(1));
        endConversation();

    }

    public void executeBrotherCaineConversation() {
        List<Area> areaList = locationService.getAllAreasLevelOne();
        NonPlayerCharacter brotherCaine = areaList.get(3).getNpcList().get(1);

        List<String> brotherCaineDialogue = brotherCaine.getResponsesToUser();
        List<String> playerCharacterDialogue = brotherCaine.getPossibleDialogue();

        System.out.println(playerCharacterDialogue.get(0));
        System.out.println(brotherCaine.getName() + " : " + brotherCaineDialogue.get(0));
        continueConversation();
        System.out.println(playerCharacterDialogue.get(1));
        System.out.println(brotherCaine.getName() + " : " + brotherCaineDialogue.get(1));
        System.out.println(brotherCaine.getName() + " : " + brotherCaineDialogue.get(2));
        endConversation();
    }

    public void executeGateGuardConversation(PlayerCharacter playerCharacter) {
        LevelOneStoryCheck levelOneStoryCheck = new LevelOneStoryCheck();
        List<Area> areaList = locationService.getAllAreasLevelOne();
        NonPlayerCharacter gateGuard = areaList.get(4).getNpcList().get(0);

        List<String> gateGuardResponses = gateGuard.getResponsesToUser();
        List<String> playerDialogue = gateGuard.getPossibleDialogue();

        System.out.println(playerDialogue.get(0));
        System.out.println(gateGuard.getName() + " : " + gateGuardResponses.get(0));
        printerService.createWhiteSpace(1);
        boolean checkStatus = levelOneStoryCheck.gatePassCheck(playerCharacter);
        continueConversation();

        if (checkStatus) {
            // true
            System.out.println(gateGuardResponses.get(2));
            printerService.createWhiteSpace(1);
        } else {
            // false
            System.out.println(playerDialogue.get(1));
            System.out.println(gateGuardResponses.get(1));
        }
        endConversation();
    }

    private static void continueConversation() {
        boolean userEnteredAnything = false;

        while (!userEnteredAnything) {
            printerService.createWhiteSpace(1);
            printerService.getUserTextInput("** Enter any text to continue conversation. **");

            userEnteredAnything = true;
        }
    }

    private static void endConversation() {
        boolean userEnteredAnything = false;
        while (!userEnteredAnything) {
            printerService.createWhiteSpace(2);
            printerService.getUserTextInput("** Enter anything to end the conversation. **");
            userEnteredAnything = true;
        }
    }
}
