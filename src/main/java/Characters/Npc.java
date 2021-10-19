package Characters;

import Inventory.Item;
import Inventory.Money;
import Story.Dialogue;

import java.util.List;

public class Npc {
    List<Dialogue> possibleDialogue;
    List<Item> lootableItems;
    List<Money> lootableMoney;

    public List<Dialogue> getPossibleDialogue() {
        return possibleDialogue;
    }

    public void setPossibleDialogue(List<Dialogue> possibleDialogue) {
        this.possibleDialogue = possibleDialogue;
    }

    public List<Item> getLootableItems() {
        return lootableItems;
    }

    public void setLootableItems(List<Item> lootableItems) {
        this.lootableItems = lootableItems;
    }

    public List<Money> getLootableMoney() {
        return lootableMoney;
    }

    public void setLootableMoney(List<Money> lootableMoney) {
        this.lootableMoney = lootableMoney;
    }
}
