package StoryChecks;

import Characters.PlayerCharacter;
import Inventory.Item;
import java.util.List;

public class LevelOneStoryCheck {

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
