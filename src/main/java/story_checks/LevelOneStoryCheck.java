package story_checks;

import characters.PlayerCharacter;
import inventory.Item;
import java.util.List;

public class LevelOneStoryCheck {

    // Story checks are here to check for the necessary actions or items to progress to the next area. Really easy for
    // keys or enemies being killed to be implemented as story checks, but if there's a more creative way to
    // add a check to the story we should definitely do that.

    public boolean gatePassCheck(PlayerCharacter playerCharacter) {
        boolean hasGatePass = false;
        List<Item> playerInventory = playerCharacter.getInventory();
        for (Item inventoryItem: playerInventory){
            if(inventoryItem.getName().equals("Gate Pass")){
                hasGatePass = true;
                break;
            }
        }
        return hasGatePass;
    }
}
