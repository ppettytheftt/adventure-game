package MiscServices;

import Characters.NonPlayerCharacter;
import Map.Area;

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

    private static void continueConversation() {
        boolean userEnteredAnything = false;

        while (!userEnteredAnything) {
            printerService.createWhiteSpace(1);
            printerService.getUserTextInput("** Enter any text to continue conversation. **");

            userEnteredAnything = true;
        }
    }

    private static void endConversation() {
        printerService.createWhiteSpace(2);
        printerService.getUserTextInput("** Enter anything to end the conversation. **");
    }
}
