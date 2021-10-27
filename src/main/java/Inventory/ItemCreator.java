package Inventory;

public class ItemCreator {
    public Item createMinorPotion() {
        Money value = new Money();
        value.setCopper(5);
        Item minorPotion = new Item();
        minorPotion.setName("Minor Potion");
        minorPotion.setDescription("A small potion that can cure up to 5hp");
        minorPotion.setCanBeSold(true);
        minorPotion.setValue(value);

        return minorPotion;
    }
}
